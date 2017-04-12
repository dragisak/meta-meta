package metameta

import scala.annotation.StaticAnnotation
import scala.meta._

/**
  * Adds method foo to the class/trait
  */
class foo extends StaticAnnotation {


  inline def apply(defn: Any): Any = meta {

    defn match {
      case q"object $name { ..$stats }" =>
        val foo = q"""def foo: String = "Some major FOO here !" """

        q"""
          object $name {
              def foo: String = "Some major FOO here !"
              ..$stats
          }
          """
      case _ => abort("@foo must annotate a class, object or trait.")
    }
  }
}

package metameta

import scala.annotation.StaticAnnotation
import scala.meta._

/**
  * Helo world !
  */
class user extends StaticAnnotation {

  inline def apply(defn: Any): Any = meta {
    q"case class User(name: String, age: Int)"
  }
}

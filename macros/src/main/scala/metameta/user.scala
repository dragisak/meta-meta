package metameta

import scala.meta._
import scala.annotation.StaticAnnotation

class user extends StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    q"case class User(name: String, age: Int)"
  }
}
package example

import metameta._

object Main extends App {

  @user class f()

  println(User("foo", 123))
}

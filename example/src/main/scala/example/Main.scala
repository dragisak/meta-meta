package example

import metameta._

object Main extends App {


  @debug def some(i: Int) = i + 1

  @user class f()

  println(User("foo", 123))

  @foo object x {
     def bar = "Yo !"
  }

  println(x.foo)
  println(x.bar)

  some(3)
}

/**
  * Created by nappannda on 2018/01/09.
  */
trait Greeter {
  def greet(): Unit
}

trait Robot {
  self: Greeter =>

  def start(): Unit = greet()
  override final def toString = "Robot"
}

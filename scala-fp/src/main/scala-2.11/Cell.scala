/**
  * Created by nappannda on 2018/01/12.
  */
class Cell[T](var value: T) {

  def put(newValue: T): Unit = {
    value = newValue
  }

  def get(): T = value

}

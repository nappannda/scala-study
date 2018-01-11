/**
  * Created by nappannda on 2018/01/12.
  */
abstract class Show {
  def show: String
}

class ShowablePair[T1 <: Show, T2 <: Show](val t1: T1, val t2: T2) extends Show {
  override def show: String = "(" + t1.show + "," + t2.show + ")"
}
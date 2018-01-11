import scala.annotation.tailrec

/**
  * Created by nappannda on 2018/01/11.
  */
object Main {

  @tailrec
  def series(n: Int, acc: Int): Int = {
    if (n == 0) {
      acc
    } else {
      series(n - 1, acc + n)
    }
  }

  @tailrec
  def fact(n: Int, acc: Int): Int = if (n == 1) acc else fact(n - 1, acc * n)

}

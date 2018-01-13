/**
  * Created by nappannda on 2018/01/14.
  */
trait Additive[A] {
  def plus(a: A, b: A): A
  def zero: A
}

case class Rational(num: Int, den: Int)

object Rational {

  implicit object RationalAdditive extends Additive[Rational] {
    def plus(a: Rational, b: Rational): Rational = {
      if (a == zero) {
        b
      } else if (b == zero) {
        a
      } else {
        Rational(a.num * b.den + b.num * a.den, a.den * b.den)
      }
    }

    def zero: Rational = Rational(0, 0)
  }

}
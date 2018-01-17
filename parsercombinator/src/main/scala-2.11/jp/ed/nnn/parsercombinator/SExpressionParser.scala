package jp.ed.nnn.parsercombinator

import scala.util.parsing.combinator.JavaTokenParsers

/**
  * Created by nappannda on 2018/01/17.
  */
object SExpressionParser extends JavaTokenParsers {

  def sExpression: Parser[Any] =
    atomicSymbol |
      "(" ~ sExpression ~ "." ~ sExpression ~ ")" ^^ (t => (t._1._1._1._2, t._1._2)) |
      list

  def list: Parser[List[Any]] = "(" ~ sExpression ~  rep(sExpression)  ~ ")" ^^ (t => t._1._1._2 :: t._1._2)

  def atomicSymbol: Parser[String] = "[0-9A-z]+".r

  def apply(input: String): Any = parseAll(sExpression, input)


}

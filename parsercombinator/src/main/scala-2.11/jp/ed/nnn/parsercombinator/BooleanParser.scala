package jp.ed.nnn.parsercombinator

/**
  * Created by nappannda on 2018/01/15.
  */
object BooleanParser extends MyFirstCombinator {

  def trueParser: Parser[Boolean] = map(s("true"), { _: String => true })
  def falseParser: Parser[Boolean] = map(s("false"), { _: String => false })

  def apply(input: String): ParseResult[Boolean] =
    select(trueParser, falseParser)(input)
}
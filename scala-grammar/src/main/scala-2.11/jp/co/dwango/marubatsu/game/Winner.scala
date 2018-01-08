package jp.co.dwango.marubatsu.game

/**
  * Created by nappannda on 2018/01/08.
  */
sealed abstract class Winner
case object  NoWinner extends Winner
case object Maru extends Winner
case object Batsu extends Winner
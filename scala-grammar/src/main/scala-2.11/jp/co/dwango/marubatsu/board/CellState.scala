package jp.co.dwango.marubatsu.board

/**
  * Created by nappannda on 2018/01/08.
  */
private[marubatsu] sealed abstract class CellState
private[marubatsu] case object Empty extends CellState
private[marubatsu] case object Maru extends CellState
private[marubatsu] case object Batsu extends CellState
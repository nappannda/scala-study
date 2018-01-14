import scala.reflect.runtime.universe._
/**
  * Created by nappannda on 2018/01/14.
  */
object ReflectionStudy extends App {

  println("========= from class =========")
  println(typeTag[Option[_]].tpe.decls)

  val list = List(1, 2, 3)

  def getTypeTagFromList[T: TypeTag](list: List[T]): TypeTag[T] = {
    typeTag[T]
  }

  println("========= from type parameter =========")
  println(getTypeTagFromList(list).tpe.decls)
}
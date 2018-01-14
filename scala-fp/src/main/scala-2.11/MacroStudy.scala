import language.experimental.macros
import scala.reflect.macros.blackbox.Context
/**
  * Created by nappannda on 2018/01/14.
  */
object MacroStudy {
  def accessor(obj: Any, property: String): Any = macro impl_accessor

  def impl_accessor(c: Context)(obj: c.Expr[Any], property: c.Expr[String]) = {
    import c.universe._
    val Expr(Literal(Constant(propString: String))) = property
    q"${obj}.${TermName(propString)}"
  }
}
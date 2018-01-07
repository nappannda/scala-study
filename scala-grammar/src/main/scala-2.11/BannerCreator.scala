/**
  * Created by nappannda on 2018/01/07.
  */
object BannerCreator {

  private val decor = ".｡:･・.｡:*･★.｡:･・.｡:*･★.｡:･・.｡:*･★.｡:･・.｡:*･★.｡:･・.｡:*･★"

  def create(message: String) = {
    s"""${decor}
       |${message}
       |${decor}""".stripMargin
  }
}

object MessageContainer {
  var message = ""
}

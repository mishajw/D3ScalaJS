import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object TestApp extends JSApp {
  @JSExport
  override def main(): Unit = {
    showMessage("Hello, jQuery!")
  }

  def showMessage(message: String) = {
    jQuery("body")
      .append(s"<div>$message<div>")
  }
}

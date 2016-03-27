import org.scalajs.dom.raw.{Text, Element}

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery


import org.scalajs.dom
import dom.document

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

import org.scalajs.dom.raw.{Text, Element}

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

import org.scalajs.dom
import dom.document

object TestApp extends JSApp {
  @JSExport
  override def main(): Unit = {
    showMessage("Hello, world!")
  }

  def showMessage(message: String) = {
    val div: Element = document.createElement("div")
    val text: Text = document.createTextNode(message)

    div appendChild text
    document.body appendChild div
  }
}

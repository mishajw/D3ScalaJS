import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object TestApp extends JSApp {
  @JSExport
  override def main(): Unit = {
    showMessage("Hello, jQuery!")

    jQuery("body")
      .append(
        jQuery("<button>Press me</button>")
            .attr("id", "main-button")
            .click(() => showMessage("Pressed a button"))
      )
  }

  def showMessage(message: String) = {
    jQuery("body")
      .append(s"<div>$message<div>")
  }
}

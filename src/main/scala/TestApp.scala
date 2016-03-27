import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

import org.singlespaced.d3js.d3
import org.singlespaced.d3js.Ops._

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

    d3.select("#vis")
        .append("svg")
  }

  def showMessage(message: String) = {
    jQuery("body")
      .append(s"<div>$message<div>")
  }
}

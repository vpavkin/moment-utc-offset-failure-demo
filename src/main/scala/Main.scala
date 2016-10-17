import org.widok.moment.{Moment, Units}

import scala.scalajs.js

object Main extends js.JSApp {
  def main() {

    val local = Moment()
    val offset = local.utcOffset()
    local.utc().add(offset, Units.Minute)
  }


}

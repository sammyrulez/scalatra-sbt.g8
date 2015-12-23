package $package$

import org.scalatra._
import org.scalatra.json.NativeJsonSupport
import org.json4s.{DefaultFormats, Formats}

trait $name;format="Camel"$Stack extends ScalatraServlet with  NativeJsonSupport {

    protected implicit lazy val jsonFormats: Formats = DefaultFormats

    before() {
        contentType = formats("json")
    }

    override def error(handler: ErrorHandler): Unit = resourceNotFound()

}

package $package$

import org.scalatra._
import scalate.ScalateSupport
import org.fusesource.scalate.{ TemplateEngine, Binding }
import org.fusesource.scalate.layout.DefaultLayoutStrategy
import javax.servlet.http.HttpServletRequest
import collection.mutable

trait $name;format="Camel"$Stack extends ScalatraServlet with  NativeJsonSupport {

before() {
contentType = formats("json")
}

override def error(handler: ErrorHandler): Unit = resourceNotFound()

}

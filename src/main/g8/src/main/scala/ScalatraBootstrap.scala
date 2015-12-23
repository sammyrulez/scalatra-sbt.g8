import $package$._

import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {

  implicit val swagger = new $name;format="Camel"$Swagger

  override def init(context: ServletContext) {
    context.mount(new $servlet_name$, "/$servlet_name$/*")
    context.mount (new ResourcesApp, "/api-docs")
  }
}

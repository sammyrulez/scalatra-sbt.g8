import $package$._
import agg.ResourcesApp
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {

  implicit val swagger = new $servlet_name$Swagger

  override def init(context: ServletContext) {
    context.mount(new $servlet_name$, "/$servlet_name$/*")
    context.mount (new ResourcesApp, "/api-docs")
  }
}

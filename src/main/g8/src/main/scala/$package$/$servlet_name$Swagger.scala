package agg

import org.scalatra.ScalatraServlet
import org.scalatra.swagger.{ApiInfo, NativeSwaggerBase, Swagger}


class ResourcesApp(implicit val swagger: Swagger) extends ScalatraServlet with NativeSwaggerBase

object $servlet_name$Info extends ApiInfo(
  "The $servlet_name$ API",
  "Docs for $servlet_name$ API",
  "$doc_ref_url$",
  "$doc_ref_main$",
  "MIT",
  "http://opensource.org/licenses/MIT")

class $servlet_name$Swagger extends Swagger(Swagger.SpecVersion, "1.0.0", $servlet_name$Info)

package $package$

import org.scalatra.ScalatraServlet
import org.scalatra.swagger.{ApiInfo, NativeSwaggerBase, Swagger}


class ResourcesApp(implicit val swagger: Swagger) extends ScalatraServlet with NativeSwaggerBase

object $name;format="Camel"$Info extends ApiInfo(
  "The $name;format=\"Camel\"$ API",
  "Docs for $name;format=\"Camel\"$ API",
  "$doc_ref_url$",
  "$doc_ref_main$",
  "MIT",
  "http://opensource.org/licenses/MIT")

class $name;format="Camel"$Swagger extends Swagger(Swagger.SpecVersion, "1.0.0", $name;format="Camel"$Info)

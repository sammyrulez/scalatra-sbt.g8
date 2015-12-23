package $package$

import org.scalatra.swagger.Swagger
import org.scalatra.swagger._

class $servlet_name$(implicit val swagger: Swagger)  extends $name;format="Camel"$Stack  with SwaggerSupport {

protected val applicationDescription = "The flowershop API. It exposes operations for browsing and searching lists of flowers, and retrieving single flowers."

val get$servlet_name$ =
        (apiOperation[List[String]]("get$servlet_name$")
        summary "$servlet_name$ Demo"
        notes "$servlet_name$ demo API")

get("/",operation(get$servlet_name$)) {

    List("$servlet_name$")
}
  
}

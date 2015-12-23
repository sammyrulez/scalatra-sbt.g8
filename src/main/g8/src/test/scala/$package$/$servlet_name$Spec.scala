package $package$

import org.scalatra.test.scalatest._
import org.scalatest.FunSuiteLike

class $servlet_name$Spec extends ScalatraSuite with FunSuiteLike  {


  implicit val swagger = new $servlet_name$Swagger

  addServlet(new $servlet_name$, "/*")


  test("simple get") {
    get("/$servlet_name$") {
      status should equal (200)
      body should include ("$servlet_name$")
    }
  }
}

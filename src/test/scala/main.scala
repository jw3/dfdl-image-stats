import java.io.File

import org.apache.daffodil.sapi.Daffodil
import org.apache.daffodil.sapi.infoset.JsonInfosetOutputter
import org.apache.daffodil.sapi.io.InputSourceDataInputStream

object main extends App {
  val schema = getClass.getResource("com/mitre/jpeg/xsd/jpeg.dfdl.xsd").getPath

  val c = Daffodil.compiler()
  val pf = c.compileFile(new File(schema))
  pf.getDiagnostics.filter(_.isError).foreach(println)

  val dp = pf.onPath("/")

  val input = getClass.getResourceAsStream("/works-on-my-machine.jpg")
  dp.parse(new InputSourceDataInputStream(input), new JsonInfosetOutputter(System.out, true))
}

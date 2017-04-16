
import scala.io._
import java.io._
package object FileHandler {

  var token: List[String] = List()

  def readFile(fileName: String) = {
    val source = Source.fromFile(fileName)
    val contents = source.mkString
    val words = contents.split("\\s+").toList //按照空格拆分成多个单词

    println(contents)
    println(words)
    source.close()
    token = words
  }

  def writeFile(fileName: String) = {
    val writer = new PrintWriter(fileName)
    writer.println(token)
    writer.close()
  }
}


package FileHandler

object testSheet {
  val fromFile = "c:\\scala\\future.txt"          //> fromFile  : String = c:\scala\future.txt
  val toFile =  "c:\\scala\\Analysis.txt"         //> toFile  : String = c:\scala\Analysis.txt
  FileHandler.readFile(fromFile)                  //> test by tuquande
                                                  //| List(test, by, tuquande)
}
object ImplicitParamStudy {

  class Connection {
    def executeQuery(query: String): Unit = println(s"Execute: ${query}")
  }

}

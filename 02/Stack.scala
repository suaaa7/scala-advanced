trait Stack[+T] {
  def pop: (T, Stack[T])

  def push[E >: T](e: E): Stack[E]

  def isEmpty: Boolean
}


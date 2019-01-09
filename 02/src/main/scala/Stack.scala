trait Stack[+T] {
  def pop: (T, Stack[T])

  def push[E >: T](e: E): Stack[E]

  def isEmpty: Boolean
}

class NonEmptyStack[+T](
    private val top: T, 
    private val rest: Stack[T]
  ) extends Stack[T] {
  def push[E >: T](e: E): Stack[E] = new NonEmptyStack[E](e, thia)

  def pop: (T, Stack[T]) = (top, rest)

  def isEmpty: Boolean = false

}


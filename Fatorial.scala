import scala.annotation.tailrec

class Fatorial {

  var _start = 0;

  def start_=(newStart: Int) = _start = newStart

  def start = _start

  @tailrec
  final def fatRec(start: Int, x: Int = 1): Int = if start > 1 then fatRec(start - 1, start * x) else x
    //fatRec(5, 1)
    //fatRec(4, 5)
    //fatRec(3, 20)
    //fatRec(2, 60)
    //fatRec(1, 120)
}

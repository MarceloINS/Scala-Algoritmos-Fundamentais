class Troca:
  
  var _a = 0
  var _b = 0

  def a_= (newA: Int) = _a = newA
  def a = _a

  def b_= (newB: Int) = _b = newB
  def b = _b

  def troca =
    var aux = a; a_=(b); b_=(aux)
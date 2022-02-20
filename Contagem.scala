class Contagem:

  var _cont = 0
  
  def cont_= (newCont: Int) = _cont = newCont
  def cont = _cont

  def contagem(entrada: Int) = 
    if entrada%2 == 0 then cont_=(cont+1)
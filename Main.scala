@main def main =

  //troca de varaiveis
  val troca = new Troca
  troca a_=(12)
  troca b_=(20)
  troca.troca
  println(s"Valor de a = ${troca.a} \nValor de b = ${troca.b}\n")

  //contagem
  val contagem = new Contagem
  for (i <- 0 to 100)
    contagem contagem(i)
  println(s"Contagem foi de: ${contagem.cont} numeros pares\n")

  //fatorial
  val fat = new Fatorial
  println(s"${fat fatRec(5)}")

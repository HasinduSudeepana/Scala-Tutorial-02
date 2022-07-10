object Main {
  def main(args: Array[String]): Unit = {
    var a:Int=2
    var b:Int=3
    var c:Int=4
    var d:Int=5
    val k:Float =4.3f
    val g:Float =5.3f
  //a
    b-=1  //--b
    println("Value is:"+(b*a+c*d))  //output is 24
    d-=1  //d--
  //b
    println("Value is:"+(a)) //output is 2
    a+=1  //a++
  //c
    println("Value is:"+(-2*(g-k)+c)) //output is 2
  //d
    println("Value is:"+c) //output is 4
  //e
    c+=1  //++c
    println("Value is:"+(c*a)) //output is 18
    a+=1  //a++

  }
}

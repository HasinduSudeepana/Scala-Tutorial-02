object Main {
  def main(args: Array[String]): Unit = {
    var a:Int=2
    var b:Int=3
    var c:Int=4
    var d:Int=5
    val k:Float =4.3f
    val g:Float =5.3f
  //a
    b-=1
    println("Value is:"+(b*a+c*d))  //24
    d-=1
  //b
    println("Value is:"+(a)) //2
    a+=1
  //c
    println("Value is:"+(-2*(g-k)+c)) //2
  //d
    println("Value is:"+c) //4
    c+=1
  //e
    c+=1
    println("Value is:"+(c*a)) //18
    a+=1

  }
}
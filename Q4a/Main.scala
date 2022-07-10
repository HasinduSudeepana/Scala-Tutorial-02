object Main {
  def main(args: Array[String]): Unit = {
    println("Salary:"+Pay_salary(40,30))
  }
  def normal_salary(x:Int):Int={
    return 250*x
  }
  def Ot_salary(y:Int):Int={
    return 85*y
  }
  def Total_salary(x:Int,y:Int):Int={
    return normal_salary(x)+Ot_salary(y)
  }
  def Tax(x:Int,y:Int):Double={
    return Total_salary(x,y)*(12.0/100.0)
  }
  def Pay_salary(x:Int,y:Int):Double={
    return Total_salary(x,y)-Tax(x,y)
  }
}
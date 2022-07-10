object Main {
  def main(args: Array[String]): Unit = {
    println("Salary:"+Pay_salary(40,30))
  }
  def normal_salary(x:Int):Int={   //calculate nomal salary using normal working hours
    return 250*x
  }
  def Ot_salary(y:Int):Int={     //calculate the ot salary using ot working hours
    return 85*y
  }
  def Total_salary(x:Int,y:Int):Int={  //calculate total salary using normal salary + ot salary
    return normal_salary(x)+Ot_salary(y)
  }
  def Tax(x:Int,y:Int):Double={     //calculate the tax value using total salary*12%
    return Total_salary(x,y)*(12.0/100.0)
  }
  def Pay_salary(x:Int,y:Int):Double={   // calculate net value using total salary -tax value
    return Total_salary(x,y)-Tax(x,y)
  }
}

object Main {
  def main(args: Array[String]): Unit = {   
    println("The highest profit is:"+profit(25))
  }

  def attendance(price:Int):Int={     //this is the formula of calculate the attendance
    return 120 +(15-price)/5*20
  }

  def revenue(price:Int):Int={   
    return attendance(price)*price   //can be calculate the revenue using attendance*ticket price
  }

  def cost (price:Int):Int={     //can be calculate the cost using owner cost + attendance cost
    return 500+ 3*attendance(price)
  }

  def profit(price:Int):Int={
    return revenue(price)-cost(price)  //can be calculate using revenue - cost
  }
}

/*
  If the ticket price is 5: profit is=   180
  If the ticket price is 10: profit is=  480
  If the ticket price is 15: profit is=  940
  If the ticket price is 20: profit is= 1200
  If the ticket price is 25: profit is= 1260
  If the ticket price is 30: profit is= 1120
  If the ticket price is 35: profit is=  780
  If the ticket price is 40: profit is=  240

 */

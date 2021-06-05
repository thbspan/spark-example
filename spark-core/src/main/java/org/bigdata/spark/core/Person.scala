package org.bigdata.spark.core

class Person {
  // val相当于只有get方法
  val id: String = "100"

  // var 相当于既有get又有set方法
  // _ 初始值标记
  var name: String = _

  var age: Int = _
  // 只能在本类中访问，伴生对象中也不能访问
  private [this] val gender = "男"
}

object Person {
  def main(args: Array[String]): Unit = {
    val p = new Person()

    println(p.id)
    println(p.name)
    println(p.age)
  }
}

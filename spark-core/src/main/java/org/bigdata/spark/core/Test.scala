package org.bigdata.spark.core

object Test {
  // 方法
  def main(args: Array[String]): Unit = {

    var i: Int = 0;
    for (i <- 1 to 10; j <- 1 to 3) {
      println(i + " " + j)
    }
    println(1.+(2))
    // 函数
    val f = (x: Int, y: Int) => x + y
    // 函数、方法

    // 方法转换成函数
    // 1、显示转换
    var test = m1 _
    println(test)
    // 2、隐士转换
    println(m2(m1))
  }

  // 方法
  def m1(x: Int, y: Int): Int = {
    x + y
  }

  // 方法
  def m2(f: (Int, Int) => Int): Int = {
    f(3, 4)
  }
}

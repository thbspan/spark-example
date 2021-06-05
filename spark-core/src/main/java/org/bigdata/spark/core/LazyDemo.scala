package org.bigdata.spark.core

/**
 * scala中定义的变量叫惰性变量，会实现延迟加载
 * 惰性变量是不可变的，只有在调用调用惰性变量才会加载
 */
class LazyDemo {

}

object LazyDemo {
  def init(): Unit = {
    println("call init()")
  }
  def main(args: Array[String]): Unit = {
    // lazy 关键子
    lazy val property = init()
    println("after init()")
    println(property)
  }
}

package org.bigdata.spark.core

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object CollectionTest {

  // 集合默认是不可变的，可以引用可变的包
  def main(args: Array[String]): Unit = {
    // 序列
    val list1 = List(1, 2, 3)
    // par并行执行
    println(list1.par.sum)
    // 前面添加
    // 等价于 list1.::(0) / 0 +: list1
    var list2 = 0 :: list1
    println(list2)
    // 后面添加
    list2 = list2 :+ 4
    println(list2)

    val list3 = ListBuffer(1, 2, 3)
    list3.append(5)
    println(list3)

    val set1 = new mutable.HashSet[Int]()
    set1 += 2
    println(set1)

    val map1 = new mutable.HashMap[String, Int]()
    map1("scala") = 1
    map1 += (("java", 2))
    map1.put("hello", 3)
    println(map1)

    val list7 = List(List(1, 2, 3), List(3, 4, 5), List(5, 6))
    val res = list7.flatten.reduce( _+_ )
    println(res)
  }
}

package com.knoldus

object ImplementedQueue {

  def main(args:Array[String]):Unit = {

    val queue = new genericQueue[Int]

    val firstEmptyQueue = List.empty[Int]

    val firstElementWithEnqueue = queue.enqueue(firstEmptyQueue, 10)
    val secondElementWithEnqueue = queue.enqueue(firstElementWithEnqueue, 20)
    println(secondElementWithEnqueue)

    val firstElementWithDequeue = queue.dequeue(secondElementWithEnqueue)
    println(queue.isEmpty(firstElementWithDequeue))
    println(firstElementWithDequeue)

    /*** Different Data Types in Queue **/


    val queue2 = new genericQueue[String]

    val secondEmptyQueue = List.empty[String]

    val secondQueueWithEnqueue1 = queue2.enqueue(secondEmptyQueue , "Hello")
    val secondQueueWithEnqueue2 = queue2.enqueue(secondQueueWithEnqueue1, "World")
    println(secondQueueWithEnqueue2)

    val secondQueueWithDequeue = queue2.dequeue(secondQueueWithEnqueue2)
    println(queue2.isEmpty(secondEmptyQueue))
    println(secondQueueWithDequeue)
  }

}

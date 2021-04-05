package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec


class queueTesting extends AnyFlatSpec {

 val queue = new genericQueue[Int]


 "enqueue method" should "insert an element at the end of queue and return the updated queue" in {

  val queueAfterEnqueue = queue.enqueue(List(1), 2)

  assert(queueAfterEnqueue == List(1, 2))
 }
 "dequeue method " should "throw a NoSuchElementException if the given queue is empty " in {
  val givenQueue = List.empty[Int]
  assertThrows[NoSuchElementException] {
   queue.dequeue(givenQueue)
  }
 }

 it should "delete an element from the beginning of non-empty  queue and return the latest queue" in {

  val queueAfterDequeue = queue.dequeue(List(1,2))
  assert(queueAfterDequeue == List(1))

  "isEmpty method" should "return false if the given queue has some elements" in {
   val givenQueue = List(1)
   assert(!queue.isEmpty(givenQueue))
  }
 }

}
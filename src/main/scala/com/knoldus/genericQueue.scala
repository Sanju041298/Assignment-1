package com.knoldus

class genericQueue[A] {


  def enqueue(simpleQueue: List[A], element: A): List[A] = {
    simpleQueue ++ List(element)


  }

  def dequeue(simpleQueue : List[A]): List[A] = {
    if(simpleQueue.isEmpty) {
      throw new NoSuchElementException("No element in Queue")

    }
    simpleQueue.tail
  }

  def isEmpty(simpleQueue : List[A]): Boolean = {
    if(simpleQueue.isEmpty) true
    else false
  }
}

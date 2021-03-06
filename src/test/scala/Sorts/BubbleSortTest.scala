package Sorts

import org.scalatest._

class BubbleSortTest extends FlatSpec {
  "A Bubble Sort" should "return a sorted version of an array passed to it" in {
    val arr = Array(3,2,7,1,9,0)
    assert(BubbleSort.bubbleSort(arr) === Array(0,1,2,3,7,9))
  }
}

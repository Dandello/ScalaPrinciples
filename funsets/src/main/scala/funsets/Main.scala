package funsets

object Main extends App {
  import FunSets._
  val s = (x:Int) => x < 0
  val t = (x:Int) => x < 100
  val w = (x:Int) => x == 1 | x == 2
  val sing = singletonSet(1);
  val unionSet = union(s, t)
  val newW = map(w, x => x + 10)
  val intersectSet = intersect(s, t)
  println(contains(singletonSet(1), 1))
  println(contains(s, 1))
  println(contains(unionSet, 101))
  println(contains(intersectSet, -2))
  println(forall(s,x => x < 0))
  println(exists(s,x => x == -1))
  printSet(newW)


}

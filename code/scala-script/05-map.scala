#! /bin/sh
exec scala "$0" "$@"
!#

/*
 Scala Map Hierarchy:

 scala.collection.Map (trait)
   scala.collection.immutable.Map (trait)
     scala.collection.immutable.HashMap (class)

   scalaa.collection.mutable.Map (trait)
     scala.collection.mutable.HashMap (class)
 */

import scala.collection.mutable.Map

val treasureMap = Map[Int, String]()
treasureMap += (1 -> "Go to island")
treasureMap += (2 -> "Find big X on ground")
treasureMap += (3 -> "Dig")
println(treasureMap)

// Of course, there is short-hand for this:
val romanNumeral = Map(
  1 -> "I",
  2 -> "II",
  3 -> "III",
  4 -> "IV",
  5 -> "V"
)

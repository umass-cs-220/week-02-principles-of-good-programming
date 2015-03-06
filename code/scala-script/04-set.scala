#! /bin/sh
exec scala "$0" "$@"
!#

/*
 Scala Set Hierarchy:

 scala.collection.Set (trait)
   scala.collection.immutable.Set (trait)
     scala.collection.immutable.HashSet (class)

   scalaa.collection.mutable.Set (trait)
     scala.collection.mutable.HashSet (class)
 */

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

// Note, that += does not modifiy an immutable set. It is short hand for:
jetSet = jetSet + "Lear"
// This is why we declared it as a var and not a val!

// What if you wanted to use an immutable set? You can:
import scala.collection.mutable.Set
val movieSet = Set("Hitch", "Rene")
movieSet += "Shrek"
println(movieSet)



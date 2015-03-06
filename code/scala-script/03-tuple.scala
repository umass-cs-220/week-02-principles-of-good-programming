#! /bin/sh
exec scala "$0" "$@"
!#

// Scala has tuples:
val pair = (99, "Beers")
println(pair._1)
println(pair._2)

// Ugly syntax, better with "destructuring assignment":
val (amount, thing) = pair
println(amount + " of " + thing + " on the wall!")

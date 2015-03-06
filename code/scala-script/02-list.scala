#! /bin/sh
exec scala "$0" "$@"
!#

// Lists are important in functional languages, so they are important
// for Scala:

val xs = List(1,2)
val ys = List(3,4)

// Lists in Scala are *immutable*. We can create new lists easily
// using the concatenation operator ':::',

val zs = xs ::: ys
println(xs)
println(ys)
println(zs)

// You can also "cons" (::) an element to create a new list:
val xsWithOne = 1 :: xs
println(xsWithOne)

// Although ::: and :: look like operators they are in fact methods
// defined in the List class. Method names ending with a : work as
// right-associative operators, that is, the above is translated into:
println(ys.:::(xs))

// And:
println(xs.::(1))

// You can construct a list from scratch using :: and Nil (the empty
// list):
val nums = 1 :: 2 :: 3 :: Nil
println(nums)

// When is there no "append" to list in Scala?

// Lists have lots of methods associated with them:

println(nums.drop(2))      // drop
println(nums.dropRight(2)) // dropRight
println(nums.head)         // head
println(nums.last)         // last
println(nums.isEmpty)      // isEmpty
println(nums.length)       // length

nums.foreach(println)      // foreach
nums.exists(s => s == 2)   // exists
nums.filter(s => s <= 2)   // filter   note: returns new list
nums.reverse               // reverse  note: returns new list
nums.map(s => s * 2)       // map      note: returns new list

// This lets you do some rather sophisticated list processing (lispy):
nums.reverse.filter(s => s <= 2).map(s => s * 2)


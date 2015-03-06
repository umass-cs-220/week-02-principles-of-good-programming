#! /bin/sh
exec scala "$0" "$@"
!#

// This is how you create an array in Scala. Note several differences
// between Scala and Java. First, the left-hand side does not have any
// type specification. Second, the construction of the array on the
// right-hand side is very different. In particular, we use the
// designated type (Array) rather than String[]. Also, the type
// parameterization (generic) uses [] brackets rather than <> as is
// the case in Java.
val greetStrings = new Array[String](3)

// Now, we can assign values to the array. Again, note the differences
// here between Java and Scala. What are they?
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

// Here is a for loop iterating over the elements in the array:
for (i <- 0 to 2)
  print(greetStrings(i))

// This above for loop is a "for expression" which is very different
// than Java. First to note is that the integers are true
// objects. This allows us to execute methods on them. In this case,
// we are invoking the `to` method on the 0 and passing it the integer
// 2 - this returns a Range object which can be used with this special
// for expression form.
//
// Also, you should see that the array is indexed like a function. It
// turns out that this is a short-hand for a method invocation on an
// object. For example, assigning a new value to a location in an
// array is:
greetStrings(2) = "world\n"

// Is translated into:
greetStrings.update(2, "world!\n")

// Likewise, access:
greetStrings(2)

// Is translated into:
greetStrings.apply(2)

// Thus, the above code is semantically equivalent to:
var greetStrings2 = new Array[String](3)
greetStrings2.update(0, "Hello")
greetStrings2.update(1, ", ")
greetStrings2.update(2, "world!\n")

for (i <- 0.to(2))
  print(greetStrings2.apply(i))

// Scala also provides a short-hand for creating arrays:
val numNames = Array("zero", "one", "two")
// Which is short-hand for:
val numNames2 = Array.apply("zero", "one", "two")


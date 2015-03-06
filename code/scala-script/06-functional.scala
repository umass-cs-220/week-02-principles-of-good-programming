#! /bin/sh
exec scala "$0" "$@"
!#

// Scala is a functional language. This can often lead to very elegant
// and understandable code. You must learn to recognize this!

// Here is an example:
def printArgs(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}

// This works perfectly well, however, we can leverage certain
// techniques from functional programming that make this more obvious:
def printArgs2(args: Array[String]): Unit = {
  for (arg <- args)
    println(arg)
}

// Better yet, Nice!
def printArgs3(args: Array[String]): Unit = args.foreach(println)

// However, this is not necessarily functional as it has a
// side-effect (is mutable). What is it?

// This would be better:
def formatArgs(args: Array[String]) = args.mkString("\n")

val res = formatArgs(Array("1","2","3"))
assert(res == "1\n2\n3")

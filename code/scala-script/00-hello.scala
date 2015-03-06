#! /bin/sh
exec scala "$0" "$@"
!#

val hello = "Hello World...From a Script!"
println(args(0) + ", " + hello)

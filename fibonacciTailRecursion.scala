//The Fibonacci numbers alg with tail recursion
def fibonacciTailRec(n:Int):Int={
def loop(prev:Int, curr:Int, num:Int):Int={
if (n==num) prev
	else loop(curr, prev+curr, num+1)}
loop(0,1,0)
}
//The Fibonacci numbers simplest implementation
def fibonacci(n:Int):Int = n match {
case 1=>1
case 0=>0
case _=>fibonacci(n-1)+fibonacci(n-2)
}



package HuynhNgocSon.module1

class FibonacciImpl2 : Fibonacci {
    override fun fibonacci(n: Int, flag: Boolean): Int {
        if (!flag) {
            if (n <= 1) return n
            var a = 0
            var b = 1
            var result = 1
            for (i in 2..n) {
                result = a + b
                a = b
                b = result
            }
            return result
        }
        return -1 // không xử lý khi flag = true
    }
}
package DauDoanHoanThien.module1

class FibonacciImpl1 : Fibonacci {
    override fun fibonacci(n: Int, flag: Boolean): Int {
        return if (flag) {
            if (n <= 1) n else fibonacci(n - 1, flag) + fibonacci(n - 2, flag)
        } else {
            -1 // không xử lý khi flag = false
        }
    }
}
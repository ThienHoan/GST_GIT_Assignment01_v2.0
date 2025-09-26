package DauDoanHoanThien.module1

class FibonacciImpl2 : Fibonacci {
    override fun fibonacci(n: Int, flag: Boolean): Int {
        return if (!flag) {
            // Tính Fibonacci bằng vòng lặp for khi flag = false
            if (n <= 1) {
                n
            } else {
                var prev = 0
                var current = 1
                for (i in 2..n) {
                    val next = prev + current
                    prev = current
                    current = next
                }
                current
            }
        } else {
            -1 // không xử lý khi flag = true
        }
    }
}
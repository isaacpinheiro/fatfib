(ns fatfib.core-test
    (:require [clojure.test :refer :all]
        [fatfib.core :refer :all]))

(deftest a-test
    (testing "Testing Factorial."
        (is (= (factorial 0) 1))
        (is (= (factorial 4) 24))
        (is (= (factorial 5) 120)))

    (testing "Testing Fibonacci."
        (is (= (fibonacci 0) 1))
        (is (= (fibonacci 1) 1))
        (is (= (fibonacci 2) 2))
        (is (= (fibonacci 3) 3))
        (is (= (fibonacci 4) 5))
        (is (= (fibonacci 5) 8))))

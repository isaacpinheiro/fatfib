(ns fatfib.core-test
    (:require [clojure.test :refer :all]
        [fatfib.core :refer :all]))

(deftest a-test
    (testing "Testing Fatorial."
        (is (= (fatorial 0) 1))
        (is (= (fatorial 4) 24))
        (is (= (fatorial 5) 120)))

    (testing "Testing Fibonacci."
        (is (= (fibonacci 0) 1))
        (is (= (fibonacci 1) 1))
        (is (= (fibonacci 2) 2))
        (is (= (fibonacci 3) 3))
        (is (= (fibonacci 4) 5))
        (is (= (fibonacci 5) 8))))

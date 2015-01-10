(ns euler.core-test
  (:require [clojure.test :refer :all]
            [euler.core :refer :all]))

(deftest problem-1-test
  (testing "Multiples of 3 and 5"
    (is (= (problem-1) 233168))))

(deftest problem-2-test
  (testing "Even Fibonacci numbers"
    (is (= (problem-2) 4613732))))

(deftest fib-test
  (testing "Fibonacci sequence (some of it anyways)"
    (is (= (take 10 fib) (seq  [0 1 1 2 3 5 8 13 21 34])))))

(deftest primefactors
  (testing "Prime factors"
    (is (= (prime-factors 0) []))
    (is (= (prime-factors 1) []))
    (is (= (prime-factors 2) [2]))
    (is (= (prime-factors 3) [3]))
    (is (= (prime-factors 4) [2 2]))
    (is (= (prime-factors 5) [5]))
    (is (= (prime-factors 6) [2 3]))
    ))

(deftest problem-3-test
  (testing "Largest prime factor"
    (is (= (problem-3) 6857))))


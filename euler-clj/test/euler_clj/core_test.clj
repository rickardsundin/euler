(ns euler-clj.core-test
  (:require [clojure.test :refer :all]
            [euler-clj.core :refer :all]))

(deftest problem-1-test
  (testing "Multiples of 3 and 5"
    (is (= (problem-1) 233168))))

(deftest problem-2-test
  (testing "Even Fibonacci numbers"
    (is (= (problem-2) 4613732))))


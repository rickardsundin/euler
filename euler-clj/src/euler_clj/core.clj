(ns euler-clj.core)

(def integers
  "All non-negative integers"
  (iterate inc 0))

(defn multiple-of?
  "Return true if n is a multiple of m"
  [n m]
  (= 0 (mod n m)))

(defn problem-1 
  "Find the sum of all the multiples of 3 or 5 below 1000."
  []
  (apply + (filter #(or (multiple-of? % 3) (multiple-of? % 5)) (take 1000 integers))))

(def fib 
  "The Fibonacci sequence"
  (map first (iterate (fn [[a b]] [b (+' a b)]) [0 1])))

(defn problem-2
  "By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms."
  []
  (apply + (filter even? (take-while #(< % 4000000) fib))))


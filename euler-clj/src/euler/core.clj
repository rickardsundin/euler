(ns euler.core)

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

(defn prime-factors
  "Return the prime factors of n in ascending order"
  ([n] (prime-factors n 2 '()))
  ([n candidate factors]
   (cond 
     (< n 2) (reverse factors)
     (zero? (rem n candidate)) (recur (/ n candidate) candidate (cons candidate factors))
     :else (recur n (inc candidate) factors))))

(defn problem-3
  "What is the largest prime factor of the number 600851475143 ?"
  []
  (last (prime-factors 600851475143)))


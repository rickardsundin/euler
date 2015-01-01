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

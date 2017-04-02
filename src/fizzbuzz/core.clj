(ns fizzbuzz.core
  (:gen-class))

(defn print100 []
  (rest (range 101)))

(defn div3 [x]
  (/ x 3))

(defn div5 [x]
  (/ x 5))

(defn div15 [x]
  (/ x 15))

(defn checkall [x]
  (if (true? (integer? (div15 x)))
    "FizzBuzz"
    (if (true? (integer? (div5 x)))
      "Buzz"
      (if (true? (integer? (div3 x))) "Fizz" x))))

(defn fizzbuzz []
  (map checkall (print100)))

(ns Calculator.core)

(defn add
  [x y] (+ x y))

(defn subtract
 [x y] (- x y))

(defn multiply
  [x y] (* x y))

(defn divide
  [x y] (/ x y ))

(defn square
  [x] (multiply x x))

(defn power-of
  [x y] (reduce * (repeat y x)))
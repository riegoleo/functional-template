(ns exercise6)

(defn faverage
  "Calculates the average of a given sequence."
  [x]
  (def sum (reduce + x))
  (/ sum (count x)))







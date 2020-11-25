(ns exercise3)

(defn fibonacci
  "Calculates the fibonacci result fo the given input value."
  [x]
  (cond
   (= x 0) 0
   (= x 1) 1
   :else (+ (fibonacci (- x 1)) (fibonacci (- x 2)))))





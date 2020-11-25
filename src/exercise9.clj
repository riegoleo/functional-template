(ns exercise9)
(require '[clojure.string :as cs])

(def letters (map char (concat (range 65 91) (range 97 123))))

(defn insert-on-map [word-map word]
  (if (contains? word-map word)
    (assoc word-map word (+ (get word-map word) 1))
    (assoc word-map word 1)))

(defn to-lower-case [word]
  (apply str (map #(cs/lower-case %) word)))

(defn filter-chars [word]
  (apply str (filter #(or (Character/isLetter %) (Character/isDigit %))  word)))

(defn filter-chars-and-empty-words [words]
  (filter #(not (cs/blank? %))
            (map filter-chars words)))

(defn word-count 
  "Returns a map where each key is a distinct word in a given sentence and each value is the number of occurences of that word in the sentence."
  [x]
  (def list-of-words (cs/split (cs/trim x) #"\s+"))
  (def lowered-words (map to-lower-case list-of-words))
  (def filtered-words (filter-chars-and-empty-words lowered-words))
  (reduce insert-on-map {} filtered-words)
)





(defn quadrados [sequencia]
  (map (fn [n] (* n n)) sequencia))

(assert (= (quadrados [1 2 3 4 5 6 7 8]) [1 4 9 16 25 36 49 64]))
(assert (= (quadrados [2]) [4]))
(assert (= (quadrados []) []))

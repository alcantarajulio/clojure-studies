;@author alcantarajulio

;a) length

(defn length [lista]
    (if (empty? lista)
        0
        (inc (length (rest lista)))))

(assert (= (length [1 2 3 4 5 6 7 8]) 8))
(assert (= (length []) 0))

;b) value_at

(defn value_at [i lista]
    (cond
        (= i 1) (first lista)
        (empty? lista) nil
        :else (value_at (- i 1) (rest lista))))

(assert (= (value_at 2 [1, 2, 3, 4, 5, 6, 7, 8]) 2))
(assert (= (value_at 4 [1 2 3]) nil))
(assert (= (value_at -1 [1, 2, 3, 4, 5, 6, 7, 8]) nil))
(assert (= (value_at 2 []) nil))

;c) index

(defn index
  ([v lista i]
  (cond 
    (empty? lista) -1
    (= v (first lista)) i
    :else (index v (rest lista) (inc i))))
  
  ([v lista]
   (index v lista 0)))

(assert (= (index 2 [1 2 3]) 1))
(assert (= (index 4 [1 2 3]) -1))
(assert (= (index 2 []) -1))
(assert (= (index 1 [1 2 3 4]) 0))
(assert (= (index 4 [1 2 3 4]) 3))

(defn quadrados-rec [lista]
  (if (empty? lista)
    '()
  (let[primeiro (first lista)]
    (cons (* primeiro primeiro) (quadrados-rec (rest lista))))))

(defn quadrados-pares [lista]
        (let [lista-pares (filter (fn [x] (even? x)) lista)]
          (quadrados-rec lista-pares)))

(assert(= (quadrados-pares '(1 2 3 4)) '(4 16)))
(assert(= (quadrados-pares '(1 3 5)) '()))

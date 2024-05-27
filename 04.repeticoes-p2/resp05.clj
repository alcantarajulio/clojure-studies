(defn quadrados-rec [lista]
  (if (empty? lista)
    '()
  (let[primeiro (first lista)]
    (cons (* primeiro primeiro) (quadrados-rec (rest lista))))))

(defn soma-quadrados [lista]
  (if (empty? lista)
    0
    (apply + (quadrados-rec lista))))

(assert(= (soma-quadrados '(1 2 3 4)) 30))
(assert(= (soma-quadrados '()) 0))

(defn quadrados-rec [lista]
  (if (empty? lista)
    '()
  (let[primeiro (first lista)] 
    (cons (* primeiro primeiro) (quadrados-rec (rest lista))))))


(assert(= (quadrados-rec '(1 2 3)) '(1 4 9)))
(assert(= (quadrados-rec '(5 4 10)) '(25 16 100)))
(assert(= (quadrados-rec '()) '()))

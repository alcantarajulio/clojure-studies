(defn quadrados-pares-rec [lista]
  (let [primeiro (first lista)]
    (cond 
      (empty? lista) '()
      (even? primeiro) (cons (* primeiro primeiro) (quadrados-pares-rec (rest lista)))
      :else (quadrados-pares-rec (rest lista)))))

(assert(= (quadrados-pares-rec '(1 2 3 4)) '(4 16)))
(assert(= (quadrados-pares-rec '(1 3 5)) '()))

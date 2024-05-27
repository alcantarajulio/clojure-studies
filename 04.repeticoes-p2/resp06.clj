(defn soma-quadrados [lista]
  (let [lista-quadrados (map (fn [x] (* x x)) lista)]
    (reduce + lista-quadrados)))

(assert(= (soma-quadrados '(1 2 3 4)) 30))
(assert(= (soma-quadrados '()) 0))

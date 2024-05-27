(defn fatorial [n]
  (if (or (= n 1) (= n 0))
          1
          (* n (fatorial (dec n)))))


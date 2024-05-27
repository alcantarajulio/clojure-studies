(defn conta[x]
    (doseq[n (range (inc x))]
    (println n)))

(conta (read))

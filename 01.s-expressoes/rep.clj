(defn contagem-regressiva [n]
    (println n)
    (if (not= n 0)
        (contagem-regressiva (dec n))))

(contagem-regressiva (read))

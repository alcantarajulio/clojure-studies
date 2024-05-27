; @author alcantarajulio
(defn conta 
    ([] (println(conta 0)))
    ([x] (println x)
        (println (conta (inc x)))))
(conta)

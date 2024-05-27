; @author alcantarajulio
;
(defn conta []
    (loop [x 0]
        (println x)
        (recur (inc x))))
(conta)

(defn fahr-celsius [lista]
  (map (fn [n] (format "%.1f" (/ (- n 32) 1.8))) lista))

(assert (= (fahr-celsius [40]) '("4.4")))
(assert (= (fahr-celsius [32 50 61]) '("0.0" "10.0" "16.1")))
(assert (= (fahr-celsius []) '()))

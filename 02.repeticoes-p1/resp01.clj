; @author alcantarajulio 
; O programa executa infinitas vezes em detrimento da inexistencia da condicao de parada.
(defn msg-rec [string]
    (println string)
    (msg-rec string)) 
(msg-rec (read))

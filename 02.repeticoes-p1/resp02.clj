; @author alcantarajulio
; a divisao em duas funcoes torna o codigo mais desacoplado, facilidando a manutencao futura e dividindo melhor os "papeis" 
(defn conta-rec [x] 
    (println x)
    (conta-rec (inc x)))

(defn conta []
    (conta-rec 0))

(conta)

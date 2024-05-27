(require '[clojure.string :as str])

(def vogais #{"a" "e" "i" "o" "u" "A" "E" "I" "O" "U"})

(defn comeca-com-vogal [palavra]
  (let [primeira-letra (first palavra)]
    (contains? vogais (str primeira-letra))))

(defn ini-vogais [sequencia]
  (map str/lower-case (filter comeca-com-vogal sequencia)))

(assert (= (ini-vogais ["banana" "violao" "guarda-roupa" "patinete"]) '()))
(assert (= (ini-vogais ["cereja" "aipim" "evolucao"]) '("aipim" "evolucao")))
(assert (= (ini-vogais ["UFCG" "UASC" "CEEI"]) '("ufcg" "uasc")))

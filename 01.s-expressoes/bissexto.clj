(defn eh_bissexto [ano]
  (if (or (and (zero? (mod ano 400))
               (not (zero? (mod ano 100))))
          (zero? (mod ano 4)))

      (println "É bissexto")
      (println "Não é bissexto")))


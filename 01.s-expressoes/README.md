# Lista 1

1. Explique o que você entende por s-expressões?
   
   Basicamente, é a sintaxe de Lisp.
   Que podem ser de dois tipos: Atômicas e Listas, que são essas, respectivamente, os dados primitivos da linguagem e dados compostos de outras s-expressões.

2. Escreva cinco exemplos de s-expressões atômicas. Não use
   nenhum exemplo dos fornecidos nos slides. Também não use
   exemplos de colegas. Varie ao máximo os tipos de átomos
   usados.
   ```clojure
   "julio"
   true 
   16/5
   *
   123.221
   ```
3. O que são formas? Qual sua relação com s-expressões?
   Se a s-expressão for "compilável".
    tudo que pode ser compilado pelo clojure, ou lisp, s-expressoes sao formas validas.      

4. Escreva três exemplos de s-expressões não atômicas que não
   sejam formas e três outras que sejam formas.
   
    Não são formas 
    ```clojure
    (203 z)
    (inc z)
    (def 123)
    (2 * 2)
    (12 912*)
    ```
    São formas
    ```clojure
    (def z 11)
    (inc 1)
    (+ 203)
    (* 2 2)
    '(233 23 123)
    ```

5. O que são símbolos em Clojure? Dê exemplos de símbolos.
   Explore a linguagem por experimentação no REPL e descubra
   outros simbolos operacionais semelhantes aos de outras
   linguagens que você tenha estudado que sejam válidos em
   Clojure. Escreva uma expressão usando cada um desses símbolos
   que você descobrir.
   
    São caracteres utilizados pela linguagem para determinar um comportamento pré-definido ao clj.
    (* 213 2) 


6. Escreva uma sequência de s-expressões que representem a
   avaliação da s-expressão `(* (+ 2 5 7) (- 8 (inc 3)) 5)`,
   passo a passo, até que seja reduzida à s-expressão atômica
   equivalente.

    (* (+ 2 5 7) (- 8 4) 5)
    (* 14 (- 8 4) 5)
    (* 14 4 5)
    280
 
7. O que são _formas especiais_ e como diferem das demais formas?
   Por que `def` em uma s-expressão como `(def a 123)` é uma
   forma especial e não uma simples aplicação de função? E `fn`
   por que precisa ser definida como uma forma especial?

8. Analise o programa abaixo. Considerando as definições nas
   primeiras três linhas, avalia a sequência de s-expressões
   pelas quais a s-expressão na linha final pode ser
   interpretada, passo a passo.

```clojure
(defn dobro [n] (* 2 n))
(defn triplo [n] (* 3 n))
(defn vezes_12 [n] (dobro (dobro (triplo n))))

(vezes_12 10)
```
```clojure
(defn vezes_12 [n] (dobro (dobro (* 3 n))))
(defn vezes_12 [n] (dobro (dobro 30)))
(defn vezes_12 [n] (dobro (* 2 30)))
(defn vezes_12 [n] (dobro (60)))
(defn vezes_12 [n] (* 2 60))
120
```
9. No REPL, com a forma especial `fn`, crie uma função anônima
   (ou lambda) que receba três argumentos (`a`, `b` e `c`) que
   representam os três coeficientes inteiros de uma equação de 2o
   grau e que retorne o valor do determinante (o _delta_) da
   equação. Com a forma especial `def`, defina o símbolo
   `eq2delta` e associe-o à função anônima.  função usando apenas a forma especial `defn`.
  
    (def baskhara (baskhara [a b c] (- (* b b) (* 4 a c))))
    (defn baskhara[a b c] (- (* b b) (* 4 a c)))`

10. No REPL, experimente as formas especiais `if` e `cond`.  Com
    elas, escreva a função `raizes` que retorne um vetor contendo
    as duas raízes da equação.

```
(defn delta [a b c] (- (* b b) (* 4 a c)))

(defn raizes [a b c] (if (< (delta a b c) 0) "Sem raizes" (if (= (delta a b c) 0) [(/ (- b) (* 2 a))] ([(/ (+ (- b) (Math/sqrt (delta a b c))) (* 2 a))
                                                                                                                  (/ (- (- b) (Math/sqrt delta a b c)) (* 2 a))]))))


```


11. As formas especiais `print` e `println` nos permitem imprimir
    dados na saída (às vezes, você precisará usar também a forma
    especial `flush` para esvaziar o buffer de saída e garantir
    que o dado seja impresso no momento apropriado. Estude essas
    formas especiais e escreva o famoso _Hello, World!_ em
    Clojure, no arquivo `hello.clj`.

12. As formas especiais `read` e `read-line` permitem ler dados
    da entrada. E a função `Integer/parseInt` permite converter
    uma string em um valor inteiro. Com base nas formas especiais
    de entrada e saída e nas definições que você mesmo criou
    anteriormente, crie um pequeno programa no arquivo `eq2.clj`
    que leia os coeficientes `a`, `b` e `c` de uma equação de
    segundo grau da entrada e que imprima suas raízes. Se a
    equação não tiver raízes, imprima a mensagem `sem raízes` na
    saída.

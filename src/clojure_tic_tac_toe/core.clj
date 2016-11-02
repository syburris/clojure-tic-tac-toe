(ns clojure-tic-tac-toe.core
  (:gen-class))

(def board [[:x :e :o]
            [:x :o :e]
            [:x :e :o]])



(defn -main [& args]
  (let [[[a b c]
         [d e f]
         [g h i]] board
        solutions (hash-set
                    [a b c]
                    [d e f]
                    [g h i]
                    [a d g]
                    [b e h]
                    [c f i]
                    [a e i]
                    [c e g])]
    (cond
      (contains? solutions [:x :x :x])
      (println "X has won!")
      (contains? solutions [:o :o :o])
      (println "O has won!")
      :else
      (println "No one has won yet."))))
      
    


(set-env!
  :source-paths #{"src"}
  :dependencies '[[org.clojure/clojure "1.8.0"]
                  [nightlight "1.1.0" :scope "test"]])

(require '[nightlight.boot :refer [nightlight]])

(deftask build []
  (comp
    (aot :namespace '#{clojure-tic-tac-toe.core})
    (pom :project 'clojure-tic-tac-toe
         :version "1.0.0")
    (uber)
    (jar :main 'clojure-tic-tac-toe.core)
    (target)))

(deftask run []
  (comp
    (wait)
    (nightlight :port 4000)))


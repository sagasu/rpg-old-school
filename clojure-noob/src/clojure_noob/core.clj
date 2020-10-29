(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (+ 1 2 3) ; this will not be printed
  (str "go " "go and " "again go") ;neither this
  (if true
  (println "By Zeus's hammer!")
  (println "By Aquaman's trident! I am else"))) 

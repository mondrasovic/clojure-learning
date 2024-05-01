(ns mathfuncs.core
  (:gen-class))

(defn primes
  "Returns the first N prime numbers."
  [count]
  (let [is-prime (fn [n] (cond
                           (< n 2) false
                           (= n 2) true
                           :else (every? true? (map #(not= (mod n %) 0) (range 2 n)))))]
    (take count (filter is-prime (range)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

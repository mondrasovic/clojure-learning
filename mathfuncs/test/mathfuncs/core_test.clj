(ns mathfuncs.core-test
  (:require [clojure.test :refer [deftest is] :as t] 
            [mathfuncs.core :refer :all]))

(deftest test-primes
  (is (= [] (primes 0)))
  (is (= [2 3 5 7 11] (primes 5))))

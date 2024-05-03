(ns mathfuncs.core-test
  (:require [clojure.test :refer [deftest is] :as t] 
            [mathfuncs.core :refer :all]))

(deftest test-primes
  (is (= [] (primes 0)))
  (is (= [2 3 5 7 11] (primes 5))))

(deftest test-fib
  (is (= [] (fib 0)))
  (is (= [1 1] (fib 2)))
  (is (= [1 1 2 3 5 8] (fib 6))))

(test-fib)
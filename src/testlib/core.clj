(ns testlib.core
  (:require [coldnew.left-pad :refer [leftpad]]))

(def string
  "Hello World")

(defn hello-world
  "Lol, test"
  []
  (str (leftpad string 20) "!"))

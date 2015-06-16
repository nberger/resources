(ns resources.core
  (:gen-class)
  (:require [clojure.java.io :as io]))

(defn -main [& args]
  (let [r (io/resource "greet")]
    (println r)
    (println (slurp r))
    (with-open [rdr (io/reader r)]
      (println (clojure.string/join ", " (line-seq rdr))))
    (println (io/file r))))

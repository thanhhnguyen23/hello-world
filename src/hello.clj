;; using library from maven repo
;;(ns hello (:require [java-time.api :as t]))

;; using local libraries
(ns hello (:require [hello-time :as ht]))

;; $ clj -X hello/run
;;(defn time-str
;;  "returns a string representation of a datetime in the local timezone."
;;  [instant]
;;  (t/format
;;   (t/with-zone (t/formatter "hh:mm a") (t/zone-id))
;;   instant))

(defn run [opts]
  (println "hello world, the time is" (ht/time-str (ht/now))))

(comment
)

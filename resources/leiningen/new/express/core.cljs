(ns {{name}}.core
  (:require [cljs.nodejs :as n]))

(enable-console-print!)

(def express (n/require "express"))
(def app (express))

(defn index-handler
  "doc"
  [req res]
  (. res (send "hello world")))

(defn -main
  "doc"
  [& args]
  (. app (get "/" index-handler))
  (println (str "Express started on port: " (.-port (.address (.listen app 3000))))))

(set! *main-cli-fn* -main)

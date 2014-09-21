(ns leiningen.new.express
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "express"))

(defn express
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' express project.")
    (->files data
             [".gitignore" (render "gitignore" data)]
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)])))

(ns leiningen.plugin-inject
  (:require [cemerick.pomegranate :as pom]
            [leiningen.core.main :as main]
            ))

(defn plugin-inject
  "I don't do a lot."
  [project task & args]
  (pom/add-dependencies :coordinates '[[cider/cider-nrepl "0.10.1"]]
                        :repositories (merge cemerick.pomegranate.aether/maven-central
                                             {"clojars" "http://clojars.org/repo"}))
  (main/resolve-and-apply project (cons task args)))




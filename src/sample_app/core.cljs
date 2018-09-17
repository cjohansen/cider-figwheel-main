(ns sample-app.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)
#_(def puppeteer (js/require "puppeteer"))

(defn -main []
  (println "It's main, baby")
  #_(println "Puppeteer is here" puppeteer))

(set! *main-cli-fn* -main)

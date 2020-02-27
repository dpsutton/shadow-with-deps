(ns app.main
  (:require [reagent.core :as r]))

(defn ^:dev/after-load start []
  (r/render [:div
             [:h3 "hi from deps"]]
            (.getElementById js/document "app")))

(defn ^:export init
  []
  (start))

(ns todoapp.database
  (:require [korma.db :as korma]))

(def db-connection-info
  {:classname "org.postgresql.Driver"
   :subprotocol "postgresql"
   :user "rajan"
   :password ""
   :subname "//localhost:5432/todo"})

; set up korma
(korma/defdb db db-connection-info)
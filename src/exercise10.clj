(ns exercise10)
(def balance "balance")


(defn open-account []
  {balance 0}
)

(defn close-account [account]
  {})

(defn get-balance [account]
  (get account balance))

(defn update-balance [account amount]
  {balance (+ (get account balance) amount)})


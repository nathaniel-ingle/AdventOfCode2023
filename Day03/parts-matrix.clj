(def parts #{\@ \# \$ \% \& \* \+ \- \/ \=})

(defn part-locations [s]
  (loop [[current-char & remaining] s
         result [] 
         index 0]
    (cond 
      (not current-char) result
      (contains? parts current-char) (recur remaining (conj result index) (inc index))
      :else (recur remaining result (inc index)))))


(->> (slurp "Day03/input.txt")
     (#(clojure.string/replace % #"\n" ""))
     (part-locations)
     (println))

(->> (slurp "Day03/input.txt")
     (#(clojure.string/replace % #"\n" ""))
     (count)
     (println))

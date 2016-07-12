(ns fatfib.core
    (:gen-class))

(defn fatorial [n]
    (loop [i n acc 1]
        (if (= i 0)
            acc
            (recur (- i 1) (* acc i)))))

(defn fibonacci [n]
    (loop [i 0 prev 0 acc 1]
        (cond
            (= n 0) 1
            (= n 1) 1
            (= i n) acc
            :else (recur (+ i 1) acc (+ acc prev)))))

(defn printSeq [vec func]
    (loop [v vec]
        (if (not= v [])
            (do (println (func (first v)))
                (recur (rest v))))))

(defn -main [& args]
    (def nums (vector 0 1 2 3 4 5 6))
    (println)
    (println "Fatorial: \n")
    (printSeq nums fatorial)
    (println)
    (println "Fibonacci: \n")
    (printSeq nums fibonacci)
    (println))


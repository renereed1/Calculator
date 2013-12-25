(ns Calculator.core-test
  (:use clojure.test
        Calculator.core))

(deftest Addition-Test
  (testing "As a user, I pass in 0 and 0 and expect to receive 0"
    (is (= 0 (add 0 0))))
  (testing "As a user, I pass in 1 and 0 and expect to receive 1"
    (is (= 1 (add 1 0))))
  (testing "As a user, I pass in 0 and 1 and expect to receive 1"
    (is (= 1 (add 0 1))))
  (testing "As a user, I pass in 67 and 29 and expect to receive 96"
    (is (= 96 (add 67 29))))
  (testing "As a user, I pass in 23483453 and 4832284 and expect to receive 28315737"
    (is (= 28315737 (add 23483453 4832284))))
  (testing "As a user, I pass in -4 and -6 and expect to receive -10"
    (is (= -10 (add -4 -6))))
)
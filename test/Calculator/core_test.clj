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

(deftest Subtraction-Test
  (testing "As a user, I pass in 0 and 0 and expect to receive 0"
    (is (= 0 (subtract 0 0))))
  (testing "As a user, I pass in 1 and 0 and expect to receive 1"
    (is (= 1 (subtract 1 0))))
  (testing "As a user, I pass in 0 and 1 and expect to receive -1"
    (is (= -1 (subtract 0 1))))
  (testing "As a user, I pass in 89 and 43 and expect to receive 46"
    (is (= 46 (subtract 89 43))))
  (testing "As a user, I pass in 23483453 and 4832284 and expect to receive 18651169"
    (is (= 18651169 (subtract 23483453 4832284))))
  (testing "As a user, I pass in -34 and -54 and expect to receive -20"
    (is (= 20 (subtract -34 -54))))
)

(deftest Multiplication-Test
  (testing "As a user, I pass in 0 and 0 and expect to receive 0"
    (is (= 0 (multiply 0 0))))
  (testing "As a user, I pass in 1 and 0 and expect to receive 0"
    (is (= 0 (multiply 1 0))))
  (testing "As a user, I pass in 0 and 1 and expect to receive 0"
    (is (= 0 (multiply 0 1))))
  (testing "As a user, I pass in -4 and -5 and expect to receive 20"
    (is (= 20 (multiply -4 -5))))
  (testing "As a user, I pass in -4 and 5 and expect to receive -20"
    (is (= -20 (multiply -4 5))))
)

(deftest Division-Test
  (testing "As a user, I pass in 10 and 5 and expect to receive 2"
    (is (= 2 (divide 10 5))))
  (testing "As a user, I pass in -20 and 5 and expect to receive -4"
    (is (= -4 (divide -20 5))))
  (testing "As a user, I pass in -40 and -10 and expect to receive 4"
    (is (= 4 (divide -40 -10))))
  (testing "As a user, I pass in 3 and 0 and expect to receive a 'Divide by zero' exception"
    (is (thrown-with-msg? ArithmeticException #"Divide by zero" (divide 3 0))))
  
)
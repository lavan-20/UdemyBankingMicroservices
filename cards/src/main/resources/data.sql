/*DROP TABLE IF EXISTS CARDS;

CREATE TABLE CARDS(
CARD_NUMBER INT PRIMARY KEY,
CUSTOMER_ID INT,
CARD_TYPE VARCHAR(100),
TOTAL_AMOUNT INT,
SPENT_AMOUNT INT,
BALANCE_AMOUNT INT,
VALID_FROM DATE
);

INSERT INTO CARDS(CARD_NUMBER, CUSTOMER_ID,CARD_TYPE,TOTAL_AMOUNT,SPENT_AMOUNT,BALANCE_AMOUNT,VALID_FROM) VALUES
(23445566, (select customer_id from customers where name = 'Lavanya'), 'Credit', 1000000, 700000, 300000, current_date());

INSERT INTO CARDS(CARD_NUMBER, CUSTOMER_ID,CARD_TYPE,TOTAL_AMOUNT,SPENT_AMOUNT,BALANCE_AMOUNT,VALID_FROM) VALUES
(23445567, (select customer_id from customers where name = 'Lavanya'), 'Credit', 1000000, 700000, 300000, current_date());

commit;*/
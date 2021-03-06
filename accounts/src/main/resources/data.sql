/*DROP TABLE IF EXISTS CUSTOMERS;
DROP TABLE IF EXISTS ACCOUNTS;

CREATE USER 'lav'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO 'lav'@'localhost' WITH GRANT OPTION;
CREATE USER 'lav'@'%' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO 'lav'@'%' WITH GRANT OPTION;

CREATE TABLE CUSTOMERS(
CUSTOMER_ID INT AUTO_INCREMENT PRIMARY KEY,
NAME VARCHAR(100),
EMAIL VARCHAR(100),
PHONE_NO INT,
CREATED_TS DATE
);

CREATE TABLE ACCOUNTS(
CUSTOMER_ID INT not null,
ACCOUNT_NO INT,
ACCOUNT_TYPE VARCHAR(100),
BRANCH_ADDRESS VARCHAR(100),
CREATED_TS DATE,
foreign key (CUSTOMER_ID) references customers(CUSTOMER_ID)
);

insert into customers (customer_id, name, email, phone_no, created_ts) values (1, 'Lavanya','lav@gmail.com',1234556777,current_date());
insert into accounts (CUSTOMER_ID, ACCOUNT_NO, ACCOUNT_TYPE, BRANCH_ADDRESS, created_ts)
values ((select customer_id from customers where name = 'Lavanya')
,'1276772280','Savings','Chamiers',current_date());
commit;
*/
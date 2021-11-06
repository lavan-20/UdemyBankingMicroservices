DROP TABLE IF EXISTS CUSTOMERS;
DROP TABLE IF EXISTS ACCOUNTS;

CREATE TABLE CUSTOMERS(
	CUSTOMER_ID INT AUTO_INCREMENT PRIMARY KEY,
	NAME VARCHAR2(100),
	EMAIL VARCHAR2(100),
	PHONE_NO INT,
	CREATED_TS DATE
);

CREATE TABLE ACCOUNTS(
	CUSTOMER_ID INT not null,
	ACCOUNT_NO INT,
	ACCOUNT_TYPE VARCHAR2(100),
	BRANCH_ADDRESS VARCHAR2(100),
	CREATED_TS DATE,
	foreign key (CUSTOMER_ID) references customer(CUSTOMER_ID) 
);

insert into customers (customer_id, name, email, phone_no, created_ts) values (1, 'Lavanya','lav@gmail.com',1234556777,sysdate);
insert into accounts (CUSTOMER_ID, ACCOUNT_NO, ACCOUNT_TYPE, BRANCH_ADDRESS, created_ts) 
values (select customer_id from customer where name = 'Lavanya'
,'1276772280','Savings','Chamiers',sysdate);
commit;
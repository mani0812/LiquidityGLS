insert into Account values('AC101_B01_EUR_E','AC101','E','B01','EUR',false,'Active');
insert into Account values('AC202_D04_INR','AC202','','D04','INR',true,'Active');
insert into Account values('AC303_A02_INR','AC303','','A02','INR',false,'Active');
insert into Account values('AC404_C03_EUR_E','AC404','E','C03','EUR',true,'Active');


insert into Liquidity_Sharing_Setup values(101,SYSDATE,201,'Description 1',SYSDATE,301,'Active');
insert into Liquidity_Sharing_Setup values(102,SYSDATE,202,'Description 2',SYSDATE,302,'Active');

insert into Liquidity_Sharing_Account values('AC101_B01_EUR_E',1,SYSDATE,SYSDATE,'Active',SYSDATE,SYSDATE,101);

insert into Liquidity_Sharing_Account_Setup values(1001,'AC101_B01_EUR_E',1,101);
insert into Liquidity_Sharing_Account_Setup values(1002,'AC101_B01_EUR_E',2,102);
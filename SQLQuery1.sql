use afirst
create table stock
(
bookid char(40) primary key,
totalno int,
copies_issued int,
copies_in_stock int
)
select * from stock
select * from bookdetail

use afirst
create table studentdetail
(
student_id char(40) primary key,
pass char(40),
no_of_books int,
amount int,
student_name char(40),
student_add char(40),
student_ph char(40)
)

use afirst
create table issue
(
bookid char(40),
date_issued char(40),
student_id char(40)
)
select * from issue
use afirst
create table bookdetail
(
bookid char(40) primary key,
book_name char(40),
book_author char(40),
tag char(100)
)


insert into studentdetail values ('001','abcdefg',0,0,'John','France','123456788')
insert into studentdetail values ('002','abcdefg',0,0,'Jim','New York','123456786')
insert into studentdetail values ('003','abcdefg',0,0,'Ron','Italy','123456787')

insert into studentdetail values ('005','abcdefg',0,0,'Charlie','Rome','123456789')


update stock
set copies_issued=0
where bookid='b001'

update stock
set copies_issued=0
where bookid='b002'

update stock
set copies_issued=0
where bookid='b003'


select * from bookdetail




create table report
(
return_ char(100),
issue char(100),
fine char(100)
)
select * from report
alter table studentdetail add student_ph char(50)
delete studentdetail
alter table studentdetail drop column  pass
select * from studentdetail
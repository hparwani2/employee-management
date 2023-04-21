--use db employeeDb;
SET SQL_SAFE_UPDATES = 0;

delete from employeeDb.employee_role;
delete from employeeDb.employee;
delete from employeeDb.roles;
delete from employeeDb.department;

insert into employeeDb.department (id,name) values (1,'TECH');
insert into employeeDb.department (id,name) values (2,'HR');


insert into employeeDb.roles (id,role_name) values (1,'ADMIN');
insert into employeeDb.roles (id,role_name) values (2,'EMPLOYEE');
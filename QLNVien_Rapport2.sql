create database QLNV
go
USE QLNV
Go
create table NhanVien(
   idNV   INT              NOT NULL,
   name NVARCHAR (32)     NOT NULL,
   email   NVARCHAR (32)  NOT NULL,
   NgaySinh DATE          NOT NULL,
   Telephone char(12)     NOT NULL,
   BasicSalary FLOAT    NOT NULL,
   type NVARCHAR (32) NOT NULL,
   TimeWork TIME   NOT NULL,
   PRIMARY KEY (idNV)
);
INSERT INTO NhanVien(idNV,name,email,NgaySinh,BasicSalary,type,TimeWork) VALUES (1752050, N'Tran Minh Tri', 'tminhtri16@gmail.com', '16/10/1999', 5000, 'coder', 8);
INSERT INTO NhanVien(idNV,name,email,NgaySinh,BasicSalary,type,TimeWork) VALUES (1752048, N'Luong Trong Tin', 'luongtrongtin19@gmail.com', '2/9/1999', 5000, 'coder', 8);
INSERT INTO NhanVien(idNV,name,email,NgaySinh,BasicSalary,type,TimeWork) VALUES (1752050, N'Mai Trong Nhan', 'tminhtri16@gmail.com', '16/10/1999', 5000, 'coder', 8);  
INSERT INTO NhanVien(idNV,name,email,NgaySinh,BasicSalary,type,TimeWork) VALUES (1752050, N'Ha Anh Tuan', 'tminhtri16@gmail.com', '16/10/1999', 5000, 'coder', 8);



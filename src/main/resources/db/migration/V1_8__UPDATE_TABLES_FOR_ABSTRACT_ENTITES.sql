
------------ GROUP ------------

ALTER TABLE `GROUP`
  ADD COLUMN `CREATED_DATE` datetime,
  ADD COLUMN `UPDATED_DATE` datetime;

UPDATE `GROUP`
  SET START_DATE = '2019-01-10', CREATED_DATE = '2019-01-10', UPDATED_DATE = '2019-01-10'
  WHERE ID = 4;
UPDATE `GROUP`
  SET START_DATE = '2018-09-07', CREATED_DATE = '2018-09-07', UPDATED_DATE = '2018-09-07'
  WHERE ID = 3;
UPDATE `GROUP`
  SET START_DATE = '2018-05-03', CREATED_DATE = '2018-05-03', UPDATED_DATE = '2018-05-03'
  WHERE ID = 2;
UPDATE `GROUP`
  SET START_DATE = '2018-01-09', CREATED_DATE = '2018-01-09', UPDATED_DATE = '2018-01-09'
  WHERE ID = 1;

ALTER TABLE `GROUP` MODIFY CREATED_DATE datetime not null;
ALTER TABLE `GROUP` MODIFY UPDATED_DATE datetime not null;

------------ LESSON ------------

ALTER TABLE `LESSON`
  CHANGE LESSON_DATE CREATED_DATE datetime not null;

ALTER TABLE `LESSON`
  ADD COLUMN `UPDATED_DATE` datetime;

UPDATE `LESSON`
  SET UPDATED_DATE = '2018-03-14'
  WHERE ID = 1;
UPDATE `LESSON`
  SET UPDATED_DATE = '2018-02-14'
  WHERE ID = 2;
UPDATE `LESSON`
  SET UPDATED_DATE = '2018-10-02'
  WHERE ID = 3;
UPDATE `LESSON`
  SET UPDATED_DATE = '2018-08-09'
  WHERE ID = 4;

ALTER TABLE `LESSON` MODIFY UPDATED_DATE datetime not null;

------------ USER_ACCOUNT ------------

ALTER TABLE `USER_ACCOUNT`
  CHANGE REGISTRATION_DATE CREATED_DATE datetime not null;

ALTER TABLE `USER_ACCOUNT`
  ADD COLUMN UPDATED_DATE datetime;

UPDATE `USER_ACCOUNT`
  SET CREATED_DATE = '2018-01-09', UPDATED_DATE = '2018-01-09'
  WHERE ID > 0;

ALTER TABLE `USER_ACCOUNT` MODIFY UPDATED_DATE datetime not null;
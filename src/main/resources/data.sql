INSERT into USER (id, name, username, password, IS_Enabled)  VALUES (111, 'Dean','dean','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a',true);
INSERT into USER (id, name, username, password, IS_Enabled)  VALUES (112, 'Zaineh','zaineh','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a',true);

INSERT into STUDENTS (id, code, name, major) VALUES (1, '33254','Zoljargal','IT');
INSERT into STUDENTS (id, code, name, major) VALUES (2, '33257','Daniel','CEO');
INSERT into STUDENTS (id, code, name, major) VALUES (3, '33256','Duong','SE');
INSERT into STUDENTS (id, code, name, major)  VALUES (4, '33251','James','MM');
--
-- INSERT into STUDENTS (id, code, name, major,USER_ID) VALUES (1, '33254','Zoljargal','IT',111);
-- INSERT into STUDENTS (id, code, name, major,USER_ID) VALUES (2, '33257','Daniel','CEO',112);
-- INSERT into STUDENTS (id, code, name, major,USER_ID) VALUES (3, '33256','Duong','SE',111);
-- INSERT into STUDENTS (id, code, name, major,USER_ID)  VALUES (4, '33251','James','MM',112);

INSERT INTO ROLE(ROLE_ID, ROLE) VALUES (1, 'CUSTOMER');
INSERT INTO ROLE(ROLE_ID, ROLE) VALUES (2, 'ADMIN');

insert into USER_ROLES(USER_ID, ROLE_ID) values (111, 2);
insert into USER_ROLES(USER_ID, ROLE_ID) values (112, 1);
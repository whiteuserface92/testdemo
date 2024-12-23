-- 프로퍼티 설정 정보

-- spring.application.name=demo
-- # MariaDB 데이터베이스 설정
-- spring.datasource.url=jdbc:mariadb://localhost:3306/test
-- spring.datasource.username=root
-- spring.datasource.password=root
-- spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
--
-- # JPA 설정
-- spring.jpa.hibernate.ddl-auto=update
-- spring.jpa.show-sql=true
-- spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect


-- test.`user` definition

CREATE DATABASE `test` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

CREATE TABLE `user` (
                        `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
                        `user_id` varchar(100) DEFAULT NULL,
                        `user_password` varchar(100) DEFAULT NULL,
                        `input_date` datetime DEFAULT NULL,
                        `input_user_id` varchar(100) DEFAULT NULL,
                        `update_date` datetime DEFAULT NULL,
                        `update_user_id` varchar(100) DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `user`
(id, user_id, user_password, input_date, input_user_id, update_date, update_user_id)
VALUES(1, 'admin', 'admin123', '2024-12-18 00:00:00.000', 'admin', NULL, NULL);
INSERT INTO `user`
(id, user_id, user_password, input_date, input_user_id, update_date, update_user_id)
VALUES(2, 'admin2', 'admin1234', '2024-12-18 17:02:52.000', 'admin', NULL, NULL);
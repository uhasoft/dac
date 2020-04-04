drop table t_role if exists;

CREATE TABLE `t_role` (
       `id` varchar(40) NOT NULL,
       `created_by` varchar(45) DEFAULT NULL,
       `created_at` datetime DEFAULT NULL,
       `last_modified_by` varchar(45) DEFAULT NULL,
       `last_modified_at` datetime DEFAULT NULL,
       `version` int(11) DEFAULT NULL,
       `deleted` decimal(1,0) DEFAULT '0',
       `name` varchar(45) DEFAULT NULL,
       PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `t_role` (`id`,`created_by`,`created_at`,`last_modified_by`,`last_modified_at`,`version`,`deleted`,`name`) VALUES
('ROLE00001','admin',current_timestamp(),'admin',current_timestamp(),0,0,'系统管理员'),
('ROLE00002','admin',current_timestamp(),'admin',current_timestamp(),0,0,'普通用户');


drop table t_resource if exists;

CREATE TABLE `t_resource` (
                          `id` varchar(40) NOT NULL,
                          `created_by` varchar(45) DEFAULT NULL,
                          `created_at` datetime DEFAULT NULL,
                          `last_modified_by` varchar(45) DEFAULT NULL,
                          `last_modified_at` datetime DEFAULT NULL,
                          `version` int(11) DEFAULT NULL,
                          `deleted` decimal(1,0) DEFAULT '0',
                          `name` varchar(45) DEFAULT NULL,
                          `alias` varchar(45) DEFAULT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `t_resource` (`id`,`created_by`,`created_at`,`last_modified_by`,`last_modified_at`,`version`,`deleted`,`name`,`alias`) VALUES
('RES00001','admin',current_timestamp(),'admin',current_timestamp(),0,0,'系统管理','system'),
('RES00002','admin',current_timestamp(),'admin',current_timestamp(),0,0,'订单', 'order');



drop table t_right if exists;

CREATE TABLE `t_right` (
                              `id` varchar(40) NOT NULL,
                              `created_by` varchar(45) DEFAULT NULL,
                              `created_at` datetime DEFAULT NULL,
                              `last_modified_by` varchar(45) DEFAULT NULL,
                              `last_modified_at` datetime DEFAULT NULL,
                              `version` int(11) DEFAULT NULL,
                              `deleted` decimal(1,0) DEFAULT '0',
                              `name` varchar(45) DEFAULT NULL,
                              `resource_id` varchar(45) DEFAULT NULL,
                              `right_type` varchar(45) DEFAULT NULL,
                              `limitation` varchar(45) DEFAULT NULL,
                              `description` varchar(100) DEFAULT NULL,
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `t_right` (`id`,`created_by`,`created_at`,`last_modified_by`,`last_modified_at`,`version`,`deleted`,`name`,`resource_id`,`right_type`,`limitation`,`description`) VALUES
('RES00001','admin',current_timestamp(),'admin',current_timestamp(),0,0,'系统管理','RES00001','all','true','超级管理员权限'),
('RES00002','admin',current_timestamp(),'admin',current_timestamp(),0,0,'查看订单','RES00001','view','true','查看订单');

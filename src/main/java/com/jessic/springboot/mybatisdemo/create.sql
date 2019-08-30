CREATE TABLE `t_student` (
  `FuiId` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '学号',
  `FstrName` varchar(60) NOT NULL DEFAULT '' COMMENT '姓名',
  `FuiSex` tinyint(4) NOT NULL DEFAULT '0' COMMENT '性别: 0 男, 1 女',
  `FuiAge` tinyint(4) NOT NULL DEFAULT '10' COMMENT '年龄'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息表';
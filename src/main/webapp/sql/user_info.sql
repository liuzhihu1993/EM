/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50168
Source Host           : localhost:3306
Source Database       : expensemanage

Target Server Type    : MYSQL
Target Server Version : 50168
File Encoding         : 65001

Date: 2017-09-12 18:07:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `user_sex` varchar(10) DEFAULT NULL,
  `user_age` int(11) DEFAULT NULL,
  `user_account` varchar(100) DEFAULT NULL,
  `user_password` varchar(100) DEFAULT NULL,
  `user_salary` double(10,2) DEFAULT NULL,
  `user_mark` varchar(5) DEFAULT NULL COMMENT '0 激活   1 锁定',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '2', '张小三', '男', '18', 'admin', 'c94d5dc72449bf2a4425065c8d47cb6c', '500.00', '1');

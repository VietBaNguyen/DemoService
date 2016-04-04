/*
Navicat MySQL Data Transfer

Source Server         : mysql 5.6
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : spotifire

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2016-04-03 11:34:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`username`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`password`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=7

;

-- ----------------------------
-- Records of account
-- ----------------------------
BEGIN;
INSERT INTO `account` VALUES ('1', 'vietba', '12345'), ('2', 'loinao', '234567'), ('3', 'tuongtu', 'dfgjkl'), ('4', 'HaQuang', '345678'), ('5', 'DangQuang', '567890'), ('6', null, null);
COMMIT;

-- ----------------------------
-- Auto increment value for `account`
-- ----------------------------
ALTER TABLE `account` AUTO_INCREMENT=7;

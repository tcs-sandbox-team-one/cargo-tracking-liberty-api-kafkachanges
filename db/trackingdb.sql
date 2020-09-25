CREATE SCHEMA `trackingmsdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
use trackingmsdb;

CREATE USER 'trackingmsdb'@'%' IDENTIFIED BY 'trackingmsdb';
GRANT ALL PRIVILEGES ON trackingmsdb.* TO 'trackingmsdb'@'%';

##Tracking_activity DDL
 CREATE TABLE `tracking_activity` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `tracking_number` varchar(20) NOT NULL,
  `booking_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

##Tracking_handling_events DDL
  CREATE TABLE `tracking_handling_events` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `tracking_id` int(11) DEFAULT NULL,
  `event_type` varchar(225) DEFAULT NULL,
  `event_time` timestamp NULL DEFAULT NULL,
  `location_id` varchar(100) DEFAULT NULL,
  `voyage_number` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
DROP TABLE IF EXISTS booking_details;
DROP TABLE IF EXISTS hotel;

CREATE TABLE hotel (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  room_num VARCHAR(250) NOT NULL,
  hotel_name VARCHAR(250) NOT NULL,
  city VARCHAR(250) NOT NULL,
  price int
);

CREATE TABLE booking_details (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  room_id INT,
  date VARCHAR(250) NOT NULL,
  FOREIGN KEY (room_id) REFERENCES hotel(id)
);

INSERT INTO hotel (room_num, hotel_name, city, price) VALUES ('101', 'HolidyInn', 'Chennai', 1000);
INSERT INTO hotel (room_num, hotel_name, city, price) VALUES ('102', 'HolidyInn', 'Chennai', 2000);
INSERT INTO hotel (room_num, hotel_name, city, price) VALUES ('103', 'HolidyInn', 'Bangalore', 3000);
INSERT INTO hotel (room_num, hotel_name, city, price) VALUES ('101', 'Staybridge', 'Chennai', 1000);
INSERT INTO hotel (room_num, hotel_name, city, price) VALUES ('104', 'Staybridge', 'Chennai', 5000);

INSERT INTO booking_details (room_id, date) VALUES (1, '23-Aug-2019');
INSERT INTO booking_details (room_id, date) VALUES (3, '24-Aug-2019');
INSERT INTO booking_details (room_id, date) VALUES (4, '23-Aug-2019');
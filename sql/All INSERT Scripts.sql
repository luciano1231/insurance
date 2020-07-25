INSERT INTO `insurance`.`company` (`description`) VALUES ('UberDeLuciano');

INSERT INTO `insurance`.`offices` (`name`, `Company_id`) VALUES ('Toronto', '1');
INSERT INTO `insurance`.`offices` (`name`, `Company_id`) VALUES ('CDM', '1');
INSERT INTO `insurance`.`offices` (`name`, `Company_id`) VALUES ('Buenos Aires', '1');


INSERT INTO `insurance`.`countries` (`name`) VALUES ('Argentina');
INSERT INTO `insurance`.`countries` (`name`) VALUES ('Brasil');
INSERT INTO `insurance`.`countries` (`name`) VALUES ('Italy');
INSERT INTO `insurance`.`countries` (`name`) VALUES ('Paraguay');

INSERT INTO `insurance`.`cities` (`name`, `Countries_id`) VALUES ('Corrientes', '1');
INSERT INTO `insurance`.`cities` (`name`, `Countries_id`) VALUES ('Brasilia', '2');
INSERT INTO `insurance`.`cities` (`name`, `Countries_id`) VALUES ('Rome', '3');
INSERT INTO `insurance`.`cities` (`name`, `Countries_id`) VALUES ('Asuncion', '4');

INSERT INTO `insurance`.`brands` (`description`) VALUES ('Renault');
INSERT INTO `insurance`.`brands` (`description`) VALUES ('Nissan');
INSERT INTO `insurance`.`brands` (`description`) VALUES ('Chevrolet');
INSERT INTO `insurance`.`brands` (`description`) VALUES ('Toyota');
INSERT INTO `insurance`.`brands` (`description`) VALUES ('Hyundai');

INSERT INTO `insurance`.`models` (`description`, `Brands_id`) VALUES ('Logan', '1');
INSERT INTO `insurance`.`models` (`description`, `Brands_id`) VALUES ('Terra', '2');
INSERT INTO `insurance`.`models` (`description`, `Brands_id`) VALUES ('Onix', '3');
INSERT INTO `insurance`.`models` (`description`, `Brands_id`) VALUES ('Prado', '4');
INSERT INTO `insurance`.`models` (`description`, `Brands_id`) VALUES ('Accent', '5');

INSERT INTO `insurance`.`coverages` (`description`, `amount`, `details`) VALUES ('premium', '1000', 'total');
INSERT INTO `insurance`.`coverages` (`description`, `amount`, `details`) VALUES ('full', '800', 'all');
INSERT INTO `insurance`.`coverages` (`description`, `amount`, `details`) VALUES ('average', '600', 'some');
INSERT INTO `insurance`.`coverages` (`description`, `amount`, `details`) VALUES ('low', '400', 'almost none');

INSERT INTO `insurance`.`cars` (`chasis_no`, `color`, `year`, `Models_id`) VALUES ('2255', 'yellow', '1990', '1');
INSERT INTO `insurance`.`cars` (`chasis_no`, `color`, `year`, `Models_id`) VALUES ('2255', 'black', '2020', '2');
INSERT INTO `insurance`.`cars` (`chasis_no`, `color`, `year`, `Models_id`) VALUES ('6655', 'red', '2019', '3');
INSERT INTO `insurance`.`cars` (`chasis_no`, `color`, `year`, `Models_id`) VALUES ('6668', 'red', '2018', '4');
INSERT INTO `insurance`.`cars` (`chasis_no`, `color`, `year`, `Models_id`) VALUES ('4412', 'blue', '2015', '1');
INSERT INTO `insurance`.`cars` (`chasis_no`, `color`, `year`, `Models_id`) VALUES ('1515', 'cyan', '2020', '2');
INSERT INTO `insurance`.`cars` (`chasis_no`, `color`, `year`, `Models_id`) VALUES ('3215', 'grey', '2010', '3');
INSERT INTO `insurance`.`cars` (`chasis_no`, `color`, `year`, `Models_id`) VALUES ('8412', 'blue', '2010', '4');

INSERT INTO `insurance`.`employees` (`name`, `phone`, `email`, `Offices_id`) VALUES ('Luciano', '654654', 'correo@gmail.com', '1');
INSERT INTO `insurance`.`employees` (`name`, `phone`, `email`, `Offices_id`) VALUES ('Matias', '987987', 'correo@gmail.com', '1');
INSERT INTO `insurance`.`employees` (`name`, `phone`, `email`, `Offices_id`) VALUES ('Nicolas', '321321', 'correo@gmail.com', '2');
INSERT INTO `insurance`.`employees` (`name`, `phone`, `email`, `Offices_id`) VALUES ('Ana', '654321', 'correo@gmail.com', '2');
INSERT INTO `insurance`.`employees` (`name`, `phone`, `email`, `Offices_id`) VALUES ('Fabiana', '987951', 'correo@gmail.com', '3');

INSERT INTO `insurance`.`payments` (`date`, `amount`) VALUES ('20200820', '500');
INSERT INTO `insurance`.`payments` (`date`, `amount`) VALUES ('20200823', '600');
INSERT INTO `insurance`.`payments` (`date`, `amount`) VALUES ('20200824', '800');
INSERT INTO `insurance`.`payments` (`date`, `amount`) VALUES ('20200825', '800');
INSERT INTO `insurance`.`payments` (`date`, `amount`) VALUES ('20200823', '1000');
INSERT INTO `insurance`.`payments` (`date`, `amount`) VALUES ('20200821', '600');

INSERT INTO `insurance`.`customers` (`name`, `email`, `birth_date`) VALUES ('Delia', 'diegddo@hotmail.com', '19901212');
INSERT INTO `insurance`.`customers` (`name`, `email`, `birth_date`) VALUES ('Correa', 'diegddo@hotmail.com', '19901212');
INSERT INTO `insurance`.`customers` (`name`, `email`, `birth_date`) VALUES ('Gomez', 'diegddo@hotmail.com', '19901212');
INSERT INTO `insurance`.`customers` (`name`, `email`, `birth_date`) VALUES ('Gonzalez', 'diegddo@hotmail.com', '19901212');
INSERT INTO `insurance`.`customers` (`name`, `email`, `birth_date`) VALUES ('Jensen', 'diegddo@hotmail.com', '19901212');
INSERT INTO `insurance`.`customers` (`name`, `email`, `birth_date`) VALUES ('Diega', 'diegddo@hotmail.com', '19901212');

INSERT INTO `insurance`.`phones` (`detail`, `number`, `customers_id`, `employees_id`, `Offices_id`) VALUES ('home', '654987', '1', '1', '1');
INSERT INTO `insurance`.`phones` (`detail`, `number`, `customers_id`, `employees_id`, `Offices_id`) VALUES ('home', '654321', '2', '4', '1');
INSERT INTO `insurance`.`phones` (`detail`, `number`, `customers_id`, `employees_id`, `Offices_id`) VALUES ('work', '332332', '3', '3', '1');
INSERT INTO `insurance`.`phones` (`detail`, `number`, `customers_id`, `employees_id`, `Offices_id`) VALUES ('work', '832198', '1', '2', '1');
INSERT INTO `insurance`.`phones` (`detail`, `number`, `customers_id`, `employees_id`, `Offices_id`) VALUES ('work', '9846514', '4', '1', '1');
INSERT INTO `insurance`.`phones` (`detail`, `number`, `customers_id`, `employees_id`, `Offices_id`) VALUES ('work', '87654', '5', '3', '1');
INSERT INTO `insurance`.`phones` (`detail`, `number`, `customers_id`, `employees_id`, `Offices_id`) VALUES ('work', '8655665', '5', '2', '1');

INSERT INTO `insurance`.`address` (`street`, `number`, `Cities_id`) VALUES ('Moreno', '2020', '1');
INSERT INTO `insurance`.`address` (`street`, `number`, `Cities_id`) VALUES ('Rivadavia', '159', '2');
INSERT INTO `insurance`.`address` (`street`, `number`, `Cities_id`) VALUES ('Spain', '1582', '3');
INSERT INTO `insurance`.`address` (`street`, `number`, `Cities_id`) VALUES ('Italia', '58', '4');
INSERT INTO `insurance`.`address` (`street`, `number`, `Cities_id`) VALUES ('Uruguay', '543', '1');
INSERT INTO `insurance`.`address` (`street`, `number`, `Cities_id`) VALUES ('Corrientes', '123', '2');

INSERT INTO `insurance`.`houses` (`size`, `rooms`, `address_id`) VALUES ('200', '2', '2');
INSERT INTO `insurance`.`houses` (`size`, `rooms`, `address_id`) VALUES ('150', '2', '1');
INSERT INTO `insurance`.`houses` (`size`, `rooms`, `address_id`) VALUES ('100', '3', '3');
INSERT INTO `insurance`.`houses` (`size`, `rooms`, `address_id`) VALUES ('200', '5', '1');
INSERT INTO `insurance`.`houses` (`size`, `rooms`, `address_id`) VALUES ('180', '5', '2');
INSERT INTO `insurance`.`houses` (`size`, `rooms`, `address_id`) VALUES ('230', '5', '3');
INSERT INTO `insurance`.`houses` (`size`, `rooms`, `address_id`) VALUES ('320', '5', '1');

INSERT INTO `insurance`.`products` (`details`, `Coverages_id`, `Cars_id`, `Houses_id`) VALUES ('some details', '1', '5', '8');
INSERT INTO `insurance`.`products` (`details`, `Coverages_id`, `Cars_id`, `Houses_id`) VALUES ('some details', '2', '2', '9');
INSERT INTO `insurance`.`products` (`details`, `Coverages_id`, `Cars_id`, `Houses_id`) VALUES ('some details', '3', '3', '10');
INSERT INTO `insurance`.`products` (`details`, `Coverages_id`, `Cars_id`, `Houses_id`) VALUES ('some details', '1', '4', '11');
INSERT INTO `insurance`.`products` (`details`, `Coverages_id`, `Cars_id`, `Houses_id`) VALUES ('some details', '2', '2', '12');
INSERT INTO `insurance`.`products` (`details`, `Coverages_id`, `Cars_id`, `Houses_id`) VALUES ('some details', '3', '3', '13');
INSERT INTO `insurance`.`products` (`details`, `Coverages_id`, `Cars_id`, `Houses_id`) VALUES ('some details', '1', '5', '14');

INSERT INTO `insurance`.`request` (`date_payment`, `customers_id`, `products_id`, `total`, `payments_id`, `details`, `employees_id`) VALUES ('20200620', '1', '29', '2000', '1', 'some details', '1');
INSERT INTO `insurance`.`request` (`date_payment`, `customers_id`, `products_id`, `total`, `payments_id`, `details`, `employees_id`) VALUES ('20200628', '2', '30', '1500', '2', 'some details', '2');
INSERT INTO `insurance`.`request` (`date_payment`, `customers_id`, `products_id`, `total`, `payments_id`, `details`, `employees_id`) VALUES ('20200621', '3', '31', '6000', '3', 'some details', '3');
INSERT INTO `insurance`.`request` (`date_payment`, `customers_id`, `products_id`, `total`, `payments_id`, `details`, `employees_id`) VALUES ('20200622', '4', '32', '8000', '4', 'some details', '1');
INSERT INTO `insurance`.`request` (`date_payment`, `customers_id`, `products_id`, `total`, `payments_id`, `details`, `employees_id`) VALUES ('20200629', '5', '33', '1000', '5', 'some details', '2');
INSERT INTO `insurance`.`request` (`date_payment`, `customers_id`, `products_id`, `total`, `payments_id`, `details`, `employees_id`) VALUES ('20200628', '6', '34', '1200', '1', 'some details', '3');
INSERT INTO `insurance`.`request` (`date_payment`, `customers_id`, `products_id`, `total`, `payments_id`, `details`, `employees_id`) VALUES ('20200627', '1', '35', '200', '2', 'some details', '4');
INSERT INTO `insurance`.`request` (`date_payment`, `customers_id`, `products_id`, `total`, `payments_id`, `details`, `employees_id`) VALUES ('20200625', '1', '31', '2000', '3', 'some details', '2');

UPDATE insurance.request
SET total = 250
WHERE id = 2;

UPDATE insurance.customers
SET name = "Luciana"
WHERE id = 1;

DELETE FROM insurance.cities 
WHERE name = "Corrientes";

SELECT *, count(amount)
FROM insurance.coverages cv
HAVING cv.amount > 200
ORDER BY details;

SELECT *, avg(amount) "Total"
FROM insurance.coverages cv
HAVING avg(amount) > 200 
ORDER BY details;

SELECT *
FROM insurance.brands 
ORDER BY description;

SELECT h.size, h.rooms, count(rooms)
FROM insurance.houses h
HAVING count(rooms) >2;

SELECT * FROM insurance.payments;

SELECT date as Date, amount as Amount, avg(amount)
FROM insurance.payments
HAVING avg(amount) > 500
ORDER BY amount DESC;

SHOW VARIABLES WHERE VARIABLE_NAME in("hostname", "port");

SELECT c.name AS Country, cy.name AS City
FROM insurance.countries c
INNER JOIN insurance.cities cy ON c.id=cy.id
ORDER BY cy.name;

SELECT * 
FROM insurance.brands br
INNER JOIN insurance.models md ON md.Brands_id = br.id
INNER JOIN insurance.cars cr ON md.id = cr.Models_id
INNER JOIN insurance.products pr ON cr.id = pr.Cars_id
INNER JOIN insurance.coverages cv ON pr.Coverages_id = cv.id
INNER JOIN insurance.request rq ON pr.id = rq.products_id
INNER JOIN insurance.payments py ON py.id = rq.payments_id
INNER JOIN insurance.customers ct ON ct.id = rq.customers_id
INNER JOIN insurance.employees ye ON ye.id = rq.employees_id
INNER JOIN insurance.offices off ON off.id = ye.Offices_id
INNER JOIN insurance.company ny ON ny.id = off.Company_id
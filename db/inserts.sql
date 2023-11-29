INSERT INTO client (id, email, name) VALUES (1, 'a@a.com', 'Cliente A');
INSERT INTO client (id, email, name) VALUES (2, 'b@b.com', 'Cliente B');
INSERT INTO client (id, email, name) VALUES (3, 'c@c.com', 'Cliente C');

INSERT INTO product (id, name, value) VALUES (1, 'Boné', 25);
INSERT INTO product (id, name, value) VALUES (2, 'Bola', 120);
INSERT INTO product (id, name, value) VALUES (3, 'Bermuda', 60);
INSERT INTO product (id, name, value) VALUES (4, 'Camiseta', 80);
INSERT INTO product (id, name, value) VALUES (5, 'Chuteira', 130);

INSERT INTO buy (id, data, quantity, status, client_id, product_id) VALUES (1, '2020-01-09 11:13:42', 10, 'OK', 1, 1);
INSERT INTO buy (id, data, quantity, status, client_id, product_id) VALUES (2, '2020-01-09 11:13:46', 20, 'OK', 1, 2);
INSERT INTO buy (id, data, quantity, status, client_id, product_id) VALUES (3, '2020-01-09 11:13:48', 30, 'OK', 1, 3);
INSERT INTO buy (id, data, quantity, status, client_id, product_id) VALUES (4, '2020-01-09 11:13:50', 40, 'OK', 1, 4);
INSERT INTO buy (id, data, quantity, status, client_id, product_id) VALUES (5, '2020-01-09 11:13:53', 50, 'OK', 1, 5);


INSERT INTO admin (username, password) VALUES ('oussama atifi', 'book00');


INSERT INTO BOOKS (title, Writer, edition, pupDate) 
VALUES 
('To Kill a Mockingbird', 'Harper Lee', 'First Edition', '1960-07-11'),
('1984', 'George Orwell', 'First Edition', '1949-06-08'),
('The Catcher in the Rye', 'J.D. Salinger', 'First Edition', '1951-07-16'),
('The Lord of the Rings', 'J.R.R. Tolkien', 'First Edition', '1954-07-29'),
('Pride and Prejudice', 'Jane Austen', 'First Edition', '1813-01-28');

INSERT INTO membre (nom, prenom, address, telephone, email) 
VALUES 
('Doe', 'John', '123 Main Street, Cityville', '5551234', 'john@gmai.com'),
('Smith', 'Alice', '456 Elm Street, Townsville', '5555678', 'outlook.com'),
('Johnson', 'Bob', '789 Oak Street, Villagetown', '55591011', 'bob@hotmail.com');

select * from membre

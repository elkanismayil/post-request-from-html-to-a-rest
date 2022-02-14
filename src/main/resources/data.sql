DROP TABLE IF EXISTS book;
CREATE TABLE book(book_id INT PRIMARY KEY AUTO_INCREMENT, book_name VARCHAR(100), author VARCHAR(100));

INSERT INTO book (book_name, author) VALUES ('To Kill a Mockingbird', 'Harper Lee');
INSERT INTO book (book_name, author) VALUES ('The Great Gatsby', 'F. Scott Fitzgerald');
INSERT INTO book (book_name, author) VALUES ('The Adventures of Huckleberry Finn', 'Mark Twain');
INSERT INTO book (book_name, author) VALUES ('The Catcher in the Rye', 'J.D. Salinger');


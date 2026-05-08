# 📖 Library Management System - Hodges Figgis

A **Java-based** management system developed to handle a book collection, allowing users to perform full CRUD (Create, Read, Update, Delete) operations through a terminal interface.

## 🚀 Features
* **Register Books:** Support for both Physical and Digital book types.
* **Collection Listing:** Detailed view of all registered items in the system.
* **Update:** Modify data for books already stored in the collection.
* **Delete:** Remove items from the collection using a title-based search.
* **Smart Search:** Built-in logic to handle case-insensitivity and accidental trailing spaces.

## 🛠️ OOP Concepts Applied
This project demonstrates the core pillars of **Object-Oriented Programming (OOP)**:
- **Abstraction:** Use of abstract classes as a blueprint for products.
- **Inheritance:** The `LivroDigital` class extends the `Produto` base class, inheriting attributes and methods.
- **Encapsulation:** Private attributes protected by public Getters and Setters to ensure data integrity.
- **Polymorphism:** Method overriding (`@Override`) used in the `visualizar()` method to provide specific behaviors for different book types.

## 🏗️ Project Architecture
The project is organized into clear packages following clean code principles:
- `model`: Contains data classes and object logic.
- `repository`: The interface defining the system's contract.
- `controller`: Logic implementation and management of the `ArrayList`.
- `menu`: The main class providing the user console interface.

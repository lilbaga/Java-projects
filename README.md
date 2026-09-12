# Assignment #1 — Builder Design Pattern

## Course Information
* **Course:** Software Design Patterns (SE-2502)
* **Institution:** Astana IT University 
* **Student:** Шындалы Бағнұр Болатқызы

---

## 1. Project Overview
This project implements the **Builder** creational design pattern in Java (JDK 17). The chosen product domain is a **Car**, which benefits significantly from step-by-step construction due to its complex configuration options (such as brand, model, seating capacity, engine type, and optional features like GPS navigation).

The application demonstrates both manual step-by-step creation using a fluent API (method chaining) and automated pre-set configuration using a Director class.

---

## 2. Project Structure
The project is organized into clean packages following object-oriented design standards:
* **`model`**: Contains the complex product class (`Car`).
* **`builder`**: Contains the builder interface (`CarBuilder`) and concrete builders (`SportsCarBuilder`, `SUVCarBuilder`) with built-in validation.
* **`director`**: Contains the orchestrator class (`CarDirector`) for reusable configurations.
* **`client`**: Contains the demo client class (`CarClient`) that executes the builder logic.
* **`Main.java`**: The main execution entry point located in the root `src` directory.

---

## 3. How to Build Each Representation

The project features two distinct concrete builders that enforce strict domain representations:

1. **Sports Car Representation (`SportsCarBuilder`)**:
    * Designed for high-performance vehicles.
    * Enforces seating capacity constraints (strictly 1 or 2 seats).
    * Validates mandatory fields (brand, model, engine) upon calling `.build()`.

2. **SUV Representation (`SUVCarBuilder`)**:
    * Designed for heavy-duty family and off-road vehicles.
    * Enforces seating capacity constraints (between 4 and 9 seats).
    * Validates mandatory attributes before finalizing object creation.

---

## 4. How to Run It

1. Open the project in **IntelliJ IDEA** (JDK 17 recommended).
2. Navigate to `src/Main.java`.
3. Click the green **Run (▶)** icon next to the `main` method or press `Shift + F10`.
4. View the output in the console window, which displays the products created via both the Director and custom builder chains.
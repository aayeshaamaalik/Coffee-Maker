# Coffee Maker System

This project implements a **Coffee Maker System** designed using the **Decorator Design Pattern**. It allows flexible construction of different coffee beverages by combining base coffee types with various add-in ingredients dynamically at runtime.

**Design Reference:**  
This design is modeled following the principles outlined in the [Coffee Maker system from ycwkatie's OOD repository](https://github.com/ycwkatie/OOD-Object-Oriented-Design/blob/main/ood/coffee_maker.md).

---

## Key Components and Interacting Objects

| Class / Interface       | Responsibility                                                                    |
|--------------------------|----------------------------------------------------------------------------------|
| `Coffee`                 | Abstract class representing all coffee beverages. Declares the `cost()` method. |
| `Espresso`, `DarkRoast`, `Decaf` | Concrete classes for basic coffee types. Implement `cost()`.              |
| `CoffeeDecorator`        | Abstract class extending `Coffee`. Wraps another `Coffee` object.               |
| `Milk`, `Soy`, `Mocha`   | Concrete decorators that add ingredients and additional cost to a `Coffee`.     |
| `CoffeePack`             | Configuration class holding the base coffee and list of selected add-ons.       |
| `CoffeeMaker`            | Controller that brews a `CoffeePack` into a final decorated `Coffee` beverage.  |

---

## Class Hierarchy and Build-Up

```
Coffee (abstract)
   ├── Espresso (concrete)
   ├── Decaf (concrete)
   └── DarkRoast (concrete)

CoffeeDecorator (abstract) --> extends Coffee
   ├── Milk (concrete decorator) --> wraps Coffee
   ├── Soy (concrete decorator) --> wraps Coffee
   └── Mocha (concrete decorator) --> wraps Coffee

CoffeePack (helper) --> holds Coffee + List<String> (add-ons)

CoffeeMaker (controller) --> uses CoffeePack, dynamically wraps add-ons over Coffee
```

This structure enables flexible and dynamic assembly of beverages without creating an explosion of subclasses.

---

## User Action Flow

The Coffee Maker System supports creating customized coffee beverages by following these steps:

1. **Choose a base coffee**  
   Select a base coffee type such as `Espresso`, `Decaf`, or `DarkRoast`.

2. **Select add-in ingredients**  
   Choose optional add-ins such as `Milk`, `Soy`, and `Mocha`.

3. **Brew the beverage**  
   Use `CoffeeMaker.brew(CoffeePack)` to apply all selected add-ins and produce the final beverage.

4. **Calculate the final cost**  
   The `cost()` method on the resulting `Coffee` object calculates the cumulative price based on the base coffee and all added ingredients.

---

## Getting Started

To set up and run the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/coffee-maker-system.git
   ```

2. Navigate into the project directory:
   ```bash
   cd coffee-maker-system
   ```

3. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

4. Compile and run the system.  
   Ensure your environment supports **Java 8+**.

---

## Usage Example

```java
Coffee coffee = new Espresso();
coffee = new Milk(coffee);
coffee = new Mocha(coffee);

System.out.println("Total Cost: $" + coffee.cost());
```

This example constructs an Espresso with Milk and Mocha add-ins and prints the final total cost.

---

## Project Structure

| Package           | Responsibility                                             |
|-------------------|-------------------------------------------------------------|
| `core`            | Contains `Coffee` base class and basic coffee implementations |
| `decorators`      | Contains `CoffeeDecorator` and add-on ingredient classes     |
| `controller`      | Contains `CoffeeMaker` and `CoffeePack` classes              |

---

## Design Pattern

| Pattern    | Description                                                                 |
|------------|-----------------------------------------------------------------------------|
| Decorator  | Used to add dynamic, layered behavior (ingredients) without altering classes. Each decorator wraps a `Coffee` object and modifies the result of the `cost()` method.|

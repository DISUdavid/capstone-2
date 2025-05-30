# DavidsDeliToBelly

DavidsDeliToBelly is a Java console application that allows users to build a custom deli sandwich by selecting meats, cheeses, sauces, and optional extras like chips and drinks. The app uses clean object-oriented principles with interfaces, enums, and modular class design, following the patterns taught in the course workbooks.

---

## 🧱 Features

- 🥪 Build a fully customized sandwich
- 🔥 Option to toast the sandwich
- 🧂 Add sauces to your sandwich
- 🍟 Add chips to your order
- 🥤 Select drinks with size-based pricing
- 💵 Automatic pricing through a `Priceable` interface
- 🧾 Detailed order summary showing selections and total cost

---

## 🛠 Technologies

- Java 17+
- IntelliJ IDEA (Community Edition)
- Console-based input using `Scanner`
- No external libraries

---

## 📦 Class Overview

### `Topping`
Represents a sandwich ingredient.
- Fields: `name`, `size`
- Implements `Priceable` to calculate price based on size

### `Size` (enum)
Defines portion sizes:
- `SMALL`, `MEDIUM`, `LARGE`

### `Bread` (enum)
Available bread types:
- `WHITE`, `WHEAT`, `RYE`, `WRAP`

### `OtherProducts`
Represents chips and drinks.
- Fields: `chips` (price), `Size drink`, `boolean hasChips`
- Implements `Priceable`

### `Sandwich`
Main class that handles sandwich construction:
- Gathers user input for meats, cheeses, sauces, and extras
- Applies extra meat/cheese flags
- Handles toasted preference
- Adds chips and drinks

### `Priceable` (interface)
Defines the contract for any item that can be priced by size:
```java
public interface Priceable {
    public double priceBySize();
}

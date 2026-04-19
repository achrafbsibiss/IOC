# Inversion of Control (IOC) & Dependency Injection Project

This repository demonstrates the fundamental concepts of **Inversion of Control (IOC)** and **Dependency Injection (DI)** in Java. It covers multiple approaches for managing dependencies, ranging from manual static instantiation to modern frameworks like **Spring**.

## 🚀 Project Overview

The project follows a standard 3-tier architecture:
- **DAO Layer**: Data access interfaces and implementations.
- **Service (Metier) Layer**: Business logic interfacing with the DAO layer.
- **Presentation Layer**: Entry point demonstrating different injection techniques.

---

## 🛠 Project Structure

```text
src/main/java/net/achraf/
├── dao/                # Data Access Object Layer
│   ├── IDao.java       # DAO Interface
│   └── DaoImpl.java    # Default Implementation
├── metier/             # Business Logic Layer
│   ├── IMetier.java    # Service Interface
│   └── MetierImpl.java # Service Implementation
├── ext/                # Extensions
│   └── DaoImplV2.java  # Alternative DAO Implementation
└── pres/               # Presentation Layer (Various DI Methods)
    ├── Pres1.java           # Static Injection
    ├── Pres2.java           # Dynamic Injection (Reflection)
    ├── PresSpringXML.java   # Spring Injection (XML)
    └── PresSpringAnot.java # Spring Injection (Annotations)
```

---

## 🏗 Dependency Injection Methods

### 1. Static Instantiation (`Pres1`)
Traditional way of coupling components using the `new` keyword. 
- **Pros**: Simple, no external dependencies.
- **Cons**: High coupling; changing an implementation requires code modifications.

### 2. Dynamic Instantiation (`Pres2`)
uses Java **Reflection API** to decouple the code from concrete implementations. The classes are loaded at runtime based on the `config.txt` file.
- **Configuration**: `config.txt`
- **Pros**: Implementations can be changed without recompiling.

### 3. Spring XML Configuration (`PresSpringXML`)
Leverages the Spring Framework's IOC container using an XML configuration file.
- **Configuration**: `src/main/resources/config.xml`
- **Dependency**: `spring-context`

### 4. Spring Annotation-Based Configuration (`PresSpringAnot`)
The modern approach using Spring annotations like `@Component`, `@Repository`, `@Service`, and `@Autowired`.
- **Mechanism**: Component scanning in specified packages.
- **Pros**: Minimal boiler-plate, easy to maintain.

---

## ⚙️ Configuration Files

- **`pom.xml`**: Maven configuration with Spring dependencies.
- **`config.txt`**: Used by `Pres2` for reflection-based loading.
  - Line 1: FQCN (Fully Qualified Class Name) for DAO.
  - Line 2: FQCN for Metier.
- **`config.xml`**: Spring XML context definition.

---

## 🚀 How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/achrafbsibiss/IOC.git
   cd IOC
   ```

2. **Build the project**:
   ```bash
   mvn clean install
   ```

3. **Execute desired presentation class**:
   - For Static: `java -cp target/classes net.achraf.pres.Pres1`
   - For Dynamic: Ensure `config.txt` is updated, then run `Pres2`.
   - For Spring: Run `PresSpringXML` or `PresSpringAnot`.

---

## 📝 Technologies Used

- **Java 22**
- **Spring Framework 6.2.18** (Context, Core, Beans)
- **Maven** for Dependency Management
- **Reflection API** for Dynamic Loading

---


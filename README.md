
# Aliens vs Humans

## Overview

The "Aliens vs Humans" project is a simple Java application that simulates interactions between alien and human entities.
The project has been made for practicing purposes of unit testing. 

## Classes
- `Entity`: An abstract base class representing a general entity with a name and health.
- `Alien`: A subclass of `Entity` representing an alien with additional attributes.
- `Human`: A subclass of `Entity` representing a human with additional attributes.
- `Demo`: A class containing methods to demonstrate the functionality of entities.

## Unit Tests

The following unit tests are included:

- 'EntityTest': Tests for the Entity class, including creation and setter methods.
- 'AlienTest': Tests for the Alien class, including creation, getter and setter methods, and additional attributes.
- 'HumanTest': Tests for the Human class, including creation, getter and setter methods, and additional attributes.

## Technologies
- Java
- JUnit 5
- Maven

## Running the Tests

To run all the tests execute the following command:
```bash
$ mvn clean
```
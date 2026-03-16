# Purpose of Money Class

This class represents money as a value object

Goal:

    Represent money safety and prevent invalid financial values.

This class ensures:

    money >= 0
    money cannot change after creation
    all operations return new objects

This is called **Immutable Encapsulation**
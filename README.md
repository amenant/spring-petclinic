This is a simple version of Spring pet-clinic (AngularJS version) in Spring Boot with only Spring Data JPA.


Spring User Group - Exercice : Reverse last name of owners

- You need to write a Service, call it OwnerUtils for example
- Write a reverse method inside this service that reverse a String (use TDD!)
- Write a reverseLastName method that loop on a Collection of Owner and reverse their lastnames
- Inject this service inside ClinicServiceImpl
- Use the reverseLastName method in the findOwnerByLastName method
- Write a test that mock the repository call and test the good reversion of your owners' lastnames
  - If you declare OwnerUtils as @Mock in your test, it doesn't work, why ?
  - use @Spy instead of @Mock and relaunch your test  

# Restaurant HQL Project

Package: `com.klef.fsad.exam`

Includes:
- `Restaurant` entity class with ID, Name, Date, Status and additional fields
- `ClientDemo` class for insert and HQL update using named parameters
- MySQL database configuration for `fsadendexam`

## HQL Update Used
```java
update Restaurant set name = :rname, status = :rstatus where id = :rid
```

## Database
Create the MySQL database before running:
```sql
create database fsadendexam;
```

## Run
```bash
mvn compile exec:java -Dexec.mainClass=com.klef.fsad.exam.ClientDemo
```

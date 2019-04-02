# java-comt

### jpa

##### 数据库配置
```
mysql> create database db_example; -- Create the new database
mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all the privileges to the new user on the newly created database

##### 访问

$ curl 'localhost:8080/demo/add?name=First&email=someemail@someemailprovider.com'

$ curl 'localhost:8080/demo/all'


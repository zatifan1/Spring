# Spring

Был создан target/Spring.jar, во время создания не было ошибок, но во время запуска jar файла выходит ошибка "Error: Could not find or load main class spring.AccountApplication".
Пробовал многие варианты решения из интернета, все кроме переустановки IntelliJ Idea, нет возможности скачать такой большой файл.

С самого проекта все запускается, в качестве БД используется H2.

Вход в консоль базы данных http://localhost:8080/h2-console/ логин: zatifan пароль: Rjdijdjq10

http://localhost:8080/api/accounts вывод данных в виде JSON

Так же можно отправить запросы с помощью curl

curl -X POST -H "Content-Type: application/json" -d "{\"firstName\":\"zakir11\",\"surname\":\"kuchukov22\",\"birthday\":\"1995-11-03\",\"email\":\"zatifan21@list.ru\",\"pass\":\"12321341234\"}" http://localhost:8080/api/accounts

curl -X "DELETE" http://localhost:8080/api/accounts/1

curl -H "Content-Type: application/json" http://localhost:8080/api/accounts/1

Запись в файл происходит в /init/DataInit, записывает в test.txt. Использовалась хеширование паролей, и запись хеша в БД.

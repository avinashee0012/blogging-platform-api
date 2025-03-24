# [COMPLETE] Blogging Platform API

A simple RESTful API with basic CRUD operations for a personal blogging platform.

### Features
- Create a new blog post
- Update an existing blog post
- Delete an existing blog post
- Get a single blog post
- Get all blog posts
- Filter blog posts by a search term

### Technologies
- **Backend:** Java, Springboot, Rest API, Spring data JPA, MySQL, Bean Validation
- **Source Code Management:** Git, Maven, GitHub

### Installation
1. Clone the repo
```bash
    git git@github.com:avinashee0012/blogging-platform-api.git
    cd blogging-platform-api
```
2. Setup MySQL
    - [Install and Run MySQL](https://dev.mysql.com/doc/mysql-getting-started/en/)
    - Locate MySQL Port, Username and Password
    - Create a database for application

3. Run Jar
```bash
    # Default MySQL port is 3306
    # The default MySQL username is "root", and by default, it has no password on a fresh installation.
    java -jar blogging_platform_api-0.0.1.jar --spring.datasource.url=jdbc:mysql://localhost:<MySQL_PORT>/<DATABASE_NAME> --spring.datasource.username=<MYSQL_USERNAME> --spring.datasource.password=<MySQL_PASSWORD>
```
4. Visit http://localhost:8080/v1/api

NOTE: 
- If port 8080 is busy, another port will be used and can be found from terminal logs (see example below):
![Tomcat_Port_Find_Screenshot](Tomcat_Port_Find_Screenshot.png)

### Usage Example
- Endpoint 1: <code>/</code> --> GET (Get API status)
- Endpoint 2: <code>/posts</code> --> GET (Get all posts), POST (Create a post)
- Endpoint 3: <code>/posts?term=</code> --> GET (Filter all posts by search term)
- Endpoint 4: <code>/posts/{id}</code> --> GET (Get a post by id), PUT (Update a post by id), DELETE (Delete a post by id)

_____
Future Improvements:
1. Implement Redis cache.

####
Project Idea: [roadmap.sh](https://roadmap.sh/projects/blogging-platform-api)
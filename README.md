# Board
The project is a bulletin board project. There are only basic _Crud(Create, Read, Update, Delete)_ functions.

## Information
### 1. Front End
 > 1. Thymeleaf
 > 2. Jquery

### 2. Back End
> 1. Spring boot 2.2.1
> 2. Gradle
> 3. Java 8
> 4. MySql
> 5. lombok
> 6. logger

### 3. DB
|  <center>Filed Name</center> |  <center>Data Type</center> |  <center>Length</center> | <center>Default</center> | <center>PK</center> |  <center>Not Null</center> |  <center>auto_increment</center> |
|:--------|:--------:|--------:|:--------:|:--------:|:--------:|:--------:|
|**board_idx** | <center>int </center> |10 |  | O |O |O |
|**title** | <center>varchar</center> |300 | | | O| |
|**contents** | <center>longtext</center> | | | | O||
|**hit_cnt** | <center>int </center> |10 | 0| | O| |
|**created_datetime** | <center>datetime </center> | || | O| |
|**creator_id** | <center>varchar</center> |50 | | | O| |
|**updated_datetime** | <center>datetime </center> | | | | | |
|**updater_id** | <center>varchar </center> |50 | | | | |
|**deleted_yn** | <center>char</center> |1|N | | O||

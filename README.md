<h1>Spring_Boot_Global_Exception_Handler</h1>
<hr><p>Java Spring Global Exception Handler</p><ul>
<li>Java da genel hata yönetimi</li>
</ul><h2>Technologies Used</h2>
<hr><ul>
<li>Java v17</li>
</ul><ul>
<li>Spring Boot</li>
</ul><ul>
<li>Spring Web</li>
</ul><ul>
<li>Data JPA</li>
</ul><ul>
<li>Lombook</li>
</ul><ul>
<li>PostgreSql</li>

## Service information
```
GET
http://localhost:8181/rest/api/employee/list/1

Response
{
"result": true,
"errorMessage": null,
"data": {
"id": 1,
"name": "Murat E",
"department": {
"id": 2,
"name": "Yazılım Geliştirme",
"location": "istanbul"
}
}
}

http://localhost:8181/rest/api/employee/list/12

Response
{
"status": 400,
"exception": {
"hostName": "192.168.1.11",
"path": "/rest/api/employee/list/12",
"createTime": "2025-02-27T11:42:20.251+00:00",
"message": "Kayıt bulunamadı  :  12"
}
}
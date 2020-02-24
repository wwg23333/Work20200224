## 后台管理-管理员列表页面

URL：/interview/UserList?username={userName}&real_name={real_name}&email={email}
Method: GET

ResponseBody:
```JSON
[
    {
        "adminstrator_id  ":1,
        "username":"王五",
        "status":0,
        "Date Added":"23/02/2020",
    },
    {
        "adminstrator_id  ":2,
        "username":"admin",
        "status":0,
        "Date Added":"22/02/2020",
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
| username | String | 管理员名 |
| status | Integer | 状态(0禁用,1启用) |
| realName | String | 真实姓名 |
| email | String | 邮箱 |

Response Field
|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
| administrator_id | Integer | 管理员id |
| username | String | 管理员名 |
| status | Integer | 状态(0禁用,1启用) |
| realName | String | 真实姓名 |
| email | String | 邮箱 |
| encrypted_password | String | 加密密码 |
| create_time | date | 创建时间 |
| avatarUrl | String | 头像地址 |


## 后台管理端-商品列表页

URL: /interviewProduct/search?product_name={product_name}&product_code={product_code}
Method：GET 

ResponseBody:  

```JSON
[
    {
        "image":"flower.jpg",
        "Product Name":"花",
        "Model":"水仙花",
        "price":"50",
        "quantity":100,
        "status":0
    },
    {
        "image":"flower2.jpg",
        "Product Name":"花",
        "Model":"百合花",
        "price":"50",
        "quantity":100,
        "status":0
    }
]

```

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
| productId | Integer | 商品Id |
| product_name | String | 商品名称 | 
| product_abstract | String| 商品摘要 |
| product_code | String | 商品代号 |
| price | double | 价格 |
| discount | double | 打折(默认0.0) |
| sort_order | Integer | 排序 |
| quantity | double | 库存量(默认0) |
| status | Integer | 状态(0在售,1下架) |
| rewordPoints | Integer | 积分(0默认) |
| main_pic_url |  | 主图 |

## 后台管理商品添加

URL：/interview/addproduct
Method:Post
Request Content-Type: multipart/formdata  
RequestParam: interviewId
RequestParam: addproduct

RequestBody:
```JSON
[
    {
        "productName":"Apple Cinema 30",
        "product_abstract":"苹果电脑所属的苹果12性能非常的优秀",
        "image":"appleCom.peng",
        "price":"22000",
        "quantity":1000,
        "status":0
    }
]

RequestBody:
```JSON
    true
```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
| Product Name | String | 商品名称 |
| product_abstract | String| 商品摘要 |
| main_pic_url |  | 主图 |
| price | double | 价格 |
| quantity | double | 库存量(默认0) |
| status | Integer | 状态(0在售,1下架) |

## 后台管理端-商品编辑

URL: /editProduct/edit
Method：POST  
Request Content-Type: multipart/formdata  
RequestParam: interviewId
RequestParam: editProduct  

ResponseBody:  

```json
[
    "http://xxx.com/xxx1.jpg",
    "http://xxx.com/xxx2.jpg"
]

```

Request Field  

|    字段     |  类型   |    描述     |
| :---------: | :-----: | :---------: |
|product_name  | String  | 商品名称  |
|product_abstract  | String |摘要  |

## 商品前台-商品列表

URL:/interview/findList
Method:Get

ResponseBody:
```JSON
[
    {
        "image":"flower.jpg",
        "Product Name":"花",
        "Model":"水仙花",
        "price":"50",
        "quantity":100,
        "status":0
    },
    {
        "image":"flower2.jpg",
        "Product Name":"花",
        "Model":"百合花",
        "price":"50",
        "quantity":100,
        "status":0
    },
    {
        "image":"appleCom.peng",
        "Product Name":"Apple Cinema 30",
        "Model":"苹果12",
        "price":"22000",
        "quantity":1000,
        "status":0
    }
]

```

Request Field
| 字段   |   类型  |   描述  |
| :-------------: | :-------------:| :-------------: |
| product_id | Integer | 图片id |
| description | String | 描述 |
| other_pic_urls | String | 其他图片 |


## 后台管理端-订单列表页
URL: /interviewOrders/search?customer_id={customer_id}
Method：GET 

ResponseBody:  

```json
[
    {
        "order_id  ":1234,
        "total_price   ": "$306.00",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0
    },
   {
        "order_id  ":1234,
        "total_price   ": "$306.00",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0
    }
]

```
Request Field
|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
| order_id | int | 订单Id |
| customer_id | int | 顾客Id |
| status | int | 状态(0已付款,1待付款,2已取消,3已发货,4未发货) |
| total_price | double | 总金额 |
| create_time | date | 创建时间 |
| uodate_time | date | 修改时间 |

## 后台管理端-订单详情
URL: /interviewOrders/search?cusomer_id={cusomer_id}
Method：GET 

ResponseBody:  

```json
[
     {
        "order_id  ":1,
        "total_price   ": "$306.00",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0,
         "ship_adship_method": 1,
         "pay_method": 0,
         "reword_points": 10,
    },
   
]

```

Request Field
|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
| order_id | int | 订单Id |
| customer_id | int | 顾客Id |
| status | int | 状态(0已付款,1待付款,2已取消,3已发货,4未发货) |
| total_price | double | 总金额 |
| create_time | date | 创建时间 |
| uodate_time | date | 修改时间 |
| ship_method | integer | 寄送方式(0自取,1邮政,2韵达,3顺丰,4圆通) |
| pay_method | integer | 支付方式(0支付宝,1微信,2银行卡) |
| reword_points | integer | 积分(0默认) |

## 后台管理端-订单详情（历史部分）
URL: /interviewOrders/search?cusomer_id={cusomer_id}
Method：GET 

ResponseBody:  

```json
[
     {
        "order_id  ":1234,
        "total_price   ": "$306.00",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0,
         "customer_notified": "NO"
    },
   {
        "order_id  ":1234,
        "total_price   ": "$306.00",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0,
         "customer_notified": "NO"
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|cusomer_id  |int  |非空，索引，外键  |客户ID   |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|order_history_id  |bigint  |主键，自增  |ID  |
|create_time  |varchar(100)  |非空  |创建时间  |
|comment  |varchar(100)  |  |备注  |
|order_status  |tingint  |非空，默认开启  |状态(0为禁用，1为启用)  |
|customer_notified  |varchar(100)  |  |通知用户  |



## 后台管理端-退货申请列表页
URL: /interviewReturnList/search?order_id={order_id}&customer_name={customer_name}&product_code={product_code}&opened={opened}&product_name ={product_name }
Method：GET 

ResponseBody:  

```json
[
     {
        "return_id  ":1234,
        "order_id  ":1234,
        "customer_name" :"Si Li",
        "product_name   ": "iphone",
        "product_code":"product 11",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0
    },
  {
        "return_id  ":1234,
        "order_id  ":1234,
        "customer_name" :"Si Li",
        "product_name   ": "iphone",
        "product_code":"product 11",
        "create_time  ": "31/01/2020",
        "update_time  ": "31/01/2020",
        "status": 0
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|order_id  |int  |非空，索引，外键  |订单ID  |
|customer_name  |varchar(100)  |非空，索引  |客户姓名  |
|product_code  |varchar(100)  |索引  |商品代号  |
|product_name  |varchar(20)  |非空，唯一索引  |商品名称  |
|opened  |varchar(20)  |索引  |开封  |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|return_id  |bigint  |主键，自增  |ID  |
|order_id  |int  |非空，索引，外键  |订单ID  |
|order_time  |varchar(100)  |非空  |订单创建时间  |
|customer_name  |varchar(100)  |非空，索引  |客户姓名  |
|product_code  |varchar(100)  |索引  |商品代号  |
|product_name  |varchar(20)  |非空，唯一索引  |商品名称  |


## 后台管理端-退货历史页
URL: /interviewReturnHistory/search?return_history_id={return_history_id}&return_id  ={return_id}
Method：GET 

ResponseBody:  

```json
[
     {
        "return_history_id  ":1234,
        "create_time  ": "31/01/2020",
        "comment  ": "待检验",
        "status": 0,
        "return_notified": "NO"
    },
   {
        "return_history_id  ":1234,
        "create_time  ": "31/01/2020",
        "comment  ": "待检验",
        "status": 0,
        "return_notified": "NO"
    }
]

```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
|return_id  |bigint  |主键，自增  |ID  |
|return_history_id  |bigint  |主键，自增  |ID  |

Response Field  

|    字段     |  类型   |          描述          |
| :---------: | :-----: | :--------------------: |
|return_id  |bigint  |主键，自增  |ID  |
|order_time  |varchar(100)  |非空  |订单创建时间  |
|return_history_id  |bigint  |主键，自增  |ID  |
|return_ststus  |tinyint  |非空，默认启用 |状态(0为禁用，1为启用)  |
|comment  |varchar(100)  |  |备注  |
|customer_notified  |varchar(100)  |  |通知客户  |

## 后台管理-客户列表页面
URL：/interview/find?username={userName}
Method: GET

ResponseBody:
```JSON
[
    {
        "username":"张三",
        "mobilePhone":"18945612345",
        "E-mail":"565468546@qq.com",
        "Customer Grop":"Deault",
        "status":"Enabled",
        "ip":"192.168.32.1",
        "Date Added":"2020-2-23"
    },
    
]
```

Request Field  

|  字段   |  类型   |           描述           |
| :-----: | :-----: | :----------------------: |
| customer_id | int | 客户id |
| username | varcahr(50) |客户名 |
| mobilePhone | varchar(20) | 手机电话 |
| mobile_verified | varchar(50) | 手机验证 |
| email | varchar(30) |  邮箱 |
| email_verified | varchar(50) | 邮箱验证 |
| real_name | varchar(10) | 真实姓名 |
| dufault_address | int |  默认地址 |
| encrypted_passw | varchar(20) | 加密密码 |
| news_subscribed | tinyint | 新闻订阅(0未订阅,1已订阅) |





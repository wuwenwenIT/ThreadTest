# ThreadTest
## 包含Client和Server的基于TCP协议的模拟用户登录
- 使用TCP协议前，须先建立TCP连接，形成传输数据通道
- 传输前，采用“ 三次握手”方式，点对点通信，是可靠的
- TCP协议进行通信的两个应用进程：客户端、服务端

- 客户端： java.net.Socket 类表示。创建 Socket 对象，向服务端发出连接请求，服务端响应请求，两者建立连接开始通信。
- 服务端： java.net.ServerSocket 类表示。创建 ServerSocket 对象，相当于开启一个服务，并等待客户端的连接。

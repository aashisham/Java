# Network Programming
- A Network is a collection of devices that share a common communication protocol and connected with some communication medium.
- A protocol defines a set of rules to which all the communicating parties adhere to (agree).
- The `java.net` package was designed with a group of classes and interfaces which not only provide low level but also hight level communication details.
- `java.net` package provides support for the two common network protocols.
   i. TCP (Transmission Control Protocol)
  ii. UDP(User Datagram Protocol)
- The term network programming refers to writing programs, then execute across multiple devices, in which the devices are all connected to each other using a network.

**Network Programming**
```
   1. Socket Programming
   2. URL Processing
```
    
# Differences between TCP and UDP

TCP    |  UDP
------ | ---------
Connection Oriented  | Connectionless
acknowledged         | No acknowledgment
Reliable/secure      | Unreliable
Segment sequencing	 | No sequencing
slow                 | fast
header size is 20 bytes |	Header size is 8 bytes
Retransmission of lost packets | No Retransmission of lost packets
heavy-weight         | light-weight
extensive error checking mechanisms | basic error checking mechanism using checksums
does Flow Control    | no flow control
used by HTTP,HTTPs,FTP,SMTP,Telnet | used by DNS,DHCP,TFTP,SNMP,RIP,VoIP

## Some Terminologies
1. IP Address
- It is a logical address that can be changed. IP Address are 32-bit number (IPv4 format) often represented as a quad of four 8-bit numbers separated by periods.
Eg : `192.168.0.1`
2. Protocol
- It is a set of rules basically that is followed for communication.
Eg: TCP, UDP, FTP, POP, SMTOP, HTTP, HTTPS
3. Port Number
- The port number is used to uniquely identify different applications. It acts as a communication end point between applications.
- The valid port number range from 1 - 65535.
- The ports upto 1023 are reserved for well known services and hence are well-known ports.
Eg: 80 for HTTP, 21 for FTP, 22 for SSH
4. Socket
- A socket is a end point between two way communication.
- It defines a network connection as a Stream from which bytes can be read and similarly bytes can be sent.
- Java socket can be used to provide both connection-oriented (TCP) as well as connectionless (UDP).

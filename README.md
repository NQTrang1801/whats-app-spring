# WhatsApp Clone

This project is a WhatsApp-like messaging application built using **Spring Boot, Angular 19, Keycloak, and WebSockets**. It provides real-time messaging functionality, user authentication, and a secure chat experience.

## Features
- **User Authentication**: Secure login and user management using Keycloak.
- **Real-time Messaging**: WebSockets for instant message delivery.
- **Group Chats**: Support for one-on-one and group conversations.
- **Message History**: Store and retrieve previous messages.
- **User Presence**: Online/offline status tracking.
- **Modern UI**: Built with Angular 19 for a responsive and dynamic frontend.
- **Scalability**: Spring Boot backend with efficient WebSocket communication.

## Tech Stack
### Backend (Spring Boot)
- **Spring Boot**: Backend framework for REST API and WebSockets.
- **Spring Security**: Handles authentication and authorization.
- **Keycloak**: OAuth2 & OpenID Connect authentication provider.
- **WebSockets**: Enables real-time communication.
- **Spring Data JPA**: ORM for database interactions.
- **PostgreSQL**: Database for storing users and messages.

### Frontend (Angular 19)
- **Angular 19**: Modern frontend framework for SPA development.
- **RxJS**: Reactive programming for handling real-time updates.
- **Angular Material**: UI components for a polished user experience.

## Setup & Installation
### Prerequisites
- Java 21+
- Node.js 18+
- Angular CLI
- Keycloak Server
- PostgreSQL

### Keycloak Setup
1. Start Keycloak and create a realm.
2. Configure client settings for frontend authentication.
3. Update Keycloak configurations in the Angular environment file.

## Usage
- Register or log in using Keycloak authentication.
- Start a conversation with a friend or create a group chat.
- Send and receive messages in real-time.

## Contact
For questions or support, reach out via email at `trangnguyen180103@gmail.com`.


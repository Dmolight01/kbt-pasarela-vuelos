
# Prueba en Pasarela de Vuelos de Servicios REST con HATEOAS, Docker, MySQL y Kubernetes
**Curso:** Arquitectura de Software  
**Facultad de Ingenería - Universidad de Antioquia**  

---

## 🎯 Objetivos

Este aplicativo tiene como propósito integrar conceptos teóricos y prácticos para el desarrollo, despliegue y prueba de aplicaciones modernas bajo arquitecturas basadas en servicios.  

**Objetivos principales:**
1. **Desarrollar una aplicación RESTful** con Spring Boot que implemente el principio **HATEOAS (Hypermedia as the Engine of Application State)**.  
2. **Contenerizar la aplicación y la base de datos** mediante **Docker**, garantizando portabilidad e independencia del entorno.  
3. **Integrar y configurar MySQL** como sistema de base de datos relacional para la persistencia de información.  
4. **Desplegar la aplicación en Kubernetes**, utilizando **Minikube** y **kubectl** para la orquestación automatizada de contenedores.  
5. **Probar y documentar los servicios REST**, verificando el correcto funcionamiento de los endpoints y su compatibilidad con HATEOAS.  

---

## 🧱 Arquitectura de la Solución
La solución implementada sigue una arquitectura basada en contenedores y servicios:

- **Spring Boot Application:** contiene la lógica de negocio y los endpoints RESTful.  
- **MySQL Container:** administra la persistencia de datos.  
- **Docker:** empaqueta y ejecuta la aplicación y la base de datos.  
- **Kubernetes (Minikube):** orquesta los contenedores y gestiona el despliegue de servicios.  
- **Postman / Swagger:** herramientas para pruebas y documentación de endpoints.  

📘 **Referencias:**  
- [Deploying Spring Boot Application on K8s – blog.devops.dev](https://blog.devops.dev/deploying-spring-boot-application-on-k8s-1a558d4f965a)  
- [From Localhost to the Cloud – levelup.gitconnected.com](https://levelup.gitconnected.com/from-localhost-to-the-cloud-deploying-spring-boot-mysql-app-on-kubernetes-with-docker-desktop-a-8c51f9cd23fa)  

---

## 🧰 Herramientas Utilizadas

| Herramienta | Descripción |
|--------------|-------------|
| **Git / GitHub** | Control de versiones y publicación del código fuente |
| **Spring Boot (IntelliJ 2024.1+)** | Framework para el desarrollo del backend REST |
| **JDK 11** | Entorno de ejecución de Java |
| **MySQL** | Base de datos relacional |
| **Docker Desktop** | Creación y gestión de contenedores |
| **Minikube + kubectl** | Despliegue y administración del clúster Kubernetes |
| **Postman / Swagger** | Pruebas y documentación de endpoints |

---

## 🚀 Funcionalidades Implementadas
La aplicación web desarrollada permitirá:

- ✈️ **Crear vuelos** y almacenarlos en MySQL.  
- 📋 **Listar todos los vuelos** registrados.  
- 🔍 **Consultar un vuelo por ID.**  
- ⭐ **Obtener los mejores vuelos según rating.**  
- 🔗 **Incluir enlaces HATEOAS** en las respuestas de la API.  
- 🧩 **Controlador principal:** `FlightController` con los endpoints necesarios para gestionar las operaciones CRUD.  

---

## 📦 Resultados
- ✅ Aplicación RESTful funcional con arquitectura basada en servicios.  
- 🐳 Contenerización completa con Docker (app + base de datos).  
- ☸️ Despliegue exitoso en Kubernetes mediante Minikube.  
- 🧪 Pruebas de endpoints completadas y verificadas con Postman/Swagger.  

---

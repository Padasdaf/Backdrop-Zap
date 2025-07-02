# Backdrop Zap

**Backdrop Zap** is a full-stack background removal tool. It uses a React/Vite front end and a Spring Boot back end to deliver pixel-perfect transparent cutouts in seconds.

---

## Prerequisites

Make sure you have the following installed on your machine:

1. JDK 21
2. Node.js v20.9.0
3. MySQL Server

---

## Quick Start

1. **Extract the project**

   ```bash
   unzip project.zip
   cd project
   ```

2. **Back-end setup**

   1. Open the `removebg` folder (Spring Boot project) in IntelliJ IDEA (recommended).
   2. In MySQL run:

      ```sql
      CREATE DATABASE removebgdb;
      ```
   3. Edit `src/main/resources/application.properties`:

      ```properties
      # ClipDrop API
      clipdrop.api.key=<YOUR_CLIPDROP_API_KEY>

      # Razorpay
      razorpay.key.id=<YOUR_RAZORPAY_KEY_ID>
      razorpay.key.secret=<YOUR_RAZORPAY_SECRET>

      # Clerk (auth)
      clerk.issuer=<YOUR_CLERK_ISSUER>
      clerk.jwks-url=<YOUR_CLERK_JWKS_URL>
      clerk.webhook-secret=<YOUR_CLERK_WEBHOOK_SECRET>
      ```
   4. In IntelliJ run **RemovebgApplication.java**

3. **Front-end setup**

   1. Open the `client` folder in WebStorm or VS Code.
   2. Install dependencies:

      ```bash
      npm install
      ```
   3. Create or edit `client/.env`:

      ```dotenv
      VITE_CLERK_PUBLISHABLE_KEY=<YOUR_CLERK_PUBLISHABLE_KEY>
      VITE_RAZORPAY_KEY_ID=<YOUR_RAZORPAY_KEY_ID>
      ```
   4. Start the dev server:

      ```bash
      npm run dev
      ```

4. **View in your browser**
   Open:

   ```
   http://localhost:5173
   ```

---

## Folder Structure

```
Backdrop-Zap/
├─ removebg/        # Spring Boot backend
│  ├─ pom.xml
│  └─ src/main/resources/application.properties
└─ client/          # React/Vite front end
   ├─ package.json
   ├─ .env
   └─ src/
```

---

## License

© 2025 Daniel Hu
All rights reserved.

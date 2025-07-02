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

1. **Download the files**
   Clone this repository or download the ZIP, then open the `backdropzap` folder:

   ```bash
   git clone https://github.com/<your-username>/backdrop-zap.git
   cd backdropzap
   ```

2. **Back-end setup**

   1. Open the project in VS Code (or your preferred editor).
   2. Create the database in MySQL:

      ```sql
      CREATE DATABASE removebgdb;
      ```
   3. Edit `removebg/src/main/resources/application.properties`:

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
   4. Run the application:

      ```bash
      cd removebg
      ./mvnw spring-boot:run
      ```

3. **Front-end setup**

   1. Open the `client` folder in VS Code (or your preferred editor).
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
   Navigate to:

   ```
   http://localhost:5173
   ```

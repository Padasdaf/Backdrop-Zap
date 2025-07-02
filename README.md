# Backdrop Zap

**Backdrop Zap** is a full-stack background removal tool. It uses a React/Vite front end and a Spring Boot back end to deliver pixel-perfect transparent cutouts in seconds.

---

## Quick Start

1. **Download the files**
   Clone this repository, then open the `Backdrop-Zap` folder:

   ```bash
   git clone https://github.com/<your-username>/Backdrop-Zap.git
   cd Backdrop-Zap
   ```

2. **Back-end setup**

   1. Open the project in VS Code (or your preferred editor).
   2. Create the database in MySQL:

      ```sql
      CREATE DATABASE backdropzapdb;
      ```
   3. Edit `backdrop-zap-backend/src/main/resources/application.properties`:
   4. Run the application:

      ```bash
      cd backdrop-zap-backend
      ./mvnw spring-boot:run
      ```

3. **Front-end setup**

   1. Open the `Backdrop Zap` folder in VS Code (or your preferred editor).
   2. Install dependencies:

      ```bash
      npm install
      ```
   3. Create or edit `Backdrop Zap/.env`:
   4. Start the dev server:

      ```bash
      npm run dev
      ```

4. **View in your browser**
   Navigate to:

   ```
   http://localhost:5173
   ```

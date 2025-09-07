Prerequisites
Before you begin, ensure the following are installed:
Spring Tool Suite (STS) or any preferred Java IDE
Java 17+
Maven
Postman (or any API testing tool)
GitHub account (for getting the Gemini API key)

📁 Project Structure
Property	Value
Project Name	auto-email-writer-with-ai
Group	com.email
Artifact	email-writer-with-ai
Package	com.email.writer.ai
📦 Dependencies Used

Spring Web
Spring Reactive Web (WebClient)
Lombok
These are configured in your pom.xml.

⚙️ application.properties
This file is used to manage application-level configuration like API keys and base URLs.

Example:

gemini.api.url=https://generativelanguage.googleapis.com
gemini.api.key=YOUR_API_KEY_HERE

📄 pom.xml

Contains dependency and build configuration for the Spring Boot application.
🤖 Integrating Google Gemini API
Go to: Generate Gemini API Key
Create an API key
Store the key in application.properties under gemini.api.key

📂 Project Modules
1. Controller

EmailGeneratorController.java
Handles POST requests to generate email responses.

2. Model

EmailRequest.java
Represents the structure of the incoming request body.

{
  "emailRequest": "Hello, thank you for reaching to me, Siva!!",
  "tone": "friendly"
}

3. Service

EmailGeneratorService.java
Handles:

✅ Prompt construction
✅ Crafting the request to Gemini
✅ Parsing and returning the AI-generated response

URL: http://localhost:8080/api/email/generate

Method: POST

Content-Type: application/json

✅ Request Body Example:
{
  "emailRequest": "Hello, thank you for reaching to me, Siva!!",
  "tone": "friendly"
}

✅ Sample API Response:
Subject: Re: Your Email

Hello there,
Thanks for reaching out! I appreciate you contacting me.
Let me know how I can help.
Best regards,  
Siva

📌 How it Works
User sends an email body and tone via API request.
The service builds a professional prompt.
The prompt is sent to Google Gemini API via WebClient.
The AI response is returned and served via the REST endpoint.

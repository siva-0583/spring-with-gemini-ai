Steps Should Flow:
Prerequests
Spring STS
Postman
-------------------------------------------------------
Project 1 
Name : auto-email-writer-with-ai
Group : com.email
Artifact : email-writer-with-ai
Package : com.email.writer.ai

Dependencies
Spring Web
Lambok
Spring Reactiveweb

application.properties
Main use of application.properties if you want add any sort of configuration 

pom.xml
It contain information of entire application

Explore google gemini API

To get the API
Link : https://aistudio.google.com/apikey?pli=1
Need to create a API key.

Created the controller class 
EmailGeneratorController.java

Model
EmailRequest.java

Service
EmailGeneratorService
//Build the prompt
//Craft a request
//Do request and get response
//Return response


<img width="1000" height="658" alt="image" src="https://github.com/user-attachments/assets/48471014-77ba-4239-8532-0a0e511bd0c0" />

**Request Url** : http://localhost:8080/api/email/generate
**Body:**
{
    "emailRequest" : "Hello, thank you for reaching to me,siva!!",
    "tone" : "friendly"
}

**API Response:**

Subject: Re: Your Email

Hello there,

Thanks for reaching out! I appreciate you contacting me.

Let me know how I can help.

Best regards,
Siva

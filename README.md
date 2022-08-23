# get-started-with-cosmos-db

# steps to install azure cosmos db emulator for Window OS

1 -> download & install the binary from https://aka.ms/cosmosdb-emulator
2 -> once the installation is compelete, access https://localhost:8081/_explorer/index.html
3 -> copy the cosmos db endpoint with key, database(create database if not there) & use the same in the application
4 -> certificate needs to be stored in certificate store in order to connect with emulator via application.

Azure Cosmos DB Emulator supports only secure communication through TLS connections.
Certificates in the Azure Cosmos DB local emulator are generated the first time you run the emulator. 
There are two certificates. 
One of them is used to connect to the local emulator and the other is used to manage default encryption of the emulator data within the emulator. 
The certificate you want to export is the connection certificate with the friendly name "DocumentDBEmulatorCertificate".

When you use the emulator to develop apps in different languages such as Java, Python, or Node.js, you need to export the emulator certificate and import it into the required certificate store.

refer the below link to export/import certificate
https://docs.microsoft.com/en-us/azure/cosmos-db/local-emulator-export-ssl-certificates

Commands to import certificate in cacerts.

set EMULATOR_CERT_PATH=<PATH to documentdbemulatorcertificate.cert>

# delete the cert if already exists
%JAVA_HOME%/bin/keytool -keystore ..\lib\security\cacerts -delete -alias cosmos_emulator
# import the cert
%JAVA_HOME%/bin/keytool -keystore ..\lib\security\cacerts -importcert -alias cosmos_emulator -file %EMULATOR_CERT_PATH%

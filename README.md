# Index

- English version
- Version en Español



# Web parser in Java

The goal of this project is to extract the untagged HTML text from a user-supplied web page.


![image](https://github.com/Masu17/prueba/assets/114241909/78c7e3f3-10e1-4043-a28d-d7c3f6db3ebb)

To achieve this, the Java library [**Jsoup**](https://jsoup.org/) is used, which is responsible for manipulating, extracting and cleaning the HTML.

This dependency can be obtained from the following web site:

https://mvnrepository.com/artifact/org.jsoup/jsoup/1.16.1

To use this library, we must add it as a dependency in the dependency repository of our Maven project:

```
<dependencies>
    <dependency>
        <groupId>org.jsoup</groupId>
        <artifactId>jsoup</artifactId>
        <version>1.16.1</version>
    </dependency>
</dependencies>
```

## Installation requirements
To run the program, you must have the Java JVM installed or have the latest version available.

To check if you have it installed or updated, open the terminal on your PC and type the following command:

```
java --version
```

If you have it installed correctly, you should see the following execution result:

```
openjdk 19.0.2 2023-01-17
OpenJDK Runtime Environment (build 19.0.2+7)
OpenJDK 64-Bit Server VM (build 19.0.2+7, mixed mode, sharing)
```

In case you don't have the java JVM installed you can install it [here](https://www.oracle.com/es/java/technologies/downloads/)

## How the program works
When executing the program, you will be asked to enter the name of the file where the information extracted from the web page will be stored.

![image](https://github.com/Masu17/prueba/assets/114241909/a3fbdf2f-794b-4fe6-b4a2-64975b082108)

After this step, you will enter the hyperlink to the web page from which you want to extract the text. After a short wait, the program will perform all the necessary actions and the file will be saved in the resources section of our project.

![image](https://github.com/Masu17/prueba/assets/114241909/e01481c5-e586-4631-98a1-33ca783a885e)

![image](https://github.com/Masu17/prueba/assets/114241909/0e172309-a9bb-463a-9dcb-b2f5b114e20e)

To verify that the content of the file has been created correctly, you can open it and verify its content.

![image](https://github.com/Masu17/prueba/assets/114241909/837b9065-69fd-4625-b954-e0b6f4116612)

Translated with www.DeepL.com/Translator (free version)
# Analizador web en Java

El objetivo de este proyecto es extraer el texto sin etiquetas HTML de una página web proporcionada por el usuario.


![image](https://github.com/Masu17/prueba/assets/114241909/78c7e3f3-10e1-4043-a28d-d7c3f6db3ebb)

Para lograr esto, se utiliza la biblioteca de Java [**Jsoup**](https://jsoup.org/), la cual se encarga de manipular, extraer y limpiar el HTML.

Esta dependencia se puede obtener desde el siguiente sitio web:

https://mvnrepository.com/artifact/org.jsoup/jsoup/1.16.1

Para utilizar esta biblioteca, debemos agregarla como dependencia en el repositorio de dependencias de nuestro proyecto Maven:

```
<dependencies>
    <dependency>
        <groupId>org.jsoup</groupId>
        <artifactId>jsoup</artifactId>
        <version>1.16.1</version>
    </dependency>
</dependencies>
```

## Requisitos de instalación
Para ejecutar el programa, debes tener instalada la JVM de Java o disponer de la última versión disponible.

Para comprobar si lo tienes instalado o actualizado, abre la terminal de tu PC y escribe el siguiente comando:

```
java --version
```

Si lo tienes instalado correctamente, deberías ver el siguiente resultado de ejecución:

```
openjdk 19.0.2 2023-01-17
OpenJDK Runtime Environment (build 19.0.2+7)
OpenJDK 64-Bit Server VM (build 19.0.2+7, mixed mode, sharing)
```

En caso de no tener instalado la JVM de java puedes instalarla [aquí](https://www.oracle.com/es/java/technologies/downloads/)

## Funcionamiento del programa
Al ejecutar el programa, se solicitará ingresar el nombre del archivo donde se almacenará la información extraída de la página web.

![image](https://github.com/Masu17/prueba/assets/114241909/a3fbdf2f-794b-4fe6-b4a2-64975b082108)

Después de este paso, se ingresará el hipervínculo de la página web de la cual se desea extraer el texto. Tras una breve espera, el programa realizará todas las acciones necesarias y se guardará el archivo en la sección de recursos de nuestro proyecto.

![image](https://github.com/Masu17/prueba/assets/114241909/e01481c5-e586-4631-98a1-33ca783a885e)

![image](https://github.com/Masu17/prueba/assets/114241909/0e172309-a9bb-463a-9dcb-b2f5b114e20e)

Para verificar que el contenido del archivo se ha creado correctamente, se puede abrir y verificar su contenido.

![image](https://github.com/Masu17/prueba/assets/114241909/837b9065-69fd-4625-b954-e0b6f4116612)

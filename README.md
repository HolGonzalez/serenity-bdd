# Prueba Técnica Choucair

## Requisitos
* JDK 8 o superior
* Graddle 6.x.x
* Intellij IDEA
* **Plugins requeridos para Intellij IDEA**
    * Cucumber for java
* Google Chrome
* Descargar el [ChromeDriver](https://chromedriver.chromium.org/) segun su version de Chrome

## Importacion del proyecto en Intellij IDEA
Abrimos Intellij IDEA indicamos que vamos a crear un nuevo proyecto y que lo importaremos de un gestor de control de versiones, copiamos la url de este proyecto https://github.com/HolGonzalez/analista-de-pruebas-nivel-I, la pegamos en Intellij IDEA y finalizamos en clonar. una vez el proyecto se haya clonado en nuestro equipo comenzara a indexar los archivos y aparecera una alerta en la cual nos pregunta la configuración de proyecto nos brinda dos opciones Maven o Gradle, en este escenario seleccionamos Gradle.  
![Gradle](https://i.ibb.co/VgdCSCq/Captura-de-Pantalla-2021-02-27-a-la-s-8-09-38-p-m.png)


## Reemplazar ChromeDriver
Una vez clonado y preparado nuestro proyecto, nos ubicamos en la carpeta src/resources/driver, en esta carpeta nos mostrara el archivo chromedriver.exe solamente debemos reemplazar este archivo con el chromedriver correspondiente a la version de Chrome instalada

## Ejecución
Teniendo nuestro entorno listo y abierto el proyecto en Intellij IDEA proseguimos a entrar a la carpeta src/test/java/runners, en esta carpeta encontramos el archivo RunnerTags
```
Damos clic derecho sobre una parte del codigo y le indicamos Run
```


### Entorno de desarrollo del proyecto
* Windows 10
* Google Chrome 89.0.4389.82
* Intellij IDEA 2020.3.2
* JDK 8
* Graddle 6.8.3 uptade 281

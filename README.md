# LoginG1

## Descripción del Proyecto

LoginG1 es una aplicación Android desarrollada con Jetpack Compose que demuestra un flujo de navegación simple: inicio de sesión, gestión de tareas y vista de detalles. La app incluye:

- **Pantalla de Login**: Una interfaz atractiva para ingresar credenciales (correo y contraseña) con animaciones y validación básica.
- **Pantalla de Tareas**: Muestra una lista de tareas pendientes, permite marcar como completadas, reordenar aleatoriamente y navegar a detalles.
- **Pantalla de Detalles**: Muestra información del usuario basado en un ID.

El proyecto utiliza navegación type-safe con Kotlinx Serialization, Material 3 para el diseño, y corrutinas para operaciones asíncronas.

## Tecnologías Utilizadas

- **Lenguaje**: Kotlin
- **Framework UI**: Jetpack Compose
- **Navegación**: AndroidX Navigation Compose (type-safe)
- **Arquitectura**: MVVM básico con Compose
- **Dependencias**: 
  - Compose BOM
  - Navigation Compose
  - Kotlinx Serialization
  - Material 3

## Requisitos

- **Android Studio**: Versión Arctic Fox o superior (recomendado: Latest Stable).
- **JDK**: 11 o superior.
- **Android SDK**: API 24+ (mínimo), API 36 (target).
- **Dispositivo/Emulador**: Android 7.0+ para ejecutar la app.

## Instrucciones de Ejecución

1. **Clonar el Repositorio**:
   ```
   git clone <url-del-repositorio>
   cd LoginG1
   ```

2. **Abrir en Android Studio**:
   - Abre Android Studio.
   - Selecciona "Open" y navega a la carpeta del proyecto (`LoginG1`).
   - Espera a que Gradle sincronice las dependencias (puede tomar unos minutos la primera vez).

3. **Configurar el Entorno**:
   - Asegúrate de tener instalado el Android SDK correspondiente (API 36).
   - Si hay errores de SDK, ve a Tools > SDK Manager y instala las versiones requeridas.

4. **Construir el Proyecto**:
   - En Android Studio, ve a Build > Make Project.
   - O usa la terminal: `./gradlew assembleDebug` (en Windows: `.\gradlew.bat assembleDebug`).

5. **Ejecutar la App**:
   - Conecta un dispositivo Android o inicia un emulador (Tools > Device Manager).
   - Haz clic en el botón "Run" (ícono de play verde) en Android Studio.
   - Selecciona el dispositivo objetivo y espera a que se instale y ejecute la app.

## Estructura del Proyecto

- `app/src/main/java/com/example/loging1/`: Código fuente.
  - `MainActivity.kt`: Actividad principal que inicia la navegación.
  - `ui/navigation/`: Configuración de navegación (AppNavigation.kt, Navigation.kt).
  - `ui/screen/`: Pantallas de la app (LoginScreen.kt, Content.kt, DetailView.kt, TaskItem.kt).
  - `ui/theme/`: Temas y colores.
- `app/src/main/res/`: Recursos (layouts, valores, etc.).
- `build.gradle.kts`: Configuración de Gradle para el módulo app.
- `gradle/`: Wrapper de Gradle.

## Funcionalidades

- **Login**: Campos para correo y contraseña, con indicador de carga al iniciar sesión.
- **Tareas**: Lista de tareas con checkboxes para marcar como completadas. Botón para reordenar. Botón para ir a detalles.
- **Detalles**: Muestra el ID del usuario y botón para regresar.
- **Navegación**: Flujo lineal con posibilidad de volver atrás.

## Notas

- La app usa datos simulados; no hay backend real.
- Para desarrollo, puedes modificar las tareas en `Content.kt`.
- Si encuentras errores de compilación, verifica la sincronización de Gradle o limpia el proyecto (Build > Clean Project).

## Contribución

Si deseas contribuir:
1. Haz un fork del repositorio.
2. Crea una rama para tu feature.
3. Envía un pull request con descripción de los cambios.

## Licencia

Este proyecto es de código abierto bajo la licencia MIT.

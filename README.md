Repository for demonstrate False Negative Unnecessary import - Kotlin SS1128 when importing
from project's module.

Check out myproject/src/main/kotlin/org/example/myproject/Application.Kt

./gradlew --no-daemon myProject:sonar -Dsonar.login=xxx -Dorg.gradle.jvmargs="-XX:MetaspaceSize=512M -XX:MaxMetaspaceSize=1024M"

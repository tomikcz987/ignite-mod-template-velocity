plugins {
  java
  idea
}

repositories {
  mavenCentral()

  maven {
    name = "elytrium-repo"
    setUrl("https://maven.elytrium.net/repo/")
  }
  maven {
    name = "papermc-repo"
    setUrl("https://papermc.io/repo/repository/maven-public/")
  }
}

dependencies {
  compileOnly(libs.ignite)
  compileOnly(libs.mixin)
  compileOnly(libs.mixinExtras)

  compileOnly("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")
  annotationProcessor("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")
  compileOnly("com.velocitypowered:velocity-proxy:3.3.0-SNAPSHOT")
  compileOnly("org.ow2.asm:asm-commons:9.6")
  compileOnly("io.netty:netty-codec:4.1.106.Final")
}

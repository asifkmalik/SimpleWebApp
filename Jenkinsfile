node {
   stage('Preparation') {
      git 'https://github.com/asifkmalik/SimpleWebApp.git'
   }
   stage('Build') {
      gradlew clean test
   }
}
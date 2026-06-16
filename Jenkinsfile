pipeline {
agent any
tools {
maven 'Maven'
jdk 'JDK'
}
stages {
stage('Checkout') {
steps {
git branch: 'master', url: 'https://github.com/Harshini-Medha/mavensele.git'
}
}
stage('Build') {
steps {
sh 'mvn clean package'
}
}
stage('Test') {
steps {
sh 'mvn test'
}
}

}
post {
success {
echo 'Build and deployment successful!'
}
failure {
echo 'Build failed!'
}
}
}

node{
  stage('SCM Checkout'){
    git 'https://github.com/prasadg1989/javapractice'
  }
  stage('Compile - Package'){
    sh 'mvn package'
  }
}

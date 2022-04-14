pipeline {
    environment{
        imageName=""
    }
    agent any

    stages {
        stage('git pull') {
            steps {
                script{
                    sh 'git pull https://github.com/pragyak26/CalCulator_Devops'
                }
              
            }
        }
         stage('maven build') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
         }
         stage('Docker build image') {
            steps {
                script{
                    imageName = docker.build "pragyak26/calculator-devops:latest"
                }
            }    
        }
        
        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry("",'docker-jenkins'){
                    imageName.push()    
                    }
                  
                }
            }
        }
        
        
        stage('Ansible pull docker image') {
            steps {
               ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'deploy/inventory', playbook: 'deploy/calculator_playbook.yml', sudoUser: null
            }    
        }
        
    
    }
}

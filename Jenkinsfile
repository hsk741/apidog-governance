pipeline {

    agent any

    // environment {

    //     PROJECT_ID = "100"

    //     APIDOG_URL =
    //         "https://apidog.company.local"

    //     APIDOG_TOKEN =
    //         credentials('apidog-token')
    // }

    stages {

        stage('Checkout') {

            steps {
                checkout scm
            }
        }

        stage('Test') {

            steps {
                sh './gradlew clean test'
            }
        }

        stage('Generate OpenAPI') {

            steps {
                sh './gradlew generateOpenApiDocs'
            }
        }

        // stage('Resolve Sprint Branch') {

        //     steps {

        //         script {

        //             env.SPRINT_BRANCH =
        //                 env.BRANCH_NAME
        //                     .replaceFirst(
        //                         '^feature/',
        //                         'Sprint-'
        //                     )
        //                     .replaceAll('/','-')
        //         }
        //     }
        // }

        // stage('Create Sprint Branch') {

        //     steps {

        //         sh """
        //         curl -X POST \
        //         ${APIDOG_URL}/api/v1/projects/${PROJECT_ID}/branches \
        //         -H 'Authorization: Bearer ${APIDOG_TOKEN}' \
        //         -H 'Content-Type: application/json' \
        //         -d '{
        //              "name":"${SPRINT_BRANCH}"
        //         }'
        //         """
        //     }
        // }

        // stage('Import OpenAPI') {

        //     steps {

        //         sh """
        //         curl -X POST \
        //         ${APIDOG_URL}/api/v1/openapi/import \
        //         -H 'Authorization: Bearer ${APIDOG_TOKEN}' \
        //         -F projectId=${PROJECT_ID} \
        //         -F branchName=${SPRINT_BRANCH} \
        //         -F file=@build/openapi/openapi.json
        //         """
        //     }
        // }
    }
}
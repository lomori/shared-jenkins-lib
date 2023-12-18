package org.home.jenkins;

import static constants.GITHUB_CREDENTIALS_ID;

def checkout(String repo, 
    String branch = "master"){
    stage("Checkout"){
        checkout([
            $class: 'GitSCM', 
            branches: [[name: "${branch}"]], 
            doGenerateSubmoduleConfigurations: false, 
            userRemoteConfigs: [[
                credentialsId: "${GITHUB_CREDENTIALS_ID}", 
                url: "${repo}"
            ]]
        ])
    }
}s
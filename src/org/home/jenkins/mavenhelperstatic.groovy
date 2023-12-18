package org.home.jenkins;

import static constants.MAVEN;

def mvn(String action, String mavenVersion = MAVEN) {
    def mavenPath = tool "${mavenVersion}";
    sh "${mavenPath}/bin/mvn ${action}"
}
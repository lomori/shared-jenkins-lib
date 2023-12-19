//@Library('org.home.jenkins')
//import org.home.jenkins.Checkout
//import org.home.jenkins.Constants

node {

	def lib = library (
		identifier: 'shared-jenkins-lib@master',
		retriever:
			modernSCM([
				$class: 'GitSCMSource', 
				credentialsId: 'github-credential',
//				id: Constants.GITHUB_REPO,
				remote: 'git@github.com:lomori/shared-jenkins-lib.git',
				traits: [[$class: 'jenkins.plugins.git.traits.BranchDiscoveryTrait']]
			])
	)
    stage("Checkout class"){
        lib.Checkout.new().checkout(Constants.GITHUB_REPO, "master");
    }

/*
    stage("Maven builder"){
        def mavenLib = org.home.jenkins
        def mvn = mavenLib.Maven.builder(this)
            .action("clean install")
            .argument(mavenLib.MavenArgument.create().withPrefix("-D").withKey("key").withName("value").build())
            .argument(mavenLib.MavenArgument.create().withPrefix("-D").withKey("key2").withName("value2").build())
            .silent(true)
            .build();
       def constants = mavenLib.Constants.new()
        mvn.execute(constants.MAVEN);
    }
*/
}
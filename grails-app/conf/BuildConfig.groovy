grails.servlet.version = "2.5"
grails.project.work.dir = "target"
grails.project.target.level = 1.6
grails.project.source.level = 1.6

grails.project.dependency.resolver = "maven"

grails.project.dependency.resolution = {
    //legacyResolve true // if using Grails > 2.2
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'

    repositories {
        mavenLocal()
        mavenRepo ("http://nexus.ala.org.au/content/groups/public/") {
            updatePolicy 'always'
        }
    }

    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
        compile ('au.org.ala:ala-cas-client:2.1-SNAPSHOT') {
            // Ivy only
            transitive = false
        }
        compile 'com.yahoo.platform.yui:yuicompressor:2.4.8'
    }

    plugins {

        build(":release:3.0.1",
                ":rest-client-builder:2.0.3") {
            export = false
        }

        runtime ":jquery:1.11.1"
        runtime ':resources:1.2.14'
    }
}


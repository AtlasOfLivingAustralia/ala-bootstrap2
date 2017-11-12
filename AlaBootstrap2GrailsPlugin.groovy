class AlaBootstrap2GrailsPlugin {
    // the plugin version
    def version = "2.8.0-SNAPSHOT"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.2 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Ala Bootstrap2 Plugin" // Headline display name of the plugin
    def author ="Atlas of Living Australia"
    def authorEmail = "info@ala.org.au"
    def description = '''\
Plugin to provide the ALA footer and header skin to an app.
'''

    // URL to the plugin's documentation
    def documentation = "https://github.com/AtlasOfLivingAustralia/ala-bootstrap2"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "MPL2"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Atlas of Living Australia", url: "https://www.ala.org.au/" ]

    // Any additional developers beyond the author specified above.
    def developers = [ [ name: "Angel Ruiz", email: "aruizca@gmail.com" ], [ name: "Nick dos Remedios", email: "nickdos@gmail.com" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "GitHub", url: "https://github.com/AtlasOfLivingAustralia/ala-bootstrap2/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/AtlasOfLivingAustralia/ala-bootstrap2" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // add default value for config.headerAndFooter.baseURL that can be overridden by client app
        def buildProps = new Properties()
        buildProps.setProperty("headerAndFooter.baseURL","https://www.ala.org.au/commonui-bs2")
        def configSlurper = new ConfigSlurper().parse(buildProps)
        application.config = configSlurper.merge(application.config)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { ctx ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}

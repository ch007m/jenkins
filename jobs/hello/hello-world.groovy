package jobs.dummy

job('say-hello-world') {
    steps {
        shell('echo Say Hello World from JNLP client!')
    }
}
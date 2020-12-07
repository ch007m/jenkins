package jobs.hello

job('say-hello-world') {
    steps {
        shell('echo Say Hello World from JNLP client!')
    }
}
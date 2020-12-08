package jobs.hello_world

job('say-job-world') {
    steps {
        shell('echo Say Hello World from JNLP client!')
    }
}
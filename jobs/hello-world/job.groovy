package jobs.hello

job('say-job-world') {
    steps {
        shell('echo Say Hello World from JNLP client!')
    }
}
package jobs.dummy

job('say-hello') {
    steps {
        shell('echo Hello World!')
    }
}
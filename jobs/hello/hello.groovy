package jobs.hello

job('say-hello') {
    steps {
        shell('echo Hello!')
    }
}
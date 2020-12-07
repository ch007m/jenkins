package jobs.hello

job('say-job') {
    steps {
        shell('echo Hello!')
    }
}
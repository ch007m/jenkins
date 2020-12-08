freeStyleJob('hello-dsl-job') {
    displayName('hello-dsl-job')
    description('Job DSL to say hello.')

    steps {
        shell('Job DSL Saying Hello World !')
    }

}
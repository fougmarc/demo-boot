script {
        try {
        sh 'docker stop demo-boot && docker rm demo-boot'
        } catch (Exception e) {
        echo '-=- No image to stop or remove -=- '
        }
}
                script {
    try {
        sh 'docker rmi demo-boot '
                    } catch (Exception e) {
        echo '-=- No image to remove or remove -=- '
    }
                }

def gitDownload(repo)
{
   git "https://github.com/vamsidharmuppuri/${repo}.git"
}

def mavenBuild()
{
  sh 'mvn package'
}




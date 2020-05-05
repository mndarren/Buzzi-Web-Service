# copy paste code from eclipse to Git directory
cp -u /d/eclipse-workspace/buzzi/src/* src/ -r
cp -u /d/eclipse-workspace/buzzi/pom.xml pom.xml -r
echo Done to copy paste job!
read -p 'Message for commit:' msg
git status
git add .
echo Done to stage changes!
git commit -m "Updated Buzzi project - $msg"
echo Done to commit code!
git push
echo Done to push code!

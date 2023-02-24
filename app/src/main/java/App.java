package demo;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

//    echo "# github-actions-example" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/Sharecare-NGurram/github-actions-example.git
//    git push -u origin main
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

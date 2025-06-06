//IMPLEMENTATION OF STACK
// PROPERTIES focussed : simple undo/redo op, backtracking annol and lifo
import java.util.Stack;

public class TextEditor {
    private Stack<String> documentStates = new Stack<>();
    private String currentText = "";

    // Save state to stack (LIFO)
    public void type(String newText) {
        documentStates.push(currentText);
        currentText += newText;
        System.out.println("Current text: " + currentText);
    }

    // Undo last change
    public void undo() {
        if (!documentStates.isEmpty()) {
            currentText = documentStates.pop();
            System.out.println("Undo applied. Text: " + currentText);
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.type("Hello");
        editor.type(" World");
        editor.type("!");

        editor.undo(); // Removes "!"
        editor.undo(); // Removes " World"
        editor.type(" Java"); // New state
    }
}
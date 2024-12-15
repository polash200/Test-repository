import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Student {
    private String name;
    private int id;

    // Constructor to initialize the student's name and ID
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter methods for name and ID
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Method to compare students
    public boolean equals(Student other) {
        return this.name.equals(other.name) && this.id == other.id;
    }
}

public class StudentInfoGUI {
    // Main method
    public static void main(String[] args) {
        // Create JFrame for the GUI
        JFrame frame = new JFrame("Student Information");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels and TextFields for the first student
        JLabel label1 = new JLabel("Student 1 Name:");
        label1.setBounds(10, 10, 100, 30);
        JTextField student1Name = new JTextField();
        student1Name.setBounds(120, 10, 150, 30);

        JLabel label2 = new JLabel("Student 1 ID:");
        label2.setBounds(10, 50, 100, 30);
        JTextField student1Id = new JTextField();
        student1Id.setBounds(120, 50, 150, 30);

        // Labels and TextFields for the second student
        JLabel label3 = new JLabel("Student 2 Name:");
        label3.setBounds(10, 90, 100, 30);
        JTextField student2Name = new JTextField();
        student2Name.setBounds(120, 90, 150, 30);

        JLabel label4 = new JLabel("Student 2 ID:");
        label4.setBounds(10, 130, 100, 30);
        JTextField student2Id = new JTextField();
        student2Id.setBounds(120, 130, 150, 30);

        // Button to compare the two students
        JButton compareButton = new JButton("Compare");
        compareButton.setBounds(90, 180, 100, 30);

        // Label to display result
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 220, 250, 30);

        // Action listener for the compare button
        compareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name1 = student1Name.getText();
                int id1 = Integer.parseInt(student1Id.getText());
                String name2 = student2Name.getText();
                int id2 = Integer.parseInt(student2Id.getText());

                // Create student objects
                Student student1 = new Student(name1, id1);
                Student student2 = new Student(name2, id2);

                // Compare students and display result
                if (student1.equals(student2)) {
                    resultLabel.setText("Both students have the same info!");
                } else {
                    resultLabel.setText("<html>Student 1: " + name1 + ", ID: " + id1 + 
                                        "<br>Student 2: " + name2 + ", ID: " + id2 + "</html>");
                }
            }
        });

        // Add components to the frame
        frame.add(label1);
        frame.add(student1Name);
        frame.add(label2);
        frame.add(student1Id);
        frame.add(label3);
        frame.add(student2Name);
        frame.add(label4);
        frame.add(student2Id);
        frame.add(compareButton);
        frame.add(resultLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}

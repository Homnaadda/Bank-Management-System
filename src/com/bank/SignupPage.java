package com.bank;


import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupPage extends JFrame implements ActionListener{

    long random;
    JTextField nameTextField,
            fnameTextField,
            emailTextField,
            addressTextField,
            cityTextField,
            stateTextField,
            pincodeTextField;

    JButton next;
    JRadioButton male,
            female,
            other,
            married,
            unmarried;

    JDateChooser dateChooser;


    SignupPage(){
        setLayout(null);

        setSize(850,800);
        setLocation(350,10);
        getContentPane().setBackground(Color.white);

        // Generating Random number
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L)+1000L);

        // Creating new label heading for signup page
        JLabel formno = new JLabel("APPLICATION FORM NO. "+ random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        // Creating new label personal details

        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        // Creating new label name
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        // Creating new text field for name
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        // Creating new label fathers name
        JLabel fname = new JLabel("Fathers Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        // Creating new text field for fathers name
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);

        // Creating new label DOB
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        // Creating the JDateChooser for DOB from the imported jcalander jar file
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,240,400,30);
        add(dateChooser);


        // Creating new label gender
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        // Creating radio button for the gender and group them
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);


        // Creating new label Email
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        // Creating new text field for email address
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        // Creating new label Marital status
        JLabel marital = new JLabel("Marital status: ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        // Creating radio button for the Marital status and group them
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);


        // Creating new label Address
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        // Creating new text field for address
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        // Creating new label City
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        // Creating new text field for City
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        // Creating new label State
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        // Creating new text field for State
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);

        // Creating new label Pincode
        JLabel pincode = new JLabel("Pincode : ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        // Creating new text field for Pincode
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String formno = "" + random;
        String name = nameTextField.getText().trim();
        String fname = fnameTextField.getText().trim();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText().trim();

        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        String email = emailTextField.getText().trim();

        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        String address = addressTextField.getText().trim();
        String city = cityTextField.getText().trim();
        String state = stateTextField.getText().trim();
        String pin = pincodeTextField.getText().trim();

        try {

            // 1. Name validation
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Name is required"
                );
                return;
            }

            // 2. Father's name validation
            if (fname.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Father's Name is required"
                );
                return;
            }

            // 3. Date of birth validation
            if (dob.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Date of Birth is required"
                );
                return;
            }

            // 4. Gender validation
            if (gender == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Please select Gender"
                );
                return;
            }

            // 5. Email validation
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Email is required"
                );
                return;
            }

            if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                JOptionPane.showMessageDialog(
                        null,
                        "Please enter a valid Email Address"
                );
                return;
            }

            // 6. Marital status validation
            if (marital == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Please select Marital Status"
                );
                return;
            }

            // 7. Address validation
            if (address.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Address is required"
                );
                return;
            }

            // 8. City validation
            if (city.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "City is required"
                );
                return;
            }

            // 9. State validation
            if (state.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "State is required"
                );
                return;
            }

            // 10. Pincode validation
            if (pin.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Pincode is required"
                );
                return;
            }

            if (!pin.matches("\\d{6}")) {
                JOptionPane.showMessageDialog(
                        null,
                        "Pincode must contain exactly 6 digits"
                );
                return;
            }

            // If all validation passes
            Conn c = new Conn();

            String query = "INSERT INTO signup VALUES('" +
                    formno + "', '" +
                    name + "', '" +
                    fname + "', '" +
                    dob + "', '" +
                    gender + "', '" +
                    email + "', '" +
                    marital + "', '" +
                    address + "', '" +
                    city + "', '" +
                    pin + "', '" +
                    state + "')";

            c.s.executeUpdate(query);

            JOptionPane.showMessageDialog(
                    null,
                    "Application submitted successfully!"
            );

        } catch (Exception e) {
            e.printStackTrace();

            JOptionPane.showMessageDialog(
                    null,
                    "Unable to save application.\nPlease try again."
            );
        }
    }
    public static void main(String[] args){
        new SignupPage();
    }

}

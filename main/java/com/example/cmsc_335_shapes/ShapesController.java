// This class will control how the app responds when the user interacts with the GUI

package com.example.cmsc_335_shapes;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ShapesController {

    @FXML
    private Label calculateText;
    @FXML
    private VBox inputContainer;  // Holds input fields

    private TextField radiusField;      // Holds user's RADIUS (Circle, Cone, Cylinder, Sphere)
    private TextField heightField;      // Holds user's HEIGHT (Cone, Cylinder, Triangle)
    private TextField lengthField;      // Holds user's LENGTH (Square, Rectangle, Cube, Torus major radius)
    private TextField widthField;       // Holds user's WIDTH (Rectangle, Torus minor radius)
    private TextField baseField;        // Holds user's BASE (Triangle)
    private TextField minorRadiusField; // Holds user's MINOR RADIUS (Torus)
    private TextField majorRadiusField; // Holds user's Major RADIUS (Torus)
    @FXML
    private ImageView shapeImageView;
    @FXML
    private ComboBox<String> shapeSelector;  // This links to ComboBox in the FXML for Shapes



    @FXML
    public void initialize() {    // This gets called when the app starts
        shapeSelector.setPromptText("Select a shape");  // This sets the text shown on the selection drop box


        shapeSelector.getItems().addAll("Circle", "Cone", "Cube", "Cylinder",   // Shapes in drop box
                "Rectangle", "Sphere", "Square", "Torus", "Triangle"
        );

        shapeSelector.setOnAction(event -> {      // Reads user selection
            String selectedShape = shapeSelector.getValue();

            inputContainer.getChildren().clear();  // Clears any old inputs

            //     CIRCLE
            if (selectedShape.equals("Circle")) {
                Label radiusLabel = new Label("Enter radius:");
                radiusField = new TextField();
                radiusField.setPromptText("Radius");
                inputContainer.getChildren().addAll(radiusLabel, radiusField);

            //     SQUARE
            } else if (selectedShape.equals("Square")) {
                Label lengthLabel = new Label("Enter length");
                lengthField = new TextField();
                lengthField.setPromptText("Length");
                inputContainer.getChildren().addAll(lengthLabel, lengthField);

            //     RECTANGLE
            } else if (selectedShape.equals("Rectangle")) {
                Label lengthLabel = new Label("Enter length:");
                lengthField = new TextField();
                lengthField.setPromptText("Length");

                Label widthLabel = new Label("Enter width:");
                widthField = new TextField();
                widthField.setPromptText("Width");

                inputContainer.getChildren().addAll(lengthLabel, lengthField, widthLabel, widthField);

            //     TRIANGLE
            } else if (selectedShape.equals("Triangle")) {
                Label baseLabel = new Label("Enter base:");
                baseField = new TextField();
                baseField.setPromptText("Base");

                Label heightLabel = new Label("Enter height:");
                heightField = new TextField();
                heightField.setPromptText("Height");

                inputContainer.getChildren().addAll(baseLabel, baseField, heightLabel, heightField);

                //     CONE
            } else if (selectedShape.equals("Cone")) {
                Label radiusLabel = new Label("Enter radius:");
                radiusField = new TextField();
                radiusField.setPromptText("Radius");

                Label heightLabel = new Label("Enter height:");
                heightField = new TextField();
                heightField.setPromptText("Height");

                inputContainer.getChildren().addAll(radiusLabel, radiusField, heightLabel, heightField);

                //     CUBE
            } else if (selectedShape.equals("Cube")) {
                Label lengthLabel = new Label("Enter side length:");
                lengthField = new TextField();
                lengthField.setPromptText("Side length");

                inputContainer.getChildren().addAll(lengthLabel, lengthField);

                //     CYLINDER
            } else if (selectedShape.equals("Cylinder")) {
                Label radiusLabel = new Label("Enter radius:");
                radiusField = new TextField();
                radiusField.setPromptText("Radius");

                Label heightLabel = new Label("Enter height:");
                heightField = new TextField();
                heightField.setPromptText("Height");

                inputContainer.getChildren().addAll(radiusLabel, radiusField, heightLabel, heightField);

                //     SPHERE
            } else if (selectedShape.equals("Sphere")) {
                Label radiusLabel = new Label("Enter radius:");
                radiusField = new TextField();
                radiusField.setPromptText("Radius");

                inputContainer.getChildren().addAll(radiusLabel, radiusField);

                //     TORUS
            } else if (selectedShape.equals("Torus")) {
                Label majorLabel = new Label("Enter major radius:");
                lengthField = new TextField();
                lengthField.setPromptText("Major radius");

                Label minorLabel = new Label("Enter minor radius:");
                widthField = new TextField();
                widthField.setPromptText("Minor radius");

                inputContainer.getChildren().addAll(majorLabel, lengthField, minorLabel, widthField);
            }
        });
    }
    @FXML
    protected void onCalculateButtonClick() {   // Prompts calculation, shape display
        String selectedShape = shapeSelector.getValue();

        //  CIRCLE
        if ("Circle".equals(selectedShape)) {
            try {                               // Ensure valid input
                double radius = Double.parseDouble(radiusField.getText());
                if (radius <= 0) {
                    calculateText.setText("Radius must be a positive number.");
                    return;
                }
                Circle circle = new Circle(radius);
                calculateText.setText(circle.getFormattedResults());

                shapeImageView.setImage(new Image(getClass().getResource("/com/example/cmsc_335_shapes/images/circle.jpg").toExternalForm()));


            } catch (NumberFormatException e) {
                calculateText.setText("Please enter a valid number for radius.");
            }
        }

        //  SQUARE
        else if ("Square".equals(selectedShape)) {
            try {
                double length = Double.parseDouble(lengthField.getText());
                if (length <= 0) {
                    calculateText.setText("Length must be a positive number.");
                    return;
                }
                Square square = new Square(length);
                calculateText.setText(square.getFormattedResults());

                updateImageForShape(selectedShape);


            } catch (NumberFormatException e) {
                calculateText.setText("Please enter a valid number for length.");
            }
        }
        //  RECTANGLE
        else if ("Rectangle".equals(selectedShape)) {
            try {
                double length = Double.parseDouble(lengthField.getText());
                double width = Double.parseDouble(widthField.getText());

                if (length <= 0) {
                    calculateText.setText("Length must be a positive number.");
                    return;
                }

                if (width <= 0) {
                    calculateText.setText("Width must be a positive number.");
                    return;
                }

                Rectangle rectangle = new Rectangle(length, width);
                calculateText.setText(rectangle.getFormattedResults());

                updateImageForShape(selectedShape);


            } catch (NumberFormatException e) {
                calculateText.setText("Please enter valid numbers for length and width.");
            }
        }
        //  TRIANGLE
        else if ("Triangle".equals(selectedShape)) {
            try {
                double base = Double.parseDouble(baseField.getText());
                double height = Double.parseDouble(heightField.getText());

                if (base <= 0) {
                    calculateText.setText("Base must be a positive number.");
                    return;
                }

                if (height <= 0) {
                    calculateText.setText("Height must be a positive number.");
                    return;
                }

                Triangle triangle = new Triangle(base, height);
                calculateText.setText(triangle.getFormattedResults());

                updateImageForShape(selectedShape);


            } catch (NumberFormatException e) {
                calculateText.setText("Please enter valid numbers for base and height.");
            }
        }

        // CONE

        else if ("Cone".equals(selectedShape)) {
            try {
                double radius = Double.parseDouble(radiusField.getText());
                double height = Double.parseDouble(heightField.getText());

                if (radius <= 0) {
                    calculateText.setText("Base must be a positive number.");
                    return;
                }
                if (height <= 0) {
                    calculateText.setText("Height must be a positive number.");
                    return;
                }
                Cone cone = new Cone(height, radius);
                calculateText.setText(cone.getFormattedResults());

                updateImageForShape(selectedShape);


            } catch (NumberFormatException e) {
                calculateText.setText("Please enter valid numbers for radius and height.");
            }
        }
        // ====== CUBE ======
        else if ("Cube".equals(selectedShape)) {
            try {
                double length = Double.parseDouble(lengthField.getText());

                if (length <= 0) {
                    calculateText.setText("Side length must be a positive number.");
                    return;
                }

                Cube cube = new Cube(length);
                calculateText.setText(String.format("Cube\nVolume: %.2f\nSurface Area: %.2f",
                        cube.getVolume(), cube.getSurfaceArea()));

                updateImageForShape(selectedShape);


            } catch (NumberFormatException e) {
                calculateText.setText("Please enter a valid number for side length.");
            }
        }

        //   CYLINDER
        else if ("Cylinder".equals(selectedShape)) {
            try {
                double radius = Double.parseDouble(radiusField.getText());
                double height = Double.parseDouble(heightField.getText());

                if (radius <= 0) {
                    calculateText.setText("Radius must be a positive number.");
                    return;
                }

                if (height <= 0) {
                    calculateText.setText("Height must be a positive number.");
                    return;
                }

                Cylinder cylinder = new Cylinder(height, radius);
                calculateText.setText(String.format("Cylinder\nVolume: %.2f\nSurface Area: %.2f",
                        cylinder.getVolume(), cylinder.getSurfaceArea()));

                updateImageForShape(selectedShape);


            } catch (NumberFormatException e) {
                calculateText.setText("Please enter valid numbers for radius and height.");
            }
        }

        //  SPHERE
        else if ("Sphere".equals(selectedShape)) {
            try {
                double radius = Double.parseDouble(radiusField.getText());

                if (radius <= 0) {
                    calculateText.setText("Radius must be a positive number.");
                    return;
                }

                Sphere sphere = new Sphere(radius);
                calculateText.setText(String.format("Sphere\nVolume: %.2f\nSurface Area: %.2f",
                        sphere.getVolume(), sphere.getSurfaceArea()));

                updateImageForShape(selectedShape);


            } catch (NumberFormatException e) {
                calculateText.setText("Please enter a valid number for radius.");
            }
        }

        //  TORUS
        else if ("Torus".equals(selectedShape)) {
            try {
                double majorRadius = Double.parseDouble(lengthField.getText());
                double minorRadius = Double.parseDouble(widthField.getText());

                if (majorRadius <= 0 || minorRadius <= 0) {
                    calculateText.setText("Both radii must be positive numbers.");
                    return;
                }

                if (minorRadius >= majorRadius) {
                    calculateText.setText("Minor radius must be smaller than major radius.");
                    return;
                }

                Torus torus = new Torus(majorRadius, minorRadius);
                calculateText.setText(String.format("Torus\nVolume: %.2f\nSurface Area: %.2f",
                        torus.getVolume(), torus.getSurfaceArea()));

                updateImageForShape(selectedShape);


            } catch (NumberFormatException e) {
                calculateText.setText("Please enter valid numbers for both radii.");
            }
        }
    }
    private void setShapeImage(String imageFileName) {
        try {
            shapeImageView.setImage(new Image(getClass().getResource("/com/example/cmsc_335_shapes/images/" + imageFileName).toExternalForm()));
        } catch (Exception e) {
            shapeImageView.setImage(null); // fallback
            System.out.println("Image not found: " + imageFileName);
        }
    }
    // Determine which shape image should be shown
    private void updateImageForShape(String shapeName) {
        switch (shapeName) {
            case "Circle" -> setShapeImage("circle.jpg");
            case "Square" -> setShapeImage("square.jpg");
            case "Rectangle" -> setShapeImage("rectangle.jpg");
            case "Triangle" -> setShapeImage("triangle.jpg");
            case "Cone" -> setShapeImage("cone.jpg");
            case "Cube" -> setShapeImage("cube.jpg");
            case "Cylinder" -> setShapeImage("cylinder.jpg");
            case "Sphere" -> setShapeImage("sphere.jpg");
            case "Torus" -> setShapeImage("torus.jpg");
            default -> shapeImageView.setImage(null); // Fallback image or none
        }
    }
}



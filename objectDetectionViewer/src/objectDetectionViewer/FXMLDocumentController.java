/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectDetectionViewer;

import java.io.BufferedReader;
import java.net.URL;
import java.util.ResourceBundle;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 *
 * @author david
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label errorMessage;

    @FXML
    private Button openFile;

    @FXML
    private MediaView mediaView;

    @FXML
    private void openFileDialog(ActionEvent event) throws Exception, InterruptedException {
        String source;
        String destination;
        String outputInfo;
        FileChooser fileChooser = new FileChooser();
        File sampleFile = fileChooser.showOpenDialog(null);

        if (sampleFile != null) {
            errorMessage.setText("File selected: " + sampleFile.getName());
            source = sampleFile.toURI().toString();
            File destinationFile = new File("yolo-object-detection/output/vid1.mp4");
            destination = destinationFile.toURI().toString();
            System.out.println("File URI: " + source);
            try {
                String[] command = {"/usr/local/bin/python2", "yolo-object-detection/yolo_video.py", "--input", source, "--output", destination, "--yolo", "yolo-object-detection/yolo-coco"};
                ProcessBuilder pb = new ProcessBuilder(command);
                Process p = pb.start();
                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                do {
                outputInfo = in.readLine();
                System.out.println(outputInfo);
                } while (outputInfo != null);
                System.out.println("Process finished");
                System.out.println("Video sent to: " + destination);
                Media detectVid = new Media(destination);
                MediaPlayer mediaPlayer = new MediaPlayer(detectVid);
                mediaView.setMediaPlayer(mediaPlayer);
                mediaPlayer.setAutoPlay(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            errorMessage.setText("No file selected");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

module tn.medbenmed.texttospeech {
    requires javafx.controls;
    requires javafx.fxml;
    requires freetts;


    opens tn.medbenmed.texttospeech to javafx.fxml;
    exports tn.medbenmed.texttospeech;
}
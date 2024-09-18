package observer;

public class Main {
    public static void main(String[] args) {
        SubjectClass subjectClass = new SubjectClass();

        subjectClass.setMeasurements(35, 100, 10);

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(subjectClass);
        CurrentPressureDisplay currentPressureDisplay = new CurrentPressureDisplay(subjectClass);

        currentConditionDisplay.update();
        currentPressureDisplay.update();

        subjectClass.setMeasurements(18, 10, 90);

        currentConditionDisplay.update();
        currentPressureDisplay.update();
    }
}


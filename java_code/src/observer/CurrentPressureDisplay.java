package observer;

public class CurrentPressureDisplay implements DisplayElement, Observer{
    private float pressure;
    private SubjectClass subjectClass;

    public CurrentPressureDisplay(SubjectClass subjectClass) {
        this.subjectClass = subjectClass;
        subjectClass.registerObserver(this);
    }

    public void update() {
        this.pressure = this.subjectClass.getPressure();
        display();
    }

    public void display() {
        System.out.println("현재 압력 상태: " + this.pressure);
    }
}

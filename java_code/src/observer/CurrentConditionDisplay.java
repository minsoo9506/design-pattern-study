package observer;

public class CurrentConditionDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private SubjectClass subjectClass;

    public CurrentConditionDisplay(SubjectClass subjectClass) {
        this.subjectClass = subjectClass;
        subjectClass.registerObserver(this);
    }

    public void update() {
        this.temperature = subjectClass.getTemperature();
        this.humidity = subjectClass.getHumidity();
        display();
    }

    public void display() {
        System.out.println("현재 상태: 온도 " + this.temperature + ", 습도: " +  this.humidity);
    }
}

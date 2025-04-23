package EmergencyAlertSystem;

public class EmergencyAlert {
    private double heartRate;
    private double bloodPressure;

    public EmergencyAlert(double heartRate, double bloodPressure) {
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
    }

    public boolean isCritical() {
        return heartRate > 120 || bloodPressure > 180;
    }

    public void checkVitals() throws CriticalConditionException {
        if (isCritical()) {
            throw new CriticalConditionException("CRITICAL: Vitals exceeded safe threshold!");
        }
    }

    public double getHeartRate() {
        return heartRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }
}

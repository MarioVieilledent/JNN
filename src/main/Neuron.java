package src.main;

public class Neuron {

    private NeuronType type;
    private String name;
    private boolean activated;
    private double threshold;

    public Neuron(NeuronType type, String name) {
        this.type = type;
        this.threshold = 0.5;
        this.name = name;
    }

    public NeuronType getType() {
        return this.type;
    }

    public void setType(NeuronType type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActivated() {
        return this.activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public double getThreshold() {
        return this.threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }
}

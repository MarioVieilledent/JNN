package src.main;

public class Synapse {

    private double strength;
    private Neuron inputNeuron;
    private Neuron outputNeuron;

    public Synapse(double strength, Neuron inputNeuron, Neuron outputNeuron) {
        this.strength = strength;
        this.inputNeuron = inputNeuron;
        this.outputNeuron = outputNeuron;
    }

    public double getStrength() {
        return this.strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public Neuron getInputNeuron() {
        return this.inputNeuron;
    }

    public void setInputNeuron(Neuron inputNeuron) {
        this.inputNeuron = inputNeuron;
    }

    public Neuron getOutputNeuron() {
        return this.outputNeuron;
    }

    public void setOutputNeuron(Neuron outputNeuron) {
        this.outputNeuron = outputNeuron;
    }

}

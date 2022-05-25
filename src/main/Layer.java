package src.main;

import java.util.ArrayList;

public class Layer {

    private LayerType type;
    private ArrayList<Neuron> neuronList;

    public Layer(LayerType type) {
        this.type = type;
        this.neuronList = new ArrayList<Neuron>();
    }

    public void addNeuron(Neuron n) {
        this.neuronList.add(n);
    }

    public LayerType getType() {
        return this.type;
    }

    public void setType(LayerType type) {
        this.type = type;
    }
}

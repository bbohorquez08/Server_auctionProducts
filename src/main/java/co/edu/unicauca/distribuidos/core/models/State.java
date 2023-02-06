package co.edu.unicauca.distribuidos.core.models;

public enum State {
    En_Subasta("En Subasta"), Pendiente("Pendiente"), Vendido("Vendido");

    private String state;

    private State(String state){
        this.state=state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

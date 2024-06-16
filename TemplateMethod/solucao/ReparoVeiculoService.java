package Main.TemplateMethod.solucao;

public abstract class ReparoVeiculoService  {
    public void reparaVeiculo(){
        entradaOficina();
        analisarDanos();
        if(veiculoParaReparo()){
            repararVeiculo();
            notificarReparoParaSeguradora();
        }else{
            notificarPerdaTotalParaSeguradora();
        }}

    protected abstract boolean veiculoParaReparo();

    private void notificarPerdaTotalParaSeguradora() {
        System.out.println("Veiculo totalmente sem reparos...");
    }
    private void repararVeiculo(){
        System.out.println("Reparando veiculo...");
    }
    private void notificarReparoParaSeguradora(){
        System.out.println("Notificando a seguradora...");
    }

    private void analisarDanos(){
        System.out.println("Veiculo danos...");
    }

    private void entradaOficina(){
        System.out.println("Veiculo entrado ofician...");
    }
}

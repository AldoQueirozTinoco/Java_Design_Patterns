package Main.TemplateMethod.Problema;

import Main.TemplateMethod.VeiculoParaReparo;

public class ReparaVeiculoComumService {
    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoComumService(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    public void reparaVeiculo(){
        entradaOficina();
        analisarDanos();
        if(veiculoParaReparo()){
            repararVeiculo();
            notificarReparoParaSeguradora();
        }else{
            notificarPerdaTotalParaSeguradora();
        }}

        private boolean veiculoParaReparo(){
        return veiculoParaReparo.getPorcentagemDano() <= 70;
        }

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


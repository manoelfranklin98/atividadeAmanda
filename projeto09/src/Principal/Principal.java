package Principal;

import Criadores.FabricaEmail;
import Criadores.FabricaSMS;
import Criadores.FabricaPush;
import Criadores.FabricaNotificacao;

public class Principal {
    public static void main(String[] args) {
        FabricaNotificacao fabricaEmail = new FabricaEmail();
        fabricaEmail.notificar("Olá, esta é uma mensagem por EMAIL.");

        FabricaNotificacao fabricaSMS = new FabricaSMS();
        fabricaSMS.notificar("Olá, esta é uma mensagem por SMS.");

        FabricaNotificacao fabricaPush = new FabricaPush();
        fabricaPush.notificar("Olá, esta é uma mensagem por PUSH.");
    }
}

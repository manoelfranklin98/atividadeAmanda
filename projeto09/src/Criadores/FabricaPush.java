package Criadores;

import Interface.Notificacao;
import Produtos.NotificacaoPush;

public class FabricaPush extends FabricaNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoPush();
    }
}

package Criadores;

import interface.Notificacao;
import Produtos.NotificacaoSMS;

public class FabricaSMS extends FabricaNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}

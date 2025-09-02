package Criadores;
import Interface.Inotificacao;

import Produtos.NotificacaoEmail;

public class FabricaEmail extends FabricaNotificacao {
    @Override
    protected notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}

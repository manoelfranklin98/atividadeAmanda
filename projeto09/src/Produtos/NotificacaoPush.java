package Produtos;

import Interface.Inotificacao;

public class NotificacaoPush implements Inotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando PUSH: " + mensagem);
    }
}

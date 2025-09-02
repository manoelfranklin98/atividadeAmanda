package Produtos;

import Interface.Inotificacao;

public class NotificacaoSMS implements Inotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}

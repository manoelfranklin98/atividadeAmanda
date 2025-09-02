package Criadores;
import Interface.Inotificacao;


public abstract class FabricaNotificacao {

    protected abstract Inotificacao criarNotificacao();

    public void notificar(String mensagem) {
        Inotificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
    }
}

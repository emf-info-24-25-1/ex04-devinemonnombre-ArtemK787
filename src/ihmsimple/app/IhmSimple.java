package ihmsimple.app;

import ihmsimple.ctrl.Controller;
import ihmsimple.services.ServiceDevine;
import ihmsimple.views.View;

public class IhmSimple {

    /**
     * Méthode principale de l'application qui instancie les objets MVC et les relie
     * entre eux.
     * Voir le diagramme de séquence pour l'implémentation e cette méthode.
     * 
     * @param args arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Controller refctrl = new Controller(0, null, null);
        ServiceDevine refServiceDevine = new ServiceDevine(refctrl);
        View refView = new View();

        refctrl.setRefServiceDevine(refServiceDevine);
        refctrl.setRefView(refView);
        refView.setRefCtrl(refctrl);
        refServiceDevine.setRefCtrl(refctrl);
        refctrl.start();
    }

}

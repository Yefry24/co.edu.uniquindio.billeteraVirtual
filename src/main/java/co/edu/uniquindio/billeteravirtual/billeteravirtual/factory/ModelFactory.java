package co.edu.uniquindio.billeteravirtual.billeteravirtual.factory;

public class ModelFactory {
    private static ModelFactory modelFactory;

    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
}

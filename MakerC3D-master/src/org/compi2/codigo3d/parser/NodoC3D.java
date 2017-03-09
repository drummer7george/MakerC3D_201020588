package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
        private String etv;
                private String etf;

    public NodoC3D(String cad,String etv,String etf) {
        this.cad = cad;
        this.etv=etv;
                this.etf=etf;
    }
    
    public String getCad(){
        return cad;
    }
    
        public String getEtv(){
        return etv;
    }
                public String getEtf(){
        return etf;
    }
        
}

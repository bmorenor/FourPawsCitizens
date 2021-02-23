package edu.unbosque.fourpawscitizens.model.dtos;

public class Pet {

    public String id;
    public Long microchip;
    public String species;
    public String sex;
    public String size;
    public boolean potentDangerous;
    public String neighborhood;

    /**
     *
     * @param id
     * @param microchip
     * @param species
     * @param sex
     * @param size
     * @param potentDangerous
     * @param neighborhood
     */
    public Pet(String id, Long microchip, String species, String sex, String size, boolean potentDangerous, String neighborhood) {
        this.id = id;
        this.microchip = microchip;
        this.species = species;
        this.sex = sex;
        this.size = size;
        this.potentDangerous = potentDangerous;
        this.neighborhood = neighborhood;
    }

    /**
     * @param cadena
     * @return
     */
    public boolean soloNumeros(String cadena) {
        boolean mensaje;
        try {
            Integer.parseInt(cadena);
            mensaje = true;
        } catch (NumberFormatException e) {
            mensaje = false;
        }
        return mensaje;
    }

    /**
     * @param cadena
     * @return
     */
    public boolean soloLetras(String cadena) {
        boolean mensaje;
        if (cadena.matches("[a-zA-Z]*")) {
            mensaje = true;
        } else {
            mensaje = false;
        }
        return mensaje;
    }

    /**
     * @param cadena
     * @return
     */
    public boolean validarBoolean(String cadena) {
        boolean mensaje;
        if (cadena.matches("[0-9]*")) {
            mensaje = true;
        } else {
            mensaje = false;
        }
        return mensaje;
    }


}
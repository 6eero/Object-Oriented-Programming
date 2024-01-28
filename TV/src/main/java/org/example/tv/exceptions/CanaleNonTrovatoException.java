package org.example.tv.exceptions;

import org.example.emittente.Canale;

public class CanaleNonTrovatoException extends Exception {

    public CanaleNonTrovatoException() {

    }

    public CanaleNonTrovatoException(String stringa) {
        super(stringa);
    }
}

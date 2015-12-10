/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandcamp;

/**
 *
 * @author SoftwareDev
 */
public enum Genre {
    
    ROCK, POP, BLUES, CLASSICAL,
    PUNK, JAZZ, COUNTRY, RNB;
    
    public String toString() {
        switch(this){
            case ROCK: return "Rock";
            case POP: return "Pop";
            case BLUES: return "Blues";
            case CLASSICAL: return "Classical";
            case PUNK: return "Punk";
            case JAZZ: return "Jazz";
            case COUNTRY: return "Country";
            case RNB: return "Rhythm and blues";
            default: return "None";
        }
    }
}

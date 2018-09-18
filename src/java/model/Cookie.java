/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class Cookie {
    private int bnkGen;
    private int music;
    private int idol;

    public Cookie(int bnkGen, int music, int idol) {
        this.bnkGen = bnkGen;
        this.music = music;
        this.idol = idol;
    }

    public int getIdol() {
        return idol;
    }

    public void setIdol(int idol) {
        this.idol = idol;
    }

    public int getBnkGen() {
        return bnkGen;
    }

    public void setBnkGen(int bnkGen) {
        this.bnkGen = bnkGen;
    }

    public int getMusic() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }

    @Override
    public String toString() {
        return "Cookie{" + "bnkGen=" + bnkGen + ", music=" + music + ", idol=" + idol + '}';
    }
    
    
}

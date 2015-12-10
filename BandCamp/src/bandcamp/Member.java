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
public class Member implements Comparable<Member>{
    private int id;
    private String name;
    
    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int compareTo(Member otherMember)
    {
        return this.getId() > otherMember.getId() ? 1  :
               this.getId() < otherMember.getId() ? -1 : 0;
    }


    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}

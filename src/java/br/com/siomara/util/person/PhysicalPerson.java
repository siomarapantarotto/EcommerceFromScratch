package br.com.siomara.util.person;

import java.util.Date;

/**
 *
 * @author siomara.com.br
 */
public final class PhysicalPerson extends Person {
    
    //public String nickname;
    private String nickname;
    private Date birthday;

    public PhysicalPerson() {
    }

    public PhysicalPerson(Date birthday) {
        this.birthday = birthday;
    }

    public PhysicalPerson(Date birthday, String name, String contactPhone) {
        super(name, contactPhone);
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

      public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "PhysicalPerson{" + "nickname=" + nickname + ", birthday=" + birthday + '}';
    }
      
}

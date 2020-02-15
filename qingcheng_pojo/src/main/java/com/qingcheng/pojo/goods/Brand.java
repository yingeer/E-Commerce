package com.qingcheng.pojo.goods;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_brand", schema="qingcheng_goods")
public class Brand implements Serializable {

    @Id
    private Integer id;

    private  String name;

    private String image;

    private String letter;

    private Integer seq;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Brand{name: "+name+
                " image: " + image +
                " letter: " + image +
                " seq: " + seq +
                "}";

    }
}

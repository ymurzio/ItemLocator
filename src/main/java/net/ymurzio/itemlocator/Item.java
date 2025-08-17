package net.ymurzio.itemlocator;

import jakarta.persistence.*;

@Entity
public class Item {

    protected Item() {}

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Item[id=%d, name='%s']",
                item_id, name);
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long item_id;

    @Column(nullable = false)
    private String name;

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

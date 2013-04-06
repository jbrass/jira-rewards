/*
 * Created on 4/6/13
 */
package ro.agrade.jira.rewards.services;

/**
 * The reward type. For now, only beer.
 *
 * @author Radu Dumitriu (rdumitriu@gmail.com)
 * @since 1.0
 */
public class RewardType {
    //<field name="t_id" type="numeric"/>
    private long id;
    //<field name="t_name" type="long-varchar"/>
    private String name;
    //<field name="t_desc" type="extremely-long"/>
    private String description;

    /**
     * Constructs a reward type
     * @param id the id
     * @param name the name
     * @param description the description
     */
    public RewardType(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

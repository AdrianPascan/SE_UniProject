package ubbproject.domain;

import javax.persistence.Entity;

@Entity
public class ReviewEvaluation extends BaseEntity<Long> {
    private Long pc_id;
    private Long paper_id;
    private int result;
    private Date date;

    public ReviewEvaluation() {
    }

    public ReviewEvaluation(Long pc_id, Long paper_id, int result, Date date) {
        this.pc_id = pc_id;
        this.paper_id = paper_id;
        this.result = result;
        this.date = date;
    }

    public Long getPc_id() {
        return pc_id;
    }

    public void setPc_id(Long pc_id) {
        this.pc_id = pc_id;
    }

    public Long getPaper_id() {
        return paper_id;
    }

    public void setPaper_id(Long paper_id) {
        this.paper_id = paper_id;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ReviewEvaluation{" +
                "pc_id=" + pc_id +
                ", paper_id=" + paper_id +
                ", result=" + result +
                ", date=" + date +
                '}';
    }
}

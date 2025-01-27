package feature.bid.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "BID_ITEM")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BidItemVo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BID_ITEM_NO", insertable = false, updatable = false)
    private Integer bidItemNo;

    @Column(name = "BID_ITEM_NAME")
    private String bidItemName;

    @Column(name = "BID_ITEM_DESCRIBE")
    private String bidItemDescribe;

    @Column(name = "ITEM_CLASS_NO")
    private Integer itemClassNo;

    @Column(name = "GAME_PUBLISHER")
    private String gamePublisher;

    @Column(name = "BID_ITEM_PIC")
    private byte[] bidItemPic;
}

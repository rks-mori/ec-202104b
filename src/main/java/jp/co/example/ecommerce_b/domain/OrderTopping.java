package jp.co.example.ecommerce_b.domain;

/**
 * 注文トッピング情報を操作するリポジトリクラス.
 * 
 * @author shigeki.morishita
 *
 */
public class OrderTopping {
	/** id */
	private Integer id;
	/** toppngId */
	private Integer toppngId;
	/** orderItemId */
	private Integer orderItemId;
	/** トッピング */
	private Topping topping;

	@Override
	public String toString() {
		return "OrderTopping [id=" + id + ", toppngId=" + toppngId + ", orderItemId=" + orderItemId + ", topping="
				+ topping + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getToppngId() {
		return toppngId;
	}

	public void setToppngId(Integer toppngId) {
		this.toppngId = toppngId;
	}

	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Topping getTopping() {
		return topping;
	}

	public void setTopping(Topping topping) {
		this.topping = topping;
	}

}

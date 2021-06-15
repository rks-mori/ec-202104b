package jp.co.example.ecommerce_b.domain;

/**
 * トッピング情報を操作するリポジトリクラス.
 * 
 * @author shigeki.morishita
 *
 */
public class Topping {
	/** id */
	private Integer id;
	/** トッピング名 */
	private String name;
	/** Mサイズ値段 */
	private Integer priceM;
	/** Lサイズ値段 */
	private Integer priceL;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPriceM() {
		return priceM;
	}

	public void setPriceM(Integer priceM) {
		this.priceM = priceM;
	}

	public Integer getPriceL() {
		return priceL;
	}

	public void setPriceL(Integer priceL) {
		this.priceL = priceL;
	}

	@Override
	public String toString() {
		return "Topping [id=" + id + ", name=" + name + ", priceM=" + priceM + ", priceL=" + priceL + "]";
	}

}

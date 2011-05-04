package at.jku.ce;

public class DomainObject {

	private String uuid = UUID.randomUUID().toString();
	private String name;
	private String comment;

	/**
	* Default constructor
	*/
	public DomainObject() {
		super();
	}

	public DomainObject(String uuid, String name, String comment) {
		super();
		this.uuid = uuid;
		this.name = name; 
		this.comment = comment;
	}
	
	public String getUuId() {
		return uuid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

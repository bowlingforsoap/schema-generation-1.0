package ua.kharkiv.knure.dimploma.final_structure;

import ua.kharkiv.knure.dimploma.containers.Object;

public class LinkedObjects extends BoundObjects {
	protected Object obj1;
	protected Object obj2;
	/**
	 * <b>{@code obj1}</b> is linked to <b>{@code obj2}</b>
	 * <p>
	 * Note! The links (aka <b>{@code obj1Linked}</b> and <b>{@code obj2Linked}
	 * </b>) are not mutually exclusive.
	 */
	protected boolean obj1Linked;
	/**
	 * <b>{@code obj2}</b> is linked to <b>{@code obj1}</b>
	 */
	protected boolean obj2Linked;

	public Object getObj1() {
		return obj1;
	}

	public void setObj1(Object obj1) {
		this.obj1 = obj1;
	}

	public Object getObj2() {
		return obj2;
	}

	public void setObj2(Object obj2) {
		this.obj2 = obj2;
	}

	public boolean isObj1Linked() {
		return obj1Linked;
	}

	public void setObj1Linked(boolean obj1Linked) {
		this.obj1Linked = obj1Linked;
	}

	public boolean isObj2Linked() {
		return obj2Linked;
	}

	public void setObj2Linked(boolean obj2Linked) {
		this.obj2Linked = obj2Linked;
	}
}

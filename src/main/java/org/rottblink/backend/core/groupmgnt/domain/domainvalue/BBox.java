package org.rottblink.backend.core.groupmgnt.domain.domainvalue;

public class BBox {

    private LatLng topLeft;
    private LatLng bottomRight;

    public BBox() {
	}
    
    public BBox(LatLng topLeft, LatLng bottomRight) {
    	this.topLeft = topLeft;
    	this.bottomRight = bottomRight;
    }
    public BBox(double top, double left, double bottom, double right) {
    	this.topLeft = new LatLng(top,left);
    	this.bottomRight = new LatLng(bottom,right);
    }
    
    

	public LatLng getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(LatLng topLeft) {
		this.topLeft = topLeft;
	}

	public LatLng getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(LatLng bottomRight) {
		this.bottomRight = bottomRight;
	}

	public Double getMinLat() {
		return bottomRight.getLatitude();
	}
	public Double getMaxLat() {
		return topLeft.getLatitude();
	}
	
	public Double getMaxLng() {
		return bottomRight.getLongitude();
	}
	public Double getMinLng() {
		return topLeft.getLongitude();
	}

}

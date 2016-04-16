package b1.a1;

public class Point3D<N extends Number> extends Point2D<N>{

	N z;

	public N getZ() {
		return z;
	}

	public void setZ(N z) {
		this.z = z;
	}
	
}

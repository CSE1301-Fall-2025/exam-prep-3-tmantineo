package exam.codewriting.q2;

/*
 * We wish to create a Planet class. A planet has-a(n):
		name
		mass
 */
public class Planet {

	// Define your instance variables here
	private String name;
	private int mass;

	// Write the constructor for the Planet class
	public Planet(String name, int mass) {
		this.name = name;
		this.mass = mass; 
	}


	public String getName () {
		return this.name; //FIXME
	}
	
	public int getMass () {
		return this.mass; //FIXME
	}
	
	public String toString () {
		return this.name + " has a mass of " + this.mass; //FIXME
	}
	
	/**
	* When two planets collide, a new Planet should be created and returned.
	* The mass of the new planet should be the total mass of the two planets
	* involved in the collision, and it should be named after both planets.
	*/
	public Planet collide ( Planet other ) {
		String newName = this.getName() + other.getName();
		int newMass = this.getMass() + other.getMass();
		return new Planet(newName, newMass); //FIXME
	}
}

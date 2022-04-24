import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConvertibleCarTests {
	private ConvertibleCar Car;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		IIgnition ignitionSystem = new ElectronicIgnition();

		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel() , "we build car");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.Car;
		
		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "we start convertible car");
	}

	@Test
	public void canLowerTop() {
	this.canLowerTop();
	}

	@Test
	public void canRaiseTop() {
		this.canRaiseTop();
	}
}

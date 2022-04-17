package AbstractFactoryOvoPascoa;

public class Nestle extends OvoDePascoaFactory {

	@Override
	OvoDePascoa CriarOvoDePascoa(char ovo) {

		if(ovo == '1') {
			return new Alpino();
		}else if(ovo == '2') {
			return new Classic();
		}
		return new KitKat();
	}

}

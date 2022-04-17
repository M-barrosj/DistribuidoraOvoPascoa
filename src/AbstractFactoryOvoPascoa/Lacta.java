package AbstractFactoryOvoPascoa;

public class Lacta extends OvoDePascoaFactory {

	@Override
	OvoDePascoa CriarOvoDePascoa(char ovo) {
		
		if(ovo == '1') {
			return new AoLeite();
		}else if(ovo == '2') {
			return new Oreo();
		}
		return new SonhoDeValsa();
	}

}

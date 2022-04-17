package AbstractFactoryOvoPascoa;

public class Garoto extends OvoDePascoaFactory{

	@Override
	OvoDePascoa CriarOvoDePascoa(char ovo) {
		
		if(ovo == '1') {
			return new Crocante();
		} else if (ovo == '2') {
			return new Talento();
		}
		return new BatonAoLeite();
	}

}

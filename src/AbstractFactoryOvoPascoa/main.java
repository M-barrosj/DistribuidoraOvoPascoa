package AbstractFactoryOvoPascoa;

import javax.swing.*;

public class main {

	public static void main(String[] args) {
        //System.out.println(new App().getGreeting());

        char Codigo_ovo;
        char Codigo_Fabrica;


        Codigo_Fabrica =  JOptionPane.showInputDialog("Entre com o código da Fábrica").charAt(0);
        Codigo_ovo = JOptionPane.showInputDialog("Entre com o código do ovo").charAt(0);



        if((Codigo_Fabrica == '1')&&(Codigo_ovo == '1')){
            OvoDePascoaFactory pascoa = new Nestle();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('1');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '1')&&(Codigo_ovo == '2')){
        	 OvoDePascoaFactory pascoa = new Nestle();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('2');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '1')&&(Codigo_ovo == '3')){
        	 OvoDePascoaFactory pascoa = new Nestle();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('3');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '2')&&(Codigo_ovo == '1')){
        	 OvoDePascoaFactory pascoa = new Garoto();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('1');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '2')&&(Codigo_ovo == '2')){
        	 OvoDePascoaFactory pascoa = new Garoto();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('2');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '2')&&(Codigo_ovo == '3')){
        	 OvoDePascoaFactory pascoa = new Garoto();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('3');
            ovo.exibirOvoDePascoa();
        }


          if((Codigo_Fabrica == '3')&&(Codigo_ovo == '1')){
        	  OvoDePascoaFactory pascoa = new Lacta();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('1');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '3')&&(Codigo_ovo == '2')){
        	 OvoDePascoaFactory pascoa = new Lacta();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('2');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '3')&&(Codigo_ovo == '3')){
        	 OvoDePascoaFactory pascoa = new Lacta();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('3');
            ovo.exibirOvoDePascoa();
        }



    }
}


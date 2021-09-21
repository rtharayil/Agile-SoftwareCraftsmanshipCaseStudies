public class PrinterDriver{

	private File file;
	private Printer printer;
    private Scanner scanner;


interface	public IInput(){

		Read()
		EndOfDATA()
	}
 
	interface	public IOutput(){

		Write()
		
	}
	
	public class Scanner implements IInput(){
		Read() {// }
		EndOfDATA() {}
		
	}
	public class File implements IInput(){
		Read()
		EndOfDATA()
		
	}
	public class Camera implements IInput(){
		Read()
		EndOfDATA()

	}
 
	public void print(){

       
    	
    	while(!input.EndOfDATA()()){
           
        	input.Read(c);
        	printer.Write();
    	
    }
	}
}


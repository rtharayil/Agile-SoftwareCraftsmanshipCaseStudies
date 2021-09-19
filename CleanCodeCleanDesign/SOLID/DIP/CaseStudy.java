public class PrinterDriver{

	private File file;
	private Printer printer;
    private Scanner scanner;
 
	public PrinterDriver(File file, Printer printer){
    	this.file = file;
    	this.printer = printer;
        this.scanner = null;
	}
 
    public PrinterDriver(Scanner scanner, Printer printer){
    	this.Scanner = scanner;
    	this.printer = printer;
        this.file = null;
	}
 
	public void print(){

        if(this.scanner == null){}
    	int c = file.ReadLine();
    	while(!file.IsEndingCharacter(c)){
           
        	printer.Write(c);
        	c = file.ReadLine();
    	}
    }
    else{
        int c = scanner.ReadData();
    	while(!scanner.IsEndOfData(c)){
           
        	printer.WriteLine(c);
        	c = scanner.ReadData();
    	}
    }
	}
}


public class PrinterDriver
{
    private File file;
    private Printer printer;

    public PrinterDriver(File file, Printer printer){
        file = file;
        printer = printer;
    }


    public void Print(){
        int page = file.readPage();
        while(!_file.IsEndOfFile(page)){
            printer.Print(page);
            page = file.readLine();
        }
    }
}

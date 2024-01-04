package Objects1;

public class Computer {
    private String computerBrand;
    private String processorBrand;
    private short storage;

    private int ram;

    public Computer(String computerBrand,
                    String processorBrand,
                    Short storage,
                    int ram)
    {
        this.computerBrand = computerBrand;
        this.processorBrand = processorBrand;
        this.storage = storage;
        this.ram = ram;
    }

    public void setComputerBrand(String newComputerBrand)
    {
        this.computerBrand = newComputerBrand;
    }

    public void setRam(int newAmountRam)
    {
        this.ram = newAmountRam;
    }

    public void setProcessorBrand(String newProcessorBrand)
    {
        this.processorBrand = newProcessorBrand;
    }

    public void setStorage(short newStorage)
    {
        this.storage = newStorage;
    }

    public int getRam()
    {
        return this.ram;
    }

    public String getComputerBrand()
    {
        return this.computerBrand;
    }
    public String getProcessorBrand()
    {
        return this.processorBrand;
    }
    public short getStorage()
    {
       return this.storage;
    }

    public void informationComputerPrint(){
        System.out.println("I'm a computer and I have "+ram+" GB of " +
                "ram and I have "+storage+" GB of storage "+" and I have an "+processorBrand+" processor and"+
                " I'm "+computerBrand+ " computer brand"
        );
    }
}

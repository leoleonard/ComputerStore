package shop;

public class Computer implements Comparable<Computer> {

    private String name;
    private int cpuMhz;
    private int ram;

    public Computer(String name, int cpuMhz, int ram) {
        this.name = name;
        this.cpuMhz = cpuMhz;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpuMhz() {
        return cpuMhz;
    }

    public void setCpuMhz(int cpuMhz) {
        this.cpuMhz = cpuMhz;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" + "name='" + name + '\'' + ", cpuMhz=" + cpuMhz + ", ram=" + ram + "}" + "\n";
    }


    @Override
    public int compareTo(Computer o) {
        if(this.cpuMhz > o.cpuMhz) {
            return 1;
        } else if (this.cpuMhz == o.cpuMhz) {

            if (this.ram > o.ram) {
                return 1;
            } else if (this.ram == o.ram) {
                return this.name.compareTo(o.name);
                } else {
                return -1;
            }

        } else {
            return -1;
        }
    }
}

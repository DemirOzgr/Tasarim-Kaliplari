public class ExportingProcess {
    private long processNo;

    public ExportingProcess(long processNo)  {
        this.processNo = processNo;
        System.out.println("Obje proses numarasıyla. " + processNo + " olusturuldu");
    }

    public long getProcessNo() {
        return processNo;
    }
}
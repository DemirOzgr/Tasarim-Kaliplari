public class ExportingTask implements Runnable {

    private ObjectPool<ExportingProcess> pool;
    private int threadNo;

    public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo){
        this.pool = pool;
        this.threadNo = threadNo;
    }

    public void run() {
        ExportingProcess exportingProcess = pool.borrowObject();
        System.out.println("Thread " + threadNo + ": Obje proses numarasiyla. "
                + exportingProcess.getProcessNo() + " alindi");

        pool.returnObject(exportingProcess);

        System.out.println("Thread " + threadNo +": Obje proses numarasiyla. "
                + exportingProcess.getProcessNo() + " döndürüldü");
    }

}
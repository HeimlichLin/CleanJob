package idv.heimlich.CleanJob.common.db;

public interface IDBSessionFactory {

	IDBSession getXdaoSession(String conn);

}

package idv.heimlich.CleanJob.domain.service.impl;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import idv.heimlich.CleanJob.common.db.sql.SqlWhere;
import idv.heimlich.CleanJob.domain.dto.impl.CleanDTO;

/**
 * 清除L4_LOG
 */
public class CleanL4LogServiceImpl extends AbstactCleanServiceImpl {

	private final static Logger LOG = LoggerFactory.getLogger(CleanL4LogServiceImpl.class);
	
	@Override
	void myClean(CleanDTO dto) throws Exception {
//		final SqlWhere sqlWhere = new SqlWhere();
//		sqlWhere.add(new DoSqlPredicate("to_char(L4_time, 'YYYYMMDD')", SqlOp.LE, this.targetDeleteTime()));
//		sqlWhere.add(new DoSqlPredicate("rownum", SqlOp.LE, this.getDeleteAmount()));
//		this.clean(sqlWhere);
	}
	
	private void clean(final SqlWhere sqlWhere) throws Exception {
//		final DoXdaoSession doXdaoSession = XdaoSessionManager.getDoXdaoSession();
//		int deleteCnt = 0;
//		do {
//			deleteCnt = doXdaoSession.delete(L4LogDAO.TABLENAME, sqlWhere);
//			doXdaoSession.commit();
//			LOG.info("delete L4_LOG data  YYYYMMDD<={}  delete num:{}", this.targetDeleteTime(), deleteCnt);
//		} while (deleteCnt != 0 );
	}
	
	private String targetDeleteTime () {
//		final Calendar calendar = Calendar.getInstance();		
//		calendar.add(Calendar.MONTH, this.getMonthOfAgo());
//		calendar.add(Calendar.DAY_OF_MONTH, -1);
//		return YYYYMMDDUtils.getText(calendar.getTime());
		return null;
	}	
	
	public int getMonthOfAgo() {
//		final int month = Integer.parseInt(ApContext.getContext().getSetting(
//				CleanL4LogServiceImpl.class.getName() + ".monthOfAgo"));
//		return month;
		return 0;
	}
	
	public int getDeleteAmount() {
//		final int amount = Integer.parseInt(ApContext.getContext().getSetting(
//				CleanL4LogServiceImpl.class.getName() + ".deleteAmount"));
//		return amount;
		return 0;
	}

}

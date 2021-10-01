package idv.heimlich.CleanJob.domain.code;

import idv.heimlich.CleanJob.domain.service.CleanService;
import idv.heimlich.CleanJob.domain.service.impl.CleanCheckCodeLogServiceImpl;
import idv.heimlich.CleanJob.domain.service.impl.CleanL4LogServiceImpl;
import idv.heimlich.CleanJob.domain.service.impl.CleanUserActionServiceImpl;

/**
 * 清檔Jobs
 */
public enum CleanJobs {

	C1(new CleanUserActionServiceImpl()), // 清除使用者紀錄
	C2(new CleanCheckCodeLogServiceImpl()), // 清除Backend執行log 
	C3(new CleanL4LogServiceImpl()), // L4
	;//

	final CleanService cleanService;

	private CleanJobs(CleanService cleanService) {
		this.cleanService = cleanService;
	}

	public CleanService getCleanService() {
		return cleanService;
	}
	
}

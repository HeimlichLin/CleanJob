package idv.heimlich.CleanJob.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import idv.heimlich.CleanJob.domain.code.CleanJobs;
import idv.heimlich.CleanJob.domain.dto.impl.CleanDTO;
import idv.heimlich.CleanJob.domain.service.CleanService;

/**
 *  清檔服務實作
 */
public class CleanServiceImpl implements CleanService {

	private static CleanService INSTANCT = new CleanServiceImpl();

	private final List<CleanService> cleanLogServices = new ArrayList<CleanService>();
	
	private CleanServiceImpl() {
		for(CleanJobs Job:CleanJobs.values()){
			this.cleanLogServices.add(Job.getCleanService());
		}
	}
	
	public static CleanService getInstanct() {
		return INSTANCT;
	}

	@Override
	public void clean(CleanDTO dto) {
		for (final CleanService cleanLogService : this.cleanLogServices) {
			cleanLogService.clean(dto);			
		}
	}

}

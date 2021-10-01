package idv.heimlich.CleanJob.domain.controller.job.clean;

import idv.heimlich.CleanJob.domain.dto.impl.CleanDTO;
import idv.heimlich.CleanJob.domain.service.CleanService;
import idv.heimlich.CleanJob.domain.service.impl.CleanServiceImpl;

/**
 * 執行清檔案job
 */
public class CleanJob {
	
	private CleanDTO dto = new CleanDTO();
	private final CleanService service = CleanServiceImpl.getInstanct();

	/**
	 * 執行清檔
	 */
	public void doClean() {
		this.service.clean(this.dto);
	}
	
	public CleanDTO getDto() {
		return this.dto;
	}

	public void setDto(CleanDTO dto) {
		this.dto = dto;
	}
	
}

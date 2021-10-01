package idv.heimlich.CleanJob.domain.service;

import idv.heimlich.CleanJob.domain.dto.impl.CleanDTO;

/**
 * 清檔服務
 */
public interface CleanService {

	/**
	 * 清檔
	 * 
	 * @param dto
	 */
	void clean(CleanDTO dto);
	
}

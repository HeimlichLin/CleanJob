package idv.heimlich.CleanJob.domain.controller;

import idv.heimlich.CleanJob.domain.controller.job.clean.CleanJob;

public class CleanJobController {
	
	public static void main(String[] args) {
		new CleanJob().doClean();
	}

}

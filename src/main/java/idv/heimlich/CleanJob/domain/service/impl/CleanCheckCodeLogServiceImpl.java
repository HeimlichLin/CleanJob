package idv.heimlich.CleanJob.domain.service.impl;

import java.io.File;
import java.io.FileFilter;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import idv.heimlich.CleanJob.domain.dto.impl.CleanDTO;

public class CleanCheckCodeLogServiceImpl extends AbstactCleanServiceImpl {

	private final static Logger LOG = LoggerFactory.getLogger(CleanCheckCodeLogServiceImpl.class);
	
//	private String baseFolder = ApContext.getContext().getSetting(this.getClass().getName() + ".baseFolder");
//	private String overDays = ApContext.getContext().getSetting(this.getClass().getName() + ".overDays");

	private String baseFolder;
	private String overDays;
	
	@Override
	void myClean(CleanDTO dto) throws Exception {
		final File folder = new File(baseFolder);

		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, Integer.parseInt(overDays));

		final File[] fs = folder.listFiles(new FileFilter() {

			@Override
			public boolean accept(File dir) {
				if (dir.isFile()) {
					if (dir.getName().startsWith("checkCode")) {
						if (dir.lastModified() <= calendar.getTimeInMillis()) {
							return true;
						}
					}

				}
				return false;
			}
		});
		for (File f : fs) {
			LOG.info("delet file :{}", f.getAbsoluteFile());
			if (!f.delete()) {
				LOG.warn("delet file :{} error", f.getAbsoluteFile());
			}
		}
	}

}

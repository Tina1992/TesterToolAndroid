package example.com.proyecto.Metrics;

import example.com.proyecto.Services.AbsService;
import example.com.proyecto.Services.ImageProc;

public abstract class AbsMetric {
	
	public abstract Object getDato(AbsService service, ImageProc image);
	
	public abstract String getName(); 
	
	public abstract String getMedida();

}

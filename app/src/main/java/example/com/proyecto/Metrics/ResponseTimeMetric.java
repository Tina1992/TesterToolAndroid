package example.com.proyecto.Metrics;

import example.com.proyecto.Services.AbsService;
import example.com.proyecto.Services.ImageProc;

public class ResponseTimeMetric extends AbsMetric {

	@Override
	public Object getDato(AbsService service, ImageProc image) {
		return service.getResponseTime();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Response Time";
	}

	@Override
	public String getMedida() {
		// TODO Auto-generated method stub
		return "second";
	}

}

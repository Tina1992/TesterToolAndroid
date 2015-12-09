package example.com.proyecto.Metrics;


import example.com.proyecto.Services.AbsService;
import example.com.proyecto.Services.ImageProc;

public class ImageFormatMetric extends AbsMetric {

	@Override
	public Object getDato(AbsService service, ImageProc image){
		// TODO Auto-generated method stub
		String name=image.getFile_path();
		return name.substring(name.length()-3);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Image Format";
	}

	@Override
	public String getMedida() {
		// TODO Auto-generated method stub
		return null;
	}

}

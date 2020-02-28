package vectorCalculator;

public class vectorMath extends vectorMenu{
	
		double magnitude(double Ihat, double Jhat) {
			return Math.sqrt((Math.pow(Ihat, 2)+ Math.pow(Jhat, 2)));
			
		}
		double AtimesB(double Aihat, double Ajhat, double Bihat, double Bjhat) {
			double Tihat = Math.abs(Aihat*Bihat);
			double Tjhat = Math.abs(Ajhat*Bjhat);
			return Tihat - Tjhat;
		}
		double AmagXBMag(double Amag, double Bmag){
			return Amag*Bmag;
		}
		double AngleBetween(double AB, double Tmag) {
			return Math.toDegrees(Math.acos(AB/Tmag));
		}
}

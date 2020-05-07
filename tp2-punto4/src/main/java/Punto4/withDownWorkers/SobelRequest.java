package Punto4.withDownWorkers;
import java.io.Serializable;

@SuppressWarnings("serial")
public class SobelRequest implements Serializable{

		private int idWorker;

		private byte[] inParcialImg;		
		private byte[] outImg;
		private StateSobelRequest state;
		
		//el request va a tener un id del worker que se encarga un array de bytes que tiene que procesar, y un estado pendiente
		public SobelRequest (int idWorker, byte[] inParcialImg) {
			this.idWorker = idWorker;
			this.inParcialImg = inParcialImg;
			this.state = StateSobelRequest.PENDENT;
		}

		public int getIdWorker() {return this.idWorker;}
		public byte[] getInParcialImg() {return this.inParcialImg;}
		public byte[] getOutImg() {return this.outImg;}
		public StateSobelRequest getState() {return state;}
		
		public void setState(StateSobelRequest state) {this.state = state;}
		public void setOutImg(byte[] outImg) {this.outImg = outImg;}
		public void setIdWorker(int idWorker) {this.idWorker = idWorker;}
}

package builder;

public class Computador {
	private final String processador;
	private final String ram;
	private final String placaMae;
	
	private final String placaDeVideo;
	private final boolean bluetooth;
	
	// O construtor da classe principal deve ser privado.
    // Só o Builder pode instanciar o Computador.
	private Computador(ComputadorBuilder computadorBuilder) {
		this.processador = computadorBuilder.processador;
		this.ram = computadorBuilder.ram;
		this.placaMae = computadorBuilder.placaMae;
		this.placaDeVideo = computadorBuilder.placaDeVideo;
		this.bluetooth = computadorBuilder.bluetooth;
	}
	
	public String getProcessador() { return processador; }
    public String getRam() { return ram; }
    public String getPlacaDeVideo() { return placaDeVideo; }
    public boolean isTemBluetooth() { return bluetooth; }

    @Override
    public String toString() {
        return "Computador [Processador=" + processador + ", RAM=" + ram + 
               ", GPU=" + placaDeVideo + ", Bluetooth=" + bluetooth + "]";
    }
	
	public static class ComputadorBuilder {
		private String processador;
		private String ram;
		private String placaMae;
		
		private String placaDeVideo;
		private boolean bluetooth;
		
		public ComputadorBuilder(String processador, String ram, String placaMae) {
			this.processador = processador;
			this.ram = ram;
			this.placaMae = placaMae;
		}
		
		public ComputadorBuilder comPlacaDeVideo(String placaDeVideo) {
			this.placaDeVideo = placaDeVideo;
			return this;
		}
		
		public ComputadorBuilder comBluetooth(boolean bluetooth) {
			this.bluetooth = bluetooth;
			return this;
		}
		
		// O método final que constrói e retorna o objeto
		public Computador builder() {
			return new Computador(this);
		}
	}
}

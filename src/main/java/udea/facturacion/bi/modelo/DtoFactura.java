package udea.facturacion.bi.modelo;

public class DtoFactura {

    private Integer numeroFactura;
    private Integer valorTotal;
    private Integer idCliente;


    public DtoFactura(Integer numeroFactura, Integer valorTotal, Integer idCliente) {
        this.numeroFactura = numeroFactura;
        this.valorTotal = valorTotal;
        this.idCliente = idCliente;
    }

    public Integer getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "DtoFactura{" +
                "numeroFactura=" + numeroFactura +
                ", valorTotal=" + valorTotal +
                ", idCliente=" + idCliente +
                '}';
    }
}

package Singleton;

import Facade.Cliente;
import Facade.ItemPedido;
import Facade.Pedido;
import java.util.ArrayList;
import java.util.List;

public final class PedidoFactoryConcrete implements FactoryClone
{

    private List<Pedido> lstPedidos;
    private final static PedidoFactoryConcrete FactoryPedido = new PedidoFactoryConcrete();

    private PedidoFactoryConcrete()
    {
        CarregaPedidos();
    }

    public static synchronized PedidoFactoryConcrete getFactory()
    {
        return FactoryPedido;
    }

    @Override
    public Object getClone(Object obj)
    {
        Pedido objPed = (Pedido) obj;
        Pedido clonePedido = new Pedido();

        // Clona Propriedades do Pedido
        clonePedido.dataHoraPedido = new java.util.Date();
        clonePedido.sttPedido = Pedido.status.AguardandoProducao;
        clonePedido.pagamentoPedido = null;

        // Clona ItensPedido
        clonePedido.ItensPedido = new ArrayList<>();
        for (ItemPedido objItemPed : objPed.ItensPedido)
        {
            ItemPedido cloneItemPed = new ItemPedido();
            cloneItemPed.ID = objItemPed.ID;
            cloneItemPed.objProduto = objItemPed.objProduto;
            clonePedido.ItensPedido.add(cloneItemPed);
        }
        return clonePedido;
    }

    private void CarregaPedidos()
    {
        // Carrega Pedidos do banco de dados
        FactoryPedido.lstPedidos = new ArrayList<>();
    }

    // Verifica se um determinado pedido existe no sistema
    public boolean existePedido(int numPed)
    {
        for (Pedido ped : FactoryPedido.lstPedidos)
        {
            if (ped.numeroPedido == numPed)
            {
                return true;
            }
        }
        return false;
    }

    public Pedido criaPedido()
    {
        return new Pedido();
    }
    
    public Pedido getInstance(int NumeroPedido)
    {
        Pedido objPedido = null;

        if (existePedido(NumeroPedido))
        {
            for (Pedido Ped : FactoryPedido.lstPedidos)
            {
                if (Ped.numeroPedido == NumeroPedido)
                {
                    objPedido = Ped;
                }
            }
        }
        return objPedido;
    }

    public Pedido[] getInstance(Cliente objCliente)
    {
        List<Pedido> lstPedido = new ArrayList<>();

        for (Pedido Ped : FactoryPedido.lstPedidos)
        {
            if (Ped.Cliente == objCliente.ID)
            {
                lstPedido.add(Ped);
            }
        }

        return lstPedido.toArray(new Pedido[lstPedido.size()]);
    }
}

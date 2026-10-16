package com.edu.ec.negocio;

public class PedidoService {

    public void realizar(Pedido pedido) {

        System.out.println("Realizando pedido...");

        IO.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());

        System.out.println("Pedido realizado con exito.");

        MailService mailService = new MailService(); // creamos manualmente el objeto de la calse MailService
        String asunto = "Confirmacion de pedido";
        String correo = "Estimado " + pedido.getCliente() + ", su pedido de " +
                pedido.getProducto() + " por un total de $" + pedido.getTotal() +
                " ha sido realizado con exito.";
        mailService.enviar(pedido.getCorreo(), asunto, correo);
        mailService = null; // elegible para el GC

    }

}

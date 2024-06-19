package de.tum.in.ase.eist.ecommerce;


public class ECommerceFacade {
    private final OrderController orderController;
    private final AdvertisementController advertisementController;
    private final ShippingController shippingController;
    public ECommerceFacade(){
        this.orderController = new OrderController();
        this.advertisementController=new AdvertisementController();
        this.shippingController=new ShippingController();
    }
    public void processOrder(Order order) {
        this.orderController.processOrder(order);
    }

    public void processOrder(Order order, String phoneNumber) {
        this.orderController.processOrder(order,phoneNumber);
    }

    public Order retrieveLatestOrder(int id) {
       return this.orderController.retrieveLatestOrder(id);
    }
    public void playAdvertisement(int ageRestriction) {
        this.advertisementController.playAdvertisement(ageRestriction);
    }
    public void shipOrder(Order order,String address) {
        order.setShipping(this.shippingController.createShipping(address));
        this.shippingController.shipOrder(order);
    }
}

package ExoHotel;

public class Hotel {


    private List<Client> clients;
    private List<Chambre> chambres;


    private List<Reservation> reservations;

    @Override
    public String toString() {
        return "Hotel{" +
                "clients=" + clients +
                ", chambres=" + chambres +
                ", reservations=" + reservations +
                '}';
    }
}



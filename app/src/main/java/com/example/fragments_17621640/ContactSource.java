package com.example.fragments_17621640;

import java.util.ArrayList;

public class ContactSource {

    ArrayList<Contacts> Contacts;

    public ContactSource() {
        Contacts = new ArrayList<Contacts>() ;



    }

    public ArrayList<Contacts> getContact() {
        return Contacts;
    }

    public static ArrayList<Contacts> generateContactList() {
        ArrayList<Contacts> contacts = new ArrayList<Contacts>();

        contacts.add(new Contacts("https://images.pexels.com/photos/1149831/pexels-photo-1149831.jpeg?cs=srgb&dl=audi-automobile-car-lights-cars-1149831.jpg&fm=jpg"," Ivan","bul.Basanovich"));
        contacts.add(new Contacts("https://assets.traveltriangle.com/blog/wp-content/uploads/2018/11/Elphinstone-Reef.jpg","Petur, ","simeon veliki"));
        contacts.add(new Contacts("https://upload.wikimedia.org/wikipedia/commons/7/71/EVO_Car_Share_Toyota_Prius_c_hyrbrid_car_in_downtown_Vancouver.jpg","Petur, ","simeon veliki"));
        contacts.add(new Contacts("https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?cs=srgb&dl=blue-bmw-sedan-near-green-lawn-grass-170811.jpg&fm=jpg"," Ivan","bul.Basanovich"));
        contacts.add(new Contacts("https://images.pexels.com/photos/305070/pexels-photo-305070.jpeg?cs=srgb&dl=auto-automobile-automotive-car-305070.jpg&fm=jpg","Petur, ","simeon veliki"));
        contacts.add(new Contacts("https://images.pexels.com/photos/1545743/pexels-photo-1545743.jpeg?cs=srgb&dl=red-and-black-audi-r8-coupe-parked-near-gray-concrete-1545743.jpg&fm=jpg","Petur, ","simeon veliki"));
        contacts.add(new Contacts("https://images.pexels.com/photos/116675/pexels-photo-116675.jpeg?cs=srgb&dl=car-vehicle-automobile-range-rover-116675.jpg&fm=jpg"," Ivan","bul.Basanovich"));
        contacts.add(new Contacts("https://images.pexels.com/photos/112460/pexels-photo-112460.jpeg?cs=srgb&dl=car-luxury-mercedes-design-112460.jpg&fm=jpg","Petur, ","simeon veliki"));
        contacts.add(new Contacts("https://images.pexels.com/photos/799443/pexels-photo-799443.jpeg?cs=srgb&dl=forced-perspective-photography-of-cars-running-on-road-below-799443.jpg&fm=jpg","Petur, ","simeon veliki"));
        contacts.add(new Contacts("https://images.pexels.com/photos/804130/pexels-photo-804130.jpeg?cs=srgb&dl=man-in-white-dress-shirt-holding-steering-wheel-804130.jpg&fm=jpg"," Ivan","bul.Basanovich"));
        contacts.add(new Contacts("https://assets.traveltriangle.com/blog/wp-content/uploads/2018/11/Elphinstone-Reef.jpg","Petur, ","simeon veliki"));
        contacts.add(new Contacts("https://upload.wikimedia.org/wikipedia/commons/7/71/EVO_Car_Share_Toyota_Prius_c_hyrbrid_car_in_downtown_Vancouver.jpg","Petur, ","simeon veliki"));
        contacts.add(new Contacts("https://www.pablopicasso.org/images/paintings/the-weeping-woman.jpg"," Ivan","bul.Basanovich"));
        contacts.add(new Contacts("https://assets.traveltriangle.com/blog/wp-content/uploads/2018/11/Elphinstone-Reef.jpg","Petur, ","simeon veliki"));
        contacts.add(new Contacts("https://upload.wikimedia.org/wikipedia/commons/7/71/EVO_Car_Share_Toyota_Prius_c_hyrbrid_car_in_downtown_Vancouver.jpg","Petur, ","simeon veliki"));
        contacts.add(new Contacts("https://www.pablopicasso.org/images/paintings/the-weeping-woman.jpg"," Ivan","bul.Basanovich"));
        contacts.add(new Contacts("https://assets.traveltriangle.com/blog/wp-content/uploads/2018/11/Elphinstone-Reef.jpg","Petur, ","simeon veliki"));
        contacts.add(new Contacts("https://upload.wikimedia.org/wikipedia/commons/7/71/EVO_Car_Share_Toyota_Prius_c_hyrbrid_car_in_downtown_Vancouver.jpg","Petur, ","simeon veliki"));





        return contacts;
    }
}

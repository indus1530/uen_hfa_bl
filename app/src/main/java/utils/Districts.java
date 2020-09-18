package utils;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Umeed-e-Nau on 12/21/2016.
 */
public class Districts {

    private static Multimap<String, String> data = HashMultimap.create();

    public static List<String> get(String province) {

        data.put("Balochistan", "Jafferabad");
        data.put("Balochistan", "Lasbella");
        data.put("Balochistan", "Nasirabad");
        data.put("Punjab", "Muzaffargarh");
        data.put("Punjab", "Rahim Yar Khan");
        data.put("Sindh", "Badin");
        data.put("Sindh", "Qambar Shahdadkot");
        data.put("Sindh", "Sanghar");
        data.put("Sindh", "Tando Muhammad Khan");


        List<String> list = new ArrayList<>();

        list.add("Select");
        Collection<String> coll = data.get(province);
        for (String item : coll) {
            list.add(item);
        }


        return list;
    }

}

package com.example.oikeecardview;

import java.util.Arrays;
import java.util.List;

public class EntryProvider {

    public static List<Entry> populateEntries() {
        return Arrays.asList(

            new Entry("Kauppalista1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a dignissim turpis. Integer ullamcorper odio augue, dapibus pretium sapien bibendum ac. Cras tortor metus, lobortis nec ornare vitae, varius nec justo. Donec vel urna ac eros aliquam suscipit. Fusce sem erat, rhoncus vitae sem quis, ultrices placerat dolor. Fusce sed quam non mi dictum elementum. Cras vestibulum vestibulum lorem, eget hendrerit lacus volutpat mattis. Suspendisse egestas ullamcorper felis, quis iaculis leo ultrices eget. Aliquam eu arcu nisl.\n" +
                    "\n" +
                    "Proin tempor turpis sed lectus ullamcorper tincidunt. Nam tincidunt nibh vitae nisi porta, blandit maximus arcu porttitor. Sed eleifend suscipit dapibus. Vestibulum luctus lectus eget mauris tincidunt malesuada. Etiam eget ultrices orci, quis venenatis nisi. Quisque rhoncus consectetur lectus porttitor imperdiet. Proin ut interdum dui, non convallis elit. Sed vel justo in mi porttitor sagittis. Integer pellentesque dolor tellus, in vehicula enim volutpat ut. Nam a luctus metus.\n" +
                    "\n"),
            new Entry("Kauppalista2", "kinkkua, lihaa, "),
            new Entry("Kauppalista3", "voita, xd"),
            new Entry("Kauppalista4", "spasdasdasdasd"),
            new Entry("Homma toimii", "As they rounded a bend in the path that ran beside the river, Lara recognized the silhouette of a fig tree atop a nearby hill. The weather was hot and the days were long. The fig tree was in full leaf, but not yet bearing fruit.\n" +
                    "Soon Lara spotted other landmarks—an outcropping of limestone beside the path that had a silhouette like a man’s face, a marshy spot beside the river where the waterfowl were easily startled, a tall tree that looked like a man with his arms upraised. They were drawing near to the place where there was an island in the river. The island was a good spot to make camp. They would sleep on the island tonight.\n" +
                    "Lara had been back and forth along the river path many times in her short life. Her people had not created the path—it had always been there, like the river—but their deerskin-shod feet and the wooden wheels of their handcarts kept the path well worn. Lara’s people were salt traders, and their livelihood took them on a continual journey.")


        );
    }
}

package com.example.jkt.wall2wall0;

import android.util.Log;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JDK on 4/21/2015.
 */
public class SpawnTimer {
    private final ArrayList<String> enemyArray = new ArrayList();
    public final ArrayList<SpawnEvent> spawnEventArray = new ArrayList();


    public void createEnemyArray() {

        enemyArray.add("(00),(00),(01,160x),(00),(00),(00),(00),(00),002s");
        enemyArray.add("(00),(00),(00),(00),(00),(01,280x),(00),(00),004s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),006s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),008s");
        enemyArray.add("(00),(01,120x),(00),(00),(00),(00),(00),(00),010s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),012s");
        enemyArray.add("(00),(00),(00),(00),(00),(01,280x),(00),(00),014s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),016s");
        enemyArray.add("(00),(01,120x),(00),(03,200x),(00),(00),(00),(00),018s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),020s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(03,360x),022s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),024s");
        enemyArray.add("(00),(01,120x),(00),(00),(00),(00),(00),(00),026s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(03,320x),(00),028s");
        enemyArray.add("(00),(00),(00),(00),(00),(01,280x),(00),(00),030s");
        enemyArray.add("(00),(00),(03,160x),(00),(00),(00),(00),(00),032s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),034s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),036s");
        enemyArray.add("(00),(00),(00),(00),(00),(04,280x),(00),(00),038s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),040s");
        enemyArray.add("(00),(00),(03,160x),(00),(00),(00),(00),(00),042s");
        enemyArray.add("(00),(00),(00),(00),(01,240x),(00),(00),(00),044s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),046s");
        enemyArray.add("(00),(00),(00),(01,200x),(00),(00),(00),(00),048s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),050s");
        enemyArray.add("(00),(03,120x),(00),(00),(00),(00),(00),(00),052s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),054s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(04,320x),(00),056s");
        enemyArray.add("(03,085x),(00),(00),(00),(00),(00),(00),(00),058s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),060s");
        enemyArray.add("(00),(00),(04,160x),(00),(00),(03,280x),(00),(00),062s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(01,320x),(00),064s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),066s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),068s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(05,320x),(00),070s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),072s");
        enemyArray.add("(01,085x),(00),(00),(00),(00),(00),(00),(00),074s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(05,360x),076s");
        enemyArray.add("(00),(03,120x),(00),(00),(00),(03,280x),(00),(00),078s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),080s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),082s");
        enemyArray.add("(00),(00),(04,160x),(00),(04,240x),(00),(00),(00),084s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),086s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),088s");
        enemyArray.add("(05,085x),(00),(00),(00),(00),(00),(00),(05,360x),090s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),092s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),094s");
        enemyArray.add("(00),(01,120x),(00),(00),(00),(00),(01,320x),(00),096s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),098s");
        enemyArray.add("(00),(00),(00),(04,200x),(00),(00),(00),(00),0100s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0102s");
        enemyArray.add("(00),(00),(00),(00),(04,240x),(00),(00),(00),0104s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0106s");
        enemyArray.add("(00),(04,120x),(00),(00),(00),(00),(00),(00),0108s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0110s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(05,360x),0112s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0114s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0116s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0118s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0120s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0122s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0124s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0126s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0128s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0130s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0132s");
        enemyArray.add("(00),(00),(06,160x),(00),(00),(00),(00),(00),0134s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0136s");
        enemyArray.add("(00),(00),(00),(00),(00),(06,280x),(00),(00),0138s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0140s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(06,360x),0142s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0144s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0146s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(07,360x),0148s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0150s");
        enemyArray.add("(00),(00),(07,160x),(00),(06,240x),(00),(00),(00),0152s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0154s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0156s");
        enemyArray.add("(00),(00),(06,160x),(00),(07,240x),(00),(00),(00),0158s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0160s");
        enemyArray.add("(00),(00),(00),(08,200x),(00),(00),(00),(00),0162s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0164s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0166s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(08,320x),(00),0168s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0170s");
        enemyArray.add("(08,085x),(00),(00),(00),(00),(00),(00),(00),0172s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0174s");
        enemyArray.add("(00),(00),(06,160x),(00),(00),(00),(00),(00),0176s");
        enemyArray.add("(00),(00),(00),(00),(07,240x),(00),(00),(00),0178s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0180s");
        enemyArray.add("(00),(08,120x),(00),(00),(00),(00),(00),(00),0182s");
        enemyArray.add("(00),(00),(00),(07,200x),(00),(00),(00),(00),0184s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0186s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0188s");
        enemyArray.add("(00),(00),(00),(00),(00),(09,280x),(00),(00),0190s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0192s");
        enemyArray.add("(00),(06,120x),(00),(00),(00),(00),(00),(00),0194s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0196s");
        enemyArray.add("(00),(00),(00),(00),(09,240x),(00),(00),(00),0198s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0200s");
        enemyArray.add("(00),(00),(07,160x),(07,200x),(07,240x),(00),(00),(00),0202s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0204s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0206s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0208s");
        enemyArray.add("(00),(00),(00),(08,200x),(07,240x),(08,280x),(00),(00),0210s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0212s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0214s");
        enemyArray.add("(09,085x),(00),(00),(00),(00),(00),(00),(00),0216s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(08,360x),0218s");
        enemyArray.add("(09,085x),(00),(00),(00),(00),(00),(00),(00),0220s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0222s");
        enemyArray.add("(00),(00),(06,160x),(00),(00),(00),(00),(00),0224s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0226s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0228s");
        enemyArray.add("(00),(00),(00),(00),(00),(06,280x),(00),(00),0230s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0232s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(07,320x),(00),0234s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0236s");
        enemyArray.add("(00),(08,120x),(00),(00),(00),(00),(00),(00),0238s");
        enemyArray.add("(00),(00),(00),(00),(00),(09,280x),(00),(00),0240s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0242s");
        enemyArray.add("(00),(00),(09,160x),(00),(00),(00),(00),(00),0244s");
        enemyArray.add("(00),(00),(00),(00),(08,240x),(00),(00),(00),0246s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(09,320x),(00),0248s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0250s");
        enemyArray.add("(06,085x),(00),(00),(00),(00),(00),(00),(00),0252s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0254s");
        enemyArray.add("(00),(00),(10,160x),(00),(00),(00),(00),(00),0256s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0258s");
        enemyArray.add("(00),(00),(00),(00),(00),(10,280x),(00),(00),0260s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0262s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0264s");
        enemyArray.add("(00),(00),(00),(10,200x),(00),(00),(00),(00),0266s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0268s");
        enemyArray.add("(00),(06,120x),(00),(00),(00),(00),(00),(00),0270s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(06,320x),(00),0272s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0274s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0276s");
        enemyArray.add("(00),(00),(00),(07,200x),(00),(00),(00),(00),0278s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0280s");
        enemyArray.add("(00),(00),(00),(00),(00),(10,280x),(00),(00),0282s");
        enemyArray.add("(00),(08,120x),(07,160x),(00),(00),(00),(00),(00),0284s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0286s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0288s");
        enemyArray.add("(00),(00),(00),(09,200x),(00),(00),(00),(00),0290s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0292s");
        enemyArray.add("(00),(00),(00),(00),(00),(09,280x),(00),(00),0294s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0296s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(09,360x),0298s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0300s");
        enemyArray.add("(00),(00),(06,160x),(00),(00),(00),(00),(00),0302s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0304s");
        enemyArray.add("(00),(00),(00),(00),(00),(07,280x),(00),(00),0306s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0308s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(08,320x),(00),0310s");
        enemyArray.add("(00),(10,120x),(00),(00),(00),(00),(00),(00),0312s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0314s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0316s");
        enemyArray.add("(00),(00),(00),(00),(07,240x),(00),(00),(00),0318s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0320s");
        enemyArray.add("(00),(00),(10,160x),(00),(00),(00),(00),(00),0322s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(06,320x),(00),0324s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0326s");
        enemyArray.add("(00),(00),(00),(08,200x),(00),(00),(00),(00),0328s");
        enemyArray.add("(00),(00),(00),(00),(00),(07,280x),(00),(00),0330s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0332s");
        enemyArray.add("(09,085x),(00),(00),(00),(00),(00),(00),(00),0334s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0336s");
        enemyArray.add("(00),(00),(08,160x),(00),(00),(00),(00),(00),0338s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(09,360x),0340s");
        enemyArray.add("(00),(00),(00),(00),(09,240x),(00),(00),(00),0342s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0344s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(08,360x),0346s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0348s");
        enemyArray.add("(07,085x),(00),(00),(00),(00),(00),(00),(00),0350s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0352s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(07,360x),0354s");
        enemyArray.add("(00),(00),(00),(00),(06,240x),(00),(00),(00),0356s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0358s");
        enemyArray.add("(07,085x),(00),(00),(00),(00),(00),(00),(00),0360s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0362s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0364s");
        enemyArray.add("(06,085x),(00),(00),(00),(00),(00),(00),(00),0366s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0368s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(06,360x),0370s");
        enemyArray.add("(00),(10,120x),(00),(00),(00),(00),(00),(00),0372s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(10,320x),(00),0374s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0376s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0378s");
        enemyArray.add("(00),(00),(00),(10,200x),(00),(00),(00),(00),0380s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0382s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(07,320x),(00),0384s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0386s");
        enemyArray.add("(00),(00),(00),(08,200x),(00),(00),(00),(00),0388s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0390s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0392s");
        enemyArray.add("(09,085x),(00),(00),(00),(00),(00),(00),(09,360x),0394s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0396s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0398s");
        enemyArray.add("(00),(00),(00),(00),(00),(00),(00),(00),0400s");

    }


    public ArrayList<SpawnEvent> parseEnemyArray() {
        int enemy_type;
        int enemy_location;
        int time_value;
        int s_location;

        for (int i=0; i < enemyArray.size(); i++) {
            int starting_index = 0;
            int possible_enemies = enemyArray.get(i).length() -
                    enemyArray.get(i).replace("(", "").length();
            ArrayList<String> time_enemy_line_info = new ArrayList();
            int end_index = enemyArray.get(i).length();
            //Log.i("SpawnTimer1", String.valueOf(possible_enemies));

            s_location = enemyArray.get(i).indexOf("s");
            time_value = Integer.parseInt
                    (enemyArray.get(i).substring(s_location-3, s_location));

            for (int x=0; x < possible_enemies; x++) {
                int parenth_start = enemyArray.get(i).substring
                        (starting_index, end_index).indexOf("(")+starting_index;
                int parenth_end = enemyArray.get(i).substring
                        (starting_index, end_index).indexOf(")")+starting_index;
                String current_enemy_info = enemyArray.get(i).substring
                        (parenth_start + 1, parenth_end);

                time_enemy_line_info.add(current_enemy_info);
                starting_index = parenth_end + 1;

                //Log.i("SpawnTimer2", String.valueOf(parenth_start));
                //Log.i(String.valueOf(starting_index), current_enemy_info);
            }

            for (int y=0; y < time_enemy_line_info.size(); y++) {

                if (time_enemy_line_info.get(y).length()>3) {

                    //Log.i("SpawnTimer3", "Starting addition");
                    enemy_type = Integer.parseInt
                            (time_enemy_line_info.get(y).substring(0,2));
                    enemy_location = Integer.parseInt
                            (time_enemy_line_info.get(y).substring(3,6));

                    //Log.i("EnemyATTR", (String.valueOf(enemy_type)+String.valueOf(enemy_location)+String.valueOf(time_value)));

                    SpawnEvent enemy_to_create =
                            new SpawnEvent(enemy_type, enemy_location, time_value);

                    spawnEventArray.add(enemy_to_create);
                    //Log.i("SpawnTimer4", "Enemy ADDED"+String.valueOf(time_value));
                }
            }
        }
        Log.i("SpawnTimer", "Parsing complete, returning...");
        return spawnEventArray;
    }

            //       enemyArray.add("00),(03,120x),(00),(03,200x),(00),(03,280x),(00),(00),078s");


/*    public static void save(FileIO files) {
        BufferedWriter out = null;
        try {

            // Writes a file called .enemydata to the SD Card
            out = new BufferedWriter(new OutputStreamWriter(
                    files.writeFile(".enemydata");));



            // Line by line ("\n" creates a new line), write the value of each variable to the file.

            out.write(Boolean.toString(soundEnabled));
            out.write("\n");;

            // Uses a for loop to save 5 numbers to the save file. INCORRECT NOTE
            out.write(Integer.toString(highScore));
            out.write("\n");;

            // This section handles errors in file management!

        } catch (IOException e) {
        } finally {
            try {
                if (out != null)
                    out.close();
            } catch (IOException e) {
            }
        }
    }*/

}

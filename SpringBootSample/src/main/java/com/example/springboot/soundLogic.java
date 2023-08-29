package com.example.springboot;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class soundLogic {
    public static String sound(String code){


        System.out.println("===SUPPORTED===");
        AudioFileFormat.Type[] typeArray = AudioSystem.getAudioFileTypes();
        for(AudioFileFormat.Type type : typeArray){
            System.out.println(type.toString());
        }

        AudioInputStream ais = null;

        try{
            ais = AudioSystem.getAudioInputStream(new File("C:\\Windows\\Media\\" + code));

            AudioFormat af = ais.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, af);
            Clip clip = (Clip)AudioSystem.getLine(info);
            clip.open(ais);
            clip.loop(0);
            clip.flush();
            while(clip.isActive()){
                Thread.sleep(100);
            }
        }catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e){
            e.printStackTrace();
        }finally {
            try{
                ais.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return code;
    }
}

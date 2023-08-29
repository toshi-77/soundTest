package com.example.springboot;

import ch.qos.logback.core.joran.action.ImplicitModelAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.Map;
import java.util.LinkedHashMap;


@Controller
public class soundCheckBoxController {
    /**
     * soundCheckBox
     * @return soundCheckBox
     */
    @RequestMapping("/soundCheckBox")
    public String index(soundCheckBoxForm form, Model model){
        model.addAttribute("checkboxItems", getCheckBoxItems());
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        if(form.getInputMultiCheck() != null){
           for(String code :form.getInputMultiCheck()){
              soundLogic.sound(code);
            }
        }


        return "soundCheckBox";
    }

    private Map<String, String> getCheckBoxItems(){
        Map<String, String> selectMap = new LinkedHashMap<String, String>();
        selectMap.put("G2.wav","G2.wav");
        selectMap.put("Gis2.wav","Gis2.wav");
        selectMap.put("A2.wav","A2.wav");
        selectMap.put("Ais2.wav","Ais2.wav");
        selectMap.put("H2.wav","H2.wav");
        selectMap.put("C3.wav","C3.wav");
        selectMap.put("Cis3.wav","Cis3.wav");
        selectMap.put("D3.wav","D3.wav");
        selectMap.put("Dis3.wav","Dis3.wav");
        selectMap.put("E3.wav","E3.wav");
        selectMap.put("F3.wav","F3.wav");
        selectMap.put("Fis3.wav","Fis3.wav");
        selectMap.put("G3.wav","G3.wav");
        selectMap.put("Gis3.wav","Gis3.wav");
        selectMap.put("A3.wav","A3.wav");
        selectMap.put("Ais3.wav","Ais3.wav");
        selectMap.put("H3.wav","H3.wav");
        selectMap.put("C4.wav","C4.wav");
        selectMap.put("Cis4.wav","Cis4.wav");
        selectMap.put("D4.wav","D4.wav");
        selectMap.put("Dis4.wav","Dis4.wav");
        selectMap.put("E4.wav","E4.wav");
        selectMap.put("F4.wav","F4.wav");
        selectMap.put("Fis4.wav","Fis4.wav");
        selectMap.put("G4.wav","G4.wav");
        selectMap.put("Gis4.wav","Gis4.wav");
        selectMap.put("A4.wav","A4.wav");
        selectMap.put("Ais4.wav","Ais4.wav");
        selectMap.put("H5.wav","H5.wav");
        return selectMap;
    }



}

package com.company.flowlayout;


import java.awt.*;

public class FrameFlowLayout extends Panel{

    public FrameFlowLayout(){

        //row one single line
        //left to right
        setLayout(new FlowLayout());

        Panel panel1 = new Panel();
        panel1.setSize(50,50);
        panel1.add(new TextField(50));
        panel1.add(new TextField(50));
        panel1.add(new TextField(50));

        Panel panel2 = new Panel();
        panel2.setSize(50,50);

        add(panel1);
        add(panel2);


    }

}

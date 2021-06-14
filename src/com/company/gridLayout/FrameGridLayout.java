package com.company.gridLayout;

import java.awt.*;
import java.util.Random;


public class FrameGridLayout extends Panel {
    Random rand = new Random();
    public FrameGridLayout(){



        Panel panel1 = new Panel();
        panel1.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));

        Panel panel2 = new Panel();
        panel2.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));

        Panel panel3 = new Panel();
        panel3.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));

        Panel panel4 = new Panel();
        panel4.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
        Panel panel5 = new Panel();
        panel5.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
        Panel panel6 = new Panel();
        panel6.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));

        Panel panel7 = new Panel();
        panel7.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
        Panel panel8 = new Panel();
        panel8.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
        Panel panel9 = new Panel();
        panel9.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));

        this.setLayout(new GridLayout(3,3));

        //3 rows - 1 column
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);

        //3 rows - 2 columns
        this.add(panel4);
        this.add(panel5);
        this.add(panel6);

        //3 rows - 3 columns
        this.add(panel7);
        this.add(panel8);
        this.add(panel9);

    }
}

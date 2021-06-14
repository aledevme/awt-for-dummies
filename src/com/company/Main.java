package com.company;


import com.company.flowlayout.FrameFlowLayout;
import com.company.gridLayout.FrameGridLayout;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here - awt
        //init frame window
        Frame mywindow = new Frame();
        mywindow.setSize(500,500);

        //mywindow.add(new FrameFlowLayout());

        mywindow.add(new FrameGridLayout());

        mywindow.show(true);

    }
}

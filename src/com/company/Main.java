package com.company;


import com.company.flowlayout.FrameFlowLayout;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here - awt
        //init frame window
        Frame mywindow = new Frame();
        mywindow.setSize(500,500);
        mywindow.add(new FrameFlowLayout());

        mywindow.show(true);

    }
}

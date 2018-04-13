package com.example.rohan.whosfirst;

import java.util.Date;

public class CompDate extends Date {
	private boolean isWin;
	public void setWin(boolean didWin){
		isWin = didWin;
	}
	public boolean getWin(){
		return isWin;
	}
}

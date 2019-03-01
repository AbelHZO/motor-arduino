package com.abelhzo.motor.main;

import com.abelhzo.motor.bo.ReadWriteData;

public class Main {

	public static void main(String[] args) {
		new ReadWriteData();
	}

}

/**
 * 
 * Sketch
 * Codigo arduino:
 * 

int RIGHT = 5;
int LEFT = 6;
int velocidad;

void setup() {
  pinMode(LEFT, OUTPUT);
  pinMode(RIGHT, OUTPUT);
  Serial.begin(9600);
}

void loop() {

  if(Serial.available() > 0) {
    
      velocidad = Serial.parseInt();
      
      if(velocidad <= -80 && velocidad >= -255) {
        analogWrite(RIGHT, 0);
        delay(10);
        analogWrite(LEFT, abs(velocidad));
      }

      if(velocidad >= 80 && velocidad <= 255) {
        analogWrite(LEFT, 0);
        delay(10);
        analogWrite(RIGHT, abs(velocidad));
      }
      
      if((velocidad > -80 && velocidad < 80) && Serial.available() != 0) {
        analogWrite(LEFT, 0);
        analogWrite(RIGHT, 0);
      }
  }
  
}

**/
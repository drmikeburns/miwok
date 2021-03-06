/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_numbers);
		
		// Create a list of words
		//      ArrayList<String> words = new ArrayList<String>();
		//      words.add("one");
		//      words.add("two");
		//      words.add("three");
		//      words.add("four");
		//      words.add("five");
		//      words.add("six");
		//      words.add("seven");
		//      words.add("eight");
		//      words.add("nine");
		//       words.add("ten");
		
		String[] wordArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		ArrayList words = new ArrayList<>(Arrays.asList(wordArray));
		
		
		// Find the root view so we can add child views to it
		LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
		
		// Create a variable to keep track of the current index position
		int index = 0;
		
		// Keep looping until we've reached the end of the list (which means keep looping
		// as long as the current index position is less than the length of the list)
		while (index < words.size()) {
			// Create a new TextView
			TextView wordView = new TextView(this);
			
			// Set the text to be word at the current index
			wordView.setText((CharSequence) words.get(index));
			
			// Add this TextView as another child to the root view of this layout
			rootView.addView(wordView);
			
			// Increment the index variable by 1
			index++;
		}
		
	}
}

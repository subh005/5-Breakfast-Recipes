package com.example.cityguides.cityguides;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showRecipeOneDetails(View view){
        setContentView(R.layout.recipe_one_details);
    }
    public void showRecipeTwoDetails(View view){
        setContentView(R.layout.recipe_two_details);
    }

    public void showRecipeThreeDetails(View view){
        setContentView(R.layout.recipe_three_details);
    }
    public void showRecipeFourDetails(View view){
        setContentView(R.layout.recipe_four_details);
    }
    public void showRecipeFiveDetails(View view){
        setContentView(R.layout.recipe_five_details);
    }
    public void showMyFavourites(View view) {

        CheckBox recipeOne = (CheckBox) findViewById(R.id.recipeOne);
        boolean hasRecipeOneChecked = recipeOne.isChecked();
        CheckBox recipeTwo = (CheckBox) findViewById(R.id.recipeTwo);
        boolean hasRecipeTwoChecked = recipeTwo.isChecked();
        CheckBox recipeThree = (CheckBox) findViewById(R.id.recipeThree);
        boolean hasRecipeThreeChecked = recipeThree.isChecked();
        CheckBox recipeFour = (CheckBox) findViewById(R.id.recipeFour);
        boolean hasRecipeFourChecked = recipeFour.isChecked();
        CheckBox recipeFive = (CheckBox) findViewById(R.id.recipeFive);
        boolean hasRecipeFiveChecked = recipeFive.isChecked();
        Toast.makeText(view.getContext(), "" + displayMessage(hasRecipeOneChecked, hasRecipeTwoChecked,hasRecipeThreeChecked,hasRecipeFourChecked,hasRecipeFiveChecked )  , Toast.LENGTH_SHORT).show();
    }
    public String displayMessage(  boolean hasRecipeOneChecked, boolean hasRecipeTwoChecked, boolean hasRecipeThreeChecked,boolean hasRecipeFourChecked,boolean hasRecipeFiveChecked ){
        String summaryMessage = "My Favourite : ";
        if(hasRecipeOneChecked){
            summaryMessage = summaryMessage +"\n Dal Ka Paratha";
        }
        if(hasRecipeTwoChecked){
            summaryMessage = summaryMessage +"\n Moong Dal Cheela";
        }
        if(hasRecipeThreeChecked){
            summaryMessage = summaryMessage +"\n Rawa Upma";
        }
        if(hasRecipeFourChecked){
            summaryMessage = summaryMessage +"\n Uttapam";
        }
        if(hasRecipeFiveChecked){
            summaryMessage = summaryMessage +"\n Poha";
        }

        return summaryMessage;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

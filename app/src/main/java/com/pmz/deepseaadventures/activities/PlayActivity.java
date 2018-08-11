package com.pmz.deepseaadventures.activities;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.pmz.deepseaadventures.R;
import com.pmz.deepseaadventures.domain.GameEngine;
import com.pmz.deepseaadventures.domain.Player;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import static com.pmz.deepseaadventures.constants.GeneralConstants.ROLL_ANIMATION_DURATION;

@EActivity
public class PlayActivity extends AppCompatActivity {


    @ViewById
    ImageView rollBtn;
    @ViewById
    ImageView statsBtn;
    @ViewById
    ImageView pickupBtn;
    @ViewById
    ImageView endTurnBtn;
    @ViewById
    ImageView die1;
    @ViewById
    ImageView die2;

    @ViewById
    ImageView tile1;
    @ViewById
    ImageView tile2;
    @ViewById
    ImageView tile3;
    @ViewById
    ImageView tile4;
    @ViewById
    ImageView tile5;
    @ViewById
    ImageView tile6;
    @ViewById
    ImageView tile7;
    @ViewById
    ImageView tile8;
    @ViewById
    ImageView tile9;
    @ViewById
    ImageView tile10;
    @ViewById
    ImageView tile11;
    @ViewById
    ImageView tile12;
    @ViewById
    ImageView tile13;
    @ViewById
    ImageView tile14;
    @ViewById
    ImageView tile15;
    @ViewById
    ImageView tile16;
    @ViewById
    ImageView tile17;
    @ViewById
    ImageView tile18;
    @ViewById
    ImageView tile19;
    @ViewById
    ImageView tile20;
    @ViewById
    ImageView tile21;
    @ViewById
    ImageView tile22;
    @ViewById
    ImageView tile23;
    @ViewById
    ImageView tile24;
    @ViewById
    ImageView tile25;
    @ViewById
    ImageView tile26;
    @ViewById
    ImageView tile27;
    @ViewById
    ImageView tile28;
    @ViewById
    ImageView tile29;
    @ViewById
    ImageView tile30;
    @ViewById
    ImageView tile31;
    @ViewById
    ImageView tile32;

    @ViewById
    ImageView tilemeeple1;
    @ViewById
    ImageView tilemeeple2;
    @ViewById
    ImageView tilemeeple3;
    @ViewById
    ImageView tilemeeple4;
    @ViewById
    ImageView tilemeeple5;
    @ViewById
    ImageView tilemeeple6;
    @ViewById
    ImageView tilemeeple7;
    @ViewById
    ImageView tilemeeple8;
    @ViewById
    ImageView tilemeeple9;
    @ViewById
    ImageView tilemeeple10;
    @ViewById
    ImageView tilemeeple11;
    @ViewById
    ImageView tilemeeple12;
    @ViewById
    ImageView tilemeeple13;
    @ViewById
    ImageView tilemeeple14;
    @ViewById
    ImageView tilemeeple15;
    @ViewById
    ImageView tilemeeple16;
    @ViewById
    ImageView tilemeeple17;
    @ViewById
    ImageView tilemeeple18;
    @ViewById
    ImageView tilemeeple19;
    @ViewById
    ImageView tilemeeple20;
    @ViewById
    ImageView tilemeeple21;
    @ViewById
    ImageView tilemeeple22;
    @ViewById
    ImageView tilemeeple23;
    @ViewById
    ImageView tilemeeple24;
    @ViewById
    ImageView tilemeeple25;
    @ViewById
    ImageView tilemeeple26;
    @ViewById
    ImageView tilemeeple27;
    @ViewById
    ImageView tilemeeple28;
    @ViewById
    ImageView tilemeeple29;
    @ViewById
    ImageView tilemeeple30;
    @ViewById
    ImageView tilemeeple31;
    @ViewById
    ImageView tilemeeple32;

    private List<ImageView> allTileViews;
    private List<ImageView> allTileMeepleViews;

    @ViewById
    TextView airPoints;

    Animation rotationAnimation;
    private GameEngine gameEngine;
    private int spacesToMove;
    private Player currentPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        hideNavigationBar();
        setupObjects();
    }

    @Override
    protected void onResume() {
        super.onResume();
        hideNavigationBar();
    }

    private void hideNavigationBar() {
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    private void setupObjects() {
        gameEngine = new GameEngine();
        rotationAnimation = AnimationUtils.loadAnimation(
                PlayActivity.this, R.anim.rotateanimation);
        currentPlayer = gameEngine.getPlayers().get(0);     //TODO maybe make it random
        allTileViews = new ArrayList<>();
        allTileMeepleViews = new ArrayList<>();

        allTileViews.add(0, null);
        allTileViews.add(1, tile1);
        allTileViews.add(2, tile2);
        allTileViews.add(3, tile3);
        allTileViews.add(4, tile4);
        allTileViews.add(5, tile5);
        allTileViews.add(6, tile6);
        allTileViews.add(7, tile7);
        allTileViews.add(8, tile8);
        allTileViews.add(9, tile9);
        allTileViews.add(10, tile10);
        allTileViews.add(11, tile11);
        allTileViews.add(12, tile12);
        allTileViews.add(13, tile13);
        allTileViews.add(14, tile14);
        allTileViews.add(15, tile15);
        allTileViews.add(16, tile16);
        allTileViews.add(17, tile17);
        allTileViews.add(18, tile18);
        allTileViews.add(19, tile19);
        allTileViews.add(20, tile20);
        allTileViews.add(21, tile21);
        allTileViews.add(22, tile22);
        allTileViews.add(23, tile23);
        allTileViews.add(24, tile24);
        allTileViews.add(25, tile25);
        allTileViews.add(26, tile26);
        allTileViews.add(27, tile27);
        allTileViews.add(28, tile28);
        allTileViews.add(29, tile29);
        allTileViews.add(30, tile30);
        allTileViews.add(31, tile31);
        allTileViews.add(32, tile32);

        allTileMeepleViews.add(0, null);
        allTileMeepleViews.add(1, tilemeeple1);
        allTileMeepleViews.add(2, tilemeeple2);
        allTileMeepleViews.add(3, tilemeeple3);
        allTileMeepleViews.add(4, tilemeeple4);
        allTileMeepleViews.add(5, tilemeeple5);
        allTileMeepleViews.add(6, tilemeeple6);
        allTileMeepleViews.add(7, tilemeeple7);
        allTileMeepleViews.add(8, tilemeeple8);
        allTileMeepleViews.add(9, tilemeeple9);
        allTileMeepleViews.add(10, tilemeeple10);
        allTileMeepleViews.add(11, tilemeeple11);
        allTileMeepleViews.add(12, tilemeeple12);
        allTileMeepleViews.add(13, tilemeeple13);
        allTileMeepleViews.add(14, tilemeeple14);
        allTileMeepleViews.add(15, tilemeeple15);
        allTileMeepleViews.add(16, tilemeeple16);
        allTileMeepleViews.add(17, tilemeeple17);
        allTileMeepleViews.add(18, tilemeeple18);
        allTileMeepleViews.add(19, tilemeeple19);
        allTileMeepleViews.add(20, tilemeeple20);
        allTileMeepleViews.add(21, tilemeeple21);
        allTileMeepleViews.add(22, tilemeeple22);
        allTileMeepleViews.add(23, tilemeeple23);
        allTileMeepleViews.add(24, tilemeeple24);
        allTileMeepleViews.add(25, tilemeeple25);
        allTileMeepleViews.add(26, tilemeeple26);
        allTileMeepleViews.add(27, tilemeeple27);
        allTileMeepleViews.add(28, tilemeeple28);
        allTileMeepleViews.add(29, tilemeeple29);
        allTileMeepleViews.add(30, tilemeeple30);
        allTileMeepleViews.add(31, tilemeeple31);
        allTileMeepleViews.add(32, tilemeeple32);

    }

    private void changeImageView(ImageView imageView, String name) {
        imageView.setImageResource(getDrawableImageIdByName(
                name));
    }

    private void emptyImageView(ImageView imageView) {
        imageView.setImageResource(0);
    }

    private int getDrawableImageIdByName(String resourceName) {
        return getResources().getIdentifier(resourceName, "drawable", getPackageName());
    }

    private void applyAnimation(ImageView dieView) {
        dieView.startAnimation(rotationAnimation);
    }

    @Click(R.id.rollBtn)
    void rollDiceAfterAnimation() {
        applyAnimation(die1);
        applyAnimation(die2);

        final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    rollDice();
                    resolveMovementDown();
                    //TODO makeButtonUnclickable(rollBtn);
                }
            }, ROLL_ANIMATION_DURATION);


    }

    private void rollDice() {
        gameEngine.rollDice();
        updateDiceImages();
    }

    private void updateDiceImages() {
        changeImageView(die1, "die" + gameEngine.getDice1Result());
        changeImageView(die2, "die" + gameEngine.getDice2Result());
    }

    private int calculateSpacesToMove() {
        return gameEngine.getDiceSum() - currentPlayer.getCurrentRoundTreasureIds().size();
    }

    private void resolveMovementDown() {
        int spacesToMove = calculateSpacesToMove();
        int currTileNumber = currentPlayer.getCurrentTile().getNumber();

        if (spacesToMove <= 0) {
            return;
        }

        while (spacesToMove > 0) {
            currTileNumber++;
            if(!gameEngine.getAllTiles().get(currTileNumber).isOccupied()){
                spacesToMove--;
            }
        }

        occupyTile(currentPlayer, currTileNumber);
    }

    private void occupyTile(Player currentPlayer, int tileNumberToBeOccupied) {
        int currOccupiedTileNumber = currentPlayer.getCurrentTile().getNumber();
        if(currOccupiedTileNumber != 0) {
            emptyImageView(allTileMeepleViews.get(currOccupiedTileNumber));     //remove meeple image from the tile
        }

        gameEngine.occupyTile(currentPlayer, gameEngine.getAllTiles().get(tileNumberToBeOccupied));
        changeImageView(allTileMeepleViews.get(tileNumberToBeOccupied), currentPlayer.getPlayerColor());
    }


}

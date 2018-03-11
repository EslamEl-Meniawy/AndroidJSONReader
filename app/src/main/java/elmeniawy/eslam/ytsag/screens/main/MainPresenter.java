package elmeniawy.eslam.ytsag.screens.main;

import android.support.annotation.Nullable;

/**
 * MainPresenter
 * <p>
 * Created by Eslam El-Meniawy on 11-Mar-2018.
 * CITC - Mansoura University
 */

public class MainPresenter implements MainMVP.Presenter {
    @Nullable
    private MainMVP.View view;

    private MainMVP.Model model;

    MainPresenter(MainMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(@Nullable MainMVP.View view) {
        this.view = view;
    }

    @Override
    public void rxUnsubscribe() {

    }

    @Override
    public void notificationSwitchClicked() {

    }

    @Override
    public void updateSwitchClicked() {

    }

    @Override
    public void setNotificationScheduler() {

    }

    @Override
    public void stopNotificationScheduler() {

    }

    @Override
    public void setUpdateScheduler() {

    }

    @Override
    public void stopUpdateScheduler() {

    }

    @Override
    public void aboutClicked() {

    }

    @Override
    public void updateClicked() {

    }

    @Override
    public void checkUpdateClicked() {

    }

    @Override
    public void errorClicked() {

    }

    @Override
    public void loadMovies() {

    }

    @Override
    public void refreshMovies() {

    }

    @Override
    public void bannerAdLoaded() {

    }

    @Override
    public void bannerAdFailed() {

    }

    @Override
    public void bannerClicked() {

    }

    @Override
    public void interstitialClicked() {

    }

    @Override
    public void interstitialClosed() {

    }

    @Override
    public void permissionCallback(boolean granted) {

    }

    @Override
    public void backClicked() {

    }

    @Override
    public void movieClicked(MovieViewModel movie) {

    }
}
package ru.okay.whack_a_mole.presentation.menu;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import ru.okay.whack_a_mole.R;

public class MainMenuFragmentDirections {
  private MainMenuFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMainMenuFragmentToGameFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainMenuFragment_to_gameFragment);
  }
}

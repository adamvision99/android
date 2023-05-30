package ru.okay.whack_a_mole.presentation.game_over;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import ru.okay.whack_a_mole.R;

public class GameOverFragmentDirections {
  private GameOverFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGameOverFragmentToMainMenuFragment() {
    return new ActionOnlyNavDirections(R.id.action_gameOverFragment_to_mainMenuFragment);
  }

  @NonNull
  public static NavDirections actionGameOverFragmentToGameFragment() {
    return new ActionOnlyNavDirections(R.id.action_gameOverFragment_to_gameFragment);
  }
}

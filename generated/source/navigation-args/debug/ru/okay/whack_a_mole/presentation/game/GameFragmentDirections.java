package ru.okay.whack_a_mole.presentation.game;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import ru.okay.whack_a_mole.R;

public class GameFragmentDirections {
  private GameFragmentDirections() {
  }

  @NonNull
  public static ActionGameFragmentToGameOverFragment actionGameFragmentToGameOverFragment(
      int score) {
    return new ActionGameFragmentToGameOverFragment(score);
  }

  @NonNull
  public static NavDirections actionGameFragmentToMainMenuFragment() {
    return new ActionOnlyNavDirections(R.id.action_gameFragment_to_mainMenuFragment);
  }

  public static class ActionGameFragmentToGameOverFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionGameFragmentToGameOverFragment(int score) {
      this.arguments.put("score", score);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionGameFragmentToGameOverFragment setScore(int score) {
      this.arguments.put("score", score);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("score")) {
        int score = (int) arguments.get("score");
        __result.putInt("score", score);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_gameFragment_to_gameOverFragment;
    }

    @SuppressWarnings("unchecked")
    public int getScore() {
      return (int) arguments.get("score");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGameFragmentToGameOverFragment that = (ActionGameFragmentToGameOverFragment) object;
      if (arguments.containsKey("score") != that.arguments.containsKey("score")) {
        return false;
      }
      if (getScore() != that.getScore()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getScore();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGameFragmentToGameOverFragment(actionId=" + getActionId() + "){"
          + "score=" + getScore()
          + "}";
    }
  }
}

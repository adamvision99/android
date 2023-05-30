package ru.okay.whack_a_mole.presentation.game_over;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GameOverFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private GameOverFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private GameOverFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GameOverFragmentArgs fromBundle(@NonNull Bundle bundle) {
    GameOverFragmentArgs __result = new GameOverFragmentArgs();
    bundle.setClassLoader(GameOverFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("score")) {
      int score;
      score = bundle.getInt("score");
      __result.arguments.put("score", score);
    } else {
      throw new IllegalArgumentException("Required argument \"score\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GameOverFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    GameOverFragmentArgs __result = new GameOverFragmentArgs();
    if (savedStateHandle.contains("score")) {
      int score;
      score = savedStateHandle.get("score");
      __result.arguments.put("score", score);
    } else {
      throw new IllegalArgumentException("Required argument \"score\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getScore() {
    return (int) arguments.get("score");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("score")) {
      int score = (int) arguments.get("score");
      __result.putInt("score", score);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("score")) {
      int score = (int) arguments.get("score");
      __result.set("score", score);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    GameOverFragmentArgs that = (GameOverFragmentArgs) object;
    if (arguments.containsKey("score") != that.arguments.containsKey("score")) {
      return false;
    }
    if (getScore() != that.getScore()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getScore();
    return result;
  }

  @Override
  public String toString() {
    return "GameOverFragmentArgs{"
        + "score=" + getScore()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull GameOverFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int score) {
      this.arguments.put("score", score);
    }

    @NonNull
    public GameOverFragmentArgs build() {
      GameOverFragmentArgs result = new GameOverFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setScore(int score) {
      this.arguments.put("score", score);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getScore() {
      return (int) arguments.get("score");
    }
  }
}

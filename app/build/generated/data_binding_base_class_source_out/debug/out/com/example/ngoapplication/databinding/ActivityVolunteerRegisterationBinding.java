// Generated by view binder compiler. Do not edit!
package com.example.ngoapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ngoapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVolunteerRegisterationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView backImgVew;

  @NonNull
  public final EditText cityEditText;

  @NonNull
  public final EditText contactEditText;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final EditText mailEditText;

  @NonNull
  public final EditText nameEditText;

  @NonNull
  public final EditText pinEditText;

  @NonNull
  public final Button sbmtButton;

  @NonNull
  public final TextView textView10;

  private ActivityVolunteerRegisterationBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView backImgVew, @NonNull EditText cityEditText,
      @NonNull EditText contactEditText, @NonNull ImageView imageView9,
      @NonNull EditText mailEditText, @NonNull EditText nameEditText, @NonNull EditText pinEditText,
      @NonNull Button sbmtButton, @NonNull TextView textView10) {
    this.rootView = rootView;
    this.backImgVew = backImgVew;
    this.cityEditText = cityEditText;
    this.contactEditText = contactEditText;
    this.imageView9 = imageView9;
    this.mailEditText = mailEditText;
    this.nameEditText = nameEditText;
    this.pinEditText = pinEditText;
    this.sbmtButton = sbmtButton;
    this.textView10 = textView10;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVolunteerRegisterationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVolunteerRegisterationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_volunteer_registeration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVolunteerRegisterationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backImgVew;
      ImageView backImgVew = ViewBindings.findChildViewById(rootView, id);
      if (backImgVew == null) {
        break missingId;
      }

      id = R.id.cityEditText;
      EditText cityEditText = ViewBindings.findChildViewById(rootView, id);
      if (cityEditText == null) {
        break missingId;
      }

      id = R.id.contactEditText;
      EditText contactEditText = ViewBindings.findChildViewById(rootView, id);
      if (contactEditText == null) {
        break missingId;
      }

      id = R.id.imageView9;
      ImageView imageView9 = ViewBindings.findChildViewById(rootView, id);
      if (imageView9 == null) {
        break missingId;
      }

      id = R.id.mailEditText;
      EditText mailEditText = ViewBindings.findChildViewById(rootView, id);
      if (mailEditText == null) {
        break missingId;
      }

      id = R.id.nameEditText;
      EditText nameEditText = ViewBindings.findChildViewById(rootView, id);
      if (nameEditText == null) {
        break missingId;
      }

      id = R.id.pinEditText;
      EditText pinEditText = ViewBindings.findChildViewById(rootView, id);
      if (pinEditText == null) {
        break missingId;
      }

      id = R.id.sbmtButton;
      Button sbmtButton = ViewBindings.findChildViewById(rootView, id);
      if (sbmtButton == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      return new ActivityVolunteerRegisterationBinding((ConstraintLayout) rootView, backImgVew,
          cityEditText, contactEditText, imageView9, mailEditText, nameEditText, pinEditText,
          sbmtButton, textView10);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

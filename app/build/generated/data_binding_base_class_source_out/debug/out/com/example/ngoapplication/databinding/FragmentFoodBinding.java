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

public final class FragmentFoodBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final EditText foodEditText;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final EditText pickDateEditText;

  @NonNull
  public final EditText pickEditText;

  @NonNull
  public final EditText pkLocEditText;

  @NonNull
  public final EditText quantityEditText;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView9;

  private FragmentFoodBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull EditText foodEditText, @NonNull ImageView imageView10,
      @NonNull EditText pickDateEditText, @NonNull EditText pickEditText,
      @NonNull EditText pkLocEditText, @NonNull EditText quantityEditText,
      @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView9) {
    this.rootView = rootView;
    this.button = button;
    this.foodEditText = foodEditText;
    this.imageView10 = imageView10;
    this.pickDateEditText = pickDateEditText;
    this.pickEditText = pickEditText;
    this.pkLocEditText = pkLocEditText;
    this.quantityEditText = quantityEditText;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFoodBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFoodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_food, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFoodBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.foodEditText;
      EditText foodEditText = ViewBindings.findChildViewById(rootView, id);
      if (foodEditText == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.pickDateEditText;
      EditText pickDateEditText = ViewBindings.findChildViewById(rootView, id);
      if (pickDateEditText == null) {
        break missingId;
      }

      id = R.id.pickEditText;
      EditText pickEditText = ViewBindings.findChildViewById(rootView, id);
      if (pickEditText == null) {
        break missingId;
      }

      id = R.id.pkLocEditText;
      EditText pkLocEditText = ViewBindings.findChildViewById(rootView, id);
      if (pkLocEditText == null) {
        break missingId;
      }

      id = R.id.quantityEditText;
      EditText quantityEditText = ViewBindings.findChildViewById(rootView, id);
      if (quantityEditText == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      return new FragmentFoodBinding((ConstraintLayout) rootView, button, foodEditText, imageView10,
          pickDateEditText, pickEditText, pkLocEditText, quantityEditText, textView4, textView5,
          textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

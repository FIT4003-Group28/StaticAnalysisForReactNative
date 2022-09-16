package com.google.android.apps.gmm.ugc.post.editor;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DismissKeyboardScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    public DismissKeyboardScrollingViewBehavior() {
    }

    @Override // defpackage.aji
    public final boolean c(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            Activity activity = (Activity) view.getContext();
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus instanceof EditText) {
                Rect rect = new Rect();
                currentFocus.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    currentFocus.clearFocus();
                    IBinder windowToken = currentFocus.getWindowToken();
                    InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                    }
                }
            }
        }
        return false;
    }

    public DismissKeyboardScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

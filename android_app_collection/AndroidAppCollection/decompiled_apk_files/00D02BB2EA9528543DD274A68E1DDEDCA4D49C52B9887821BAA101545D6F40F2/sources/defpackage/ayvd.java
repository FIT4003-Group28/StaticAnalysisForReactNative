package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: ayvd  reason: default package */
/* loaded from: classes3.dex */
public final class ayvd extends FrameLayout {
    public ayvd(Context context) {
        super(context);
    }

    private static boolean a(@dzsi View view, MotionEvent motionEvent) {
        if (view == null) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    private static void b(@dzsi View view) {
        if (view != null) {
            view.clearFocus();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View rootView = getRootView();
            View d = cqkx.d(rootView, aysy.d);
            View d2 = cqkx.d(rootView, aysy.e);
            if (!a(d, motionEvent) && !a(d2, motionEvent)) {
                b(d);
                b(d2);
                ((InputMethodManager) rootView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(rootView.getWindowToken(), 0);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public ayvd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: yia  reason: default package */
/* loaded from: classes4.dex */
final class yia implements View.OnFocusChangeListener, View.OnTouchListener, TextView.OnEditorActionListener {
    final /* synthetic */ yib a;

    public yia(yib yibVar) {
        this.a = yibVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6 || i == 5) {
            this.a.b();
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.e();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        yib yibVar = this.a;
        boolean z = view == yibVar.e || view == yibVar.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && z) {
                view.performClick();
                return true;
            }
        } else if (z) {
            this.a.e();
            return true;
        } else {
            this.a.b();
        }
        return false;
    }
}

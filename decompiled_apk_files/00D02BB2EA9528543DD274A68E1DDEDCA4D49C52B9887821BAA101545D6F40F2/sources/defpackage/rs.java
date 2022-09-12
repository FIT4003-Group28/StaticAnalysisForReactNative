package defpackage;

import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rs  reason: default package */
/* loaded from: classes.dex */
public final class rs extends ContentFrameLayout {
    final /* synthetic */ rv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs(rv rvVar, Context context) {
        super(context);
        this.a = rvVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.C(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                rv rvVar = this.a;
                rvVar.F(rvVar.N(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(sl.b(getContext(), i));
    }
}

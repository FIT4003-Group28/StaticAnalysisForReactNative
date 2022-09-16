package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: ajui  reason: default package */
/* loaded from: classes.dex */
final class ajui implements View.OnTouchListener {
    final /* synthetic */ ajul a;

    public ajui(ajul ajulVar) {
        this.a = ajulVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zag.i(this.a.getCurrentFocus());
        return false;
    }
}

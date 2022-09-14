package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: jmh  reason: default package */
/* loaded from: classes7.dex */
final class jmh implements View.OnTouchListener {
    final /* synthetic */ jmi a;

    public jmh(jmi jmiVar) {
        this.a = jmiVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.b.dismiss();
        return false;
    }
}

package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: cztw  reason: default package */
/* loaded from: classes.dex */
final class cztw implements View.OnTouchListener {
    final /* synthetic */ cztz a;

    public cztw(cztz cztzVar) {
        this.a = cztzVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.e(2);
        return false;
    }
}

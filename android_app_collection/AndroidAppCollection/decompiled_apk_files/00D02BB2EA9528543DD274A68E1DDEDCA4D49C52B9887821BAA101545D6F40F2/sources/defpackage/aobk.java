package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: aobk  reason: default package */
/* loaded from: classes2.dex */
final class aobk implements View.OnTouchListener {
    final /* synthetic */ aobn a;

    public aobk(aobn aobnVar) {
        this.a = aobnVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.q();
        return true;
    }
}

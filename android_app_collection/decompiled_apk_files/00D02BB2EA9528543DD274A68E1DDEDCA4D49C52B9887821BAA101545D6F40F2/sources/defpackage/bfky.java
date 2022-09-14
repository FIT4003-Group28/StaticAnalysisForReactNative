package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: bfky  reason: default package */
/* loaded from: classes3.dex */
final class bfky implements View.OnTouchListener {
    final /* synthetic */ bfla a;

    public bfky(bfla bflaVar) {
        this.a = bflaVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.g.a(motionEvent);
        return true;
    }
}

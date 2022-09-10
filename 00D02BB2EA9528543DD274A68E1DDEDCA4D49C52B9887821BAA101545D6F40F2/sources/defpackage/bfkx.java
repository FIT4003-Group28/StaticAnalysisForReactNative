package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: bfkx  reason: default package */
/* loaded from: classes3.dex */
final class bfkx extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ bfla a;

    public bfkx(bfla bflaVar) {
        this.a = bflaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View a;
        cjql e;
        bfla bflaVar = this.a;
        View o = cqkx.o(bflaVar);
        if (o != null && (a = cqhu.a(o, gtt.a)) != null && (e = cjqg.e(a)) != null) {
            bflaVar.a.j(e, bflaVar.j);
        }
        bfla bflaVar2 = this.a;
        bflaVar2.e.a(bwrs.a(bflaVar2.b), this.a.c);
        return true;
    }
}

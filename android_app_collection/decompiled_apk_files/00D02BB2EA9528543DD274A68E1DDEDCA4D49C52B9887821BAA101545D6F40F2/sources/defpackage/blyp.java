package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blyp  reason: default package */
/* loaded from: classes3.dex */
public final class blyp extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ blyq a;

    public blyp(blyq blyqVar) {
        this.a = blyqVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        blyv blyvVar = this.a.b;
        blzs blzsVar = blyvVar.t;
        blzsVar.f = !blzsVar.f;
        blzsVar.g = true;
        blyvVar.n = new blyr(blyvVar);
        cqkx.p(blyvVar);
        return true;
    }
}

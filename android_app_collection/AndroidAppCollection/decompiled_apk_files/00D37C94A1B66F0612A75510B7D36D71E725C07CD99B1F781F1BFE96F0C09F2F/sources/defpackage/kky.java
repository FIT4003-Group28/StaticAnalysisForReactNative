package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: kky  reason: default package */
/* loaded from: classes3.dex */
public final class kky implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ apbc a;
    final /* synthetic */ kkz b;

    public kky(kkz kkzVar, apbc apbcVar) {
        this.b = kkzVar;
        this.a = apbcVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.b.d(this.a);
    }
}

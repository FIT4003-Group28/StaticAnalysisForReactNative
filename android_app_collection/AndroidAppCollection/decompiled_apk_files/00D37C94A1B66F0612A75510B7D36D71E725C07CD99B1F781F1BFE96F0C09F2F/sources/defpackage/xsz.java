package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: xsz  reason: default package */
/* loaded from: classes4.dex */
final class xsz implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ xtc a;

    public xsz(xtc xtcVar) {
        this.a = xtcVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        xtc xtcVar = this.a;
        xtcVar.f(xtcVar.s);
        xtc xtcVar2 = this.a;
        xtcVar2.f(xtcVar2.t);
        xtc xtcVar3 = this.a;
        xtcVar3.f(xtcVar3.u);
        xtc xtcVar4 = this.a;
        xtcVar4.f(xtcVar4.v);
        this.a.r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

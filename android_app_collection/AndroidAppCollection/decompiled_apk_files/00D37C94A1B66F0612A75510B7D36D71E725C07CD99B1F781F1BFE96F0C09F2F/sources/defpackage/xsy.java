package defpackage;
/* compiled from: PG */
/* renamed from: xsy  reason: default package */
/* loaded from: classes4.dex */
final class xsy implements akev {
    final /* synthetic */ xtc a;

    public xsy(xtc xtcVar) {
        this.a = xtcVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfq akfqVar = (akfq) obj;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfq akfqVar = (akfq) obj;
        this.a.m.getViewTreeObserver().removeOnScrollChangedListener(this.a.w);
        this.a.x = true;
    }
}

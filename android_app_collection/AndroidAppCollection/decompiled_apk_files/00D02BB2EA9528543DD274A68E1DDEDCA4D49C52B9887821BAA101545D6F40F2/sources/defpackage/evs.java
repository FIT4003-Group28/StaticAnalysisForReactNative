package defpackage;
/* compiled from: PG */
/* renamed from: evs  reason: default package */
/* loaded from: classes6.dex */
final class evs<T> implements dzsj<T> {
    final /* synthetic */ evt a;
    private final int b;

    public evs(evt evtVar, int i) {
        this.a = evtVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            evt evtVar = this.a;
            return (T) new aurg(evtVar.a.eW.K(), evtVar.a.ad(), evtVar.a.eW.ax(), evtVar.a.eW.o(), evtVar.a.eW.aT(), dxjh.c(evtVar.a.m()), dxjh.c(evtVar.a.bh()));
        }
        evt evtVar2 = this.a;
        auom az = evtVar2.a.eW.az();
        cqat rR = evtVar2.a.eW.a.rR();
        dxjg.e(rR);
        return (T) auop.b(az, rR, dxjc.c(evtVar2.a.eW.im()));
    }
}

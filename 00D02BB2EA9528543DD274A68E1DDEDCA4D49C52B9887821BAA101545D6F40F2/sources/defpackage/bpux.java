package defpackage;
/* renamed from: bpux  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bpux implements dbrn {
    static final dbrn a = new bpux();

    private bpux() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        digh dighVar = (digh) obj;
        dpsn dpsnVar = dighVar.b;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        akqi j = akqi.j(dpsnVar);
        bpuy e = bpuz.e();
        e.b(j);
        ((bpul) e).a = 2;
        if ((dighVar.a & 8) != 0) {
            dpum dpumVar = dighVar.e;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            e.c(akqq.f(dpumVar));
        }
        if ((dighVar.a & 32) != 0) {
            dpuq dpuqVar = dighVar.i;
            if (dpuqVar == null) {
                dpuqVar = dpuq.d;
            }
            e.d(new akqs(dpuqVar));
        }
        return e.a();
    }
}

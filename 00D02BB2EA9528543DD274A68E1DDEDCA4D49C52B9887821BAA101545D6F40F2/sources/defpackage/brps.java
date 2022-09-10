package defpackage;
/* compiled from: PG */
/* renamed from: brps  reason: default package */
/* loaded from: classes4.dex */
public final class brps implements brpv {
    public final brln a;
    public final double b;
    private final String c;
    private final dhjx d;

    public brps(btvo btvoVar, brln brlnVar) {
        this.a = brlnVar;
        this.c = brlnVar.b().c;
        dhjx dhjxVar = brlnVar.b().d;
        this.d = dhjxVar == null ? dhjx.f : dhjxVar;
        this.b = btvoVar.getSearchParameters().i().c;
    }

    private final boolean c() {
        int i = this.d.a;
        return ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) ? false : true;
    }

    @Override // defpackage.brpv
    public final brpu a(brpv brpvVar) {
        boolean z = brpvVar instanceof brps;
        double d = dcyn.a;
        if (z) {
            brps brpsVar = (brps) brpvVar;
            if (!this.c.isEmpty() && this.c.equals(brpsVar.c) && this.a.b().f == brpsVar.a.b().f && c() && brpsVar.c()) {
                akqs m = akyx.m(this.d);
                akqs m2 = akyx.m(brpsVar.d);
                double h = akqs.h(m, m2);
                d = h / ((m.g() + m2.g()) - h);
            }
        }
        return new brpr(this, d);
    }

    @Override // defpackage.brpv
    public final String b() {
        return this.c;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bwif  reason: default package */
/* loaded from: classes4.dex */
public class bwif implements bwhw {
    private final gga a;
    private final int b;
    private final cqrp c;
    private boolean d = true;
    private boolean e = true;

    public bwif(gga ggaVar, cqhn cqhnVar, int i, cqrp cqrpVar) {
        this.a = ggaVar;
        this.b = i;
        this.c = cqrpVar;
    }

    private final Integer g() {
        return Integer.valueOf(cqsg.g(cqsz.d(), cqsg.d(this.c, bwgl.c, cqrp.d(this.b))).e(this.a));
    }

    @Override // defpackage.bwhw
    public Integer a() {
        return g();
    }

    @Override // defpackage.bwhw
    public Integer b() {
        return Integer.valueOf(Math.max(g().intValue(), Integer.valueOf(cqsg.f(cqrp.d(180.0d), Float.valueOf(0.55f)).e(this.a)).intValue()));
    }

    @Override // defpackage.bwhw
    public Boolean c() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.bwhw
    public Boolean d() {
        return Boolean.valueOf(this.e);
    }

    public void e(boolean z, boolean z2) {
        this.d = true;
        this.e = true;
        cqkx.p(this);
    }

    @Override // defpackage.bwhx
    public Integer f() {
        return Integer.valueOf(Math.min(b().intValue(), Integer.valueOf(cqrp.d(268.0d).e(this.a)).intValue()));
    }
}

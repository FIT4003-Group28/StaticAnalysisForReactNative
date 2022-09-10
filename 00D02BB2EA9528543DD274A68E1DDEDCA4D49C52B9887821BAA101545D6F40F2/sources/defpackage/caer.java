package defpackage;
/* compiled from: PG */
/* renamed from: caer  reason: default package */
/* loaded from: classes4.dex */
public class caer implements cagh {
    private final cgen a;
    private final dwrc b;
    private final cafw c;
    private final cjtd d;

    public caer(cgen cgenVar, dwrc dwrcVar) {
        this.a = cgenVar;
        this.b = dwrcVar;
        dwqz dwqzVar = dwrcVar.c;
        this.c = new cgzh(dwqzVar == null ? dwqz.g : dwqzVar);
        cjta b = cjtd.b();
        b.d = dtyc.aI;
        if ((dwrcVar.a & 4) != 0) {
            b.g(dwrcVar.d);
        }
        this.d = b.a();
    }

    @Override // defpackage.cagh
    public cafw a() {
        return this.c;
    }

    @Override // defpackage.cagh
    public cqkl b() {
        this.a.e(this.b.b, cgem.CONTRIBUTIONS_PAGE);
        return cqkl.a;
    }

    @Override // defpackage.cagh
    public cjtd c() {
        return this.d;
    }
}

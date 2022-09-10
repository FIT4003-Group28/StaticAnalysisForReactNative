package defpackage;
/* compiled from: PG */
/* renamed from: apil  reason: default package */
/* loaded from: classes2.dex */
public class apil implements aphr {
    static final cqtd a = cqrt.f(2131231038);
    private final bwqv b;
    private final aoxv c;
    private final gga d;
    private final bmdv e;
    private final aphj f;
    private final aoxt g;
    private final int h;
    private final int i;
    private final jic j;

    public apil(bwqv bwqvVar, aoxv aoxvVar, gga ggaVar, bmdv bmdvVar, aphj aphjVar, aoxt aoxtVar, int i, int i2) {
        this.b = bwqvVar;
        this.c = aoxvVar;
        this.d = ggaVar;
        this.e = bmdvVar;
        this.f = aphjVar;
        this.g = aoxtVar;
        this.h = i;
        this.i = i2;
        this.j = aphi.a(aoxtVar.a(), a);
    }

    @Override // defpackage.aphr
    public String a() {
        return this.g.a().n();
    }

    @Override // defpackage.aphr
    public Boolean b() {
        return Boolean.valueOf(this.h > 0);
    }

    @Override // defpackage.aphr
    public CharSequence c() {
        return this.f.c(this.h, 3);
    }

    @Override // defpackage.aphr
    public String d() {
        dpuc dpucVar = this.g.e().b;
        if (dpucVar == null) {
            dpucVar = dpuc.c;
        }
        if (dpucVar.b > 0) {
            bmdv bmdvVar = this.e;
            dpuc dpucVar2 = this.g.e().b;
            if (dpucVar2 == null) {
                dpucVar2 = dpuc.c;
            }
            return bmdvVar.d(dpucVar2.b, "", true);
        }
        return null;
    }

    @Override // defpackage.aphr
    public jic e() {
        return this.j;
    }

    @Override // defpackage.aphr
    public cqkl f() {
        this.d.D(apdh.g(this.b, this.c.a(aoyj.g(this.g.a()))));
        return cqkl.a;
    }

    @Override // defpackage.aphr
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = dtyi.ad;
        b.i(this.i);
        return b.a();
    }
}

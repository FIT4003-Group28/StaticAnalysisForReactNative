package defpackage;
/* compiled from: PG */
/* renamed from: apir  reason: default package */
/* loaded from: classes2.dex */
public class apir implements aphr {
    static final cqtd b = cqrt.f(2131231038);
    public final aoxt a;
    private final bwqv c;
    private final gga d;
    private final int e;
    private final jic f;
    private final bmdv g;
    private final aphj h;
    private final bwrs<aoyg> i;
    private final bwrs<aoyg> j;

    public apir(bwqv bwqvVar, gga ggaVar, bmdv bmdvVar, aphj aphjVar, aoxt aoxtVar, int i, bwrs<aoyg> bwrsVar, bwrs<aoyg> bwrsVar2) {
        this.c = bwqvVar;
        this.d = ggaVar;
        this.g = bmdvVar;
        this.h = aphjVar;
        this.i = bwrsVar;
        this.j = bwrsVar2;
        this.a = aoxtVar;
        this.e = i;
        this.f = aphi.a(aoxtVar.a(), b);
    }

    private final int h() {
        aoyg c = this.j.c();
        dbsk.s(c);
        return dcbg.b(c.d()).o(new dbsl(this) { // from class: apiq
            private final apir a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                apir apirVar = this.a;
                dqdt dqdtVar = ((aoxt) obj).f().a;
                if (dqdtVar == null) {
                    dqdtVar = dqdt.b;
                }
                return dqdtVar.a.equals(bkkc.c(apirVar.a.a().ai()));
            }
        }).z().size();
    }

    @Override // defpackage.aphr
    public String a() {
        return this.a.a().n();
    }

    @Override // defpackage.aphr
    public Boolean b() {
        return Boolean.valueOf(h() > 0);
    }

    @Override // defpackage.aphr
    public CharSequence c() {
        return this.h.c(h(), 2);
    }

    @Override // defpackage.aphr
    public String d() {
        dpuc dpucVar = this.a.e().b;
        if (dpucVar == null) {
            dpucVar = dpuc.c;
        }
        if (dpucVar.b > 0) {
            bmdv bmdvVar = this.g;
            dpuc dpucVar2 = this.a.e().b;
            if (dpucVar2 == null) {
                dpucVar2 = dpuc.c;
            }
            return bmdvVar.d(dpucVar2.b, "", true);
        }
        return null;
    }

    @Override // defpackage.aphr
    public jic e() {
        return this.f;
    }

    @Override // defpackage.aphr
    public cqkl f() {
        this.d.D(aowf.g(this.c, bwrs.a(this.a), this.i, this.j));
        return cqkl.a;
    }

    @Override // defpackage.aphr
    public cjtd g() {
        cjta b2 = cjtd.b();
        b2.d = dtyi.ai;
        b2.i(this.e);
        return b2.a();
    }
}

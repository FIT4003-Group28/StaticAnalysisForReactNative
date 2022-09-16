package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cilu  reason: default package */
/* loaded from: classes4.dex */
public class cilu extends cibj implements cill, chyv {
    public final chrx a;
    public final chxl b;
    public dcep<String> c;
    public dcep<String> d;
    private chxp e;
    private dcdc<cinc> f;
    private final boolean g;
    private chyu h;

    public cilu(cqhn cqhnVar, cing cingVar, btvo btvoVar, chrx chrxVar, chxl chxlVar) {
        super(chxlVar);
        this.h = chyu.VISIBLE;
        this.a = chrxVar;
        this.b = chxlVar;
        dhpt dhptVar = btvoVar.getContributionsPageParameters().h;
        this.g = (dhptVar == null ? dhpt.w : dhptVar).r;
        chxp chxpVar = chxlVar.i;
        q(chxpVar == null ? chxp.k : chxpVar);
    }

    private final void q(chxp chxpVar) {
        int size;
        this.e = chxpVar;
        this.c = dcep.K(chxpVar.c);
        this.d = dcep.K(this.e.e);
        dccx G = dcdc.G(this.b.p.size());
        boolean p = dcbg.b(this.b.p).w(6).p(new dbsl(this) { // from class: cilr
            private final cilu a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dcep<String> dcepVar = this.a.c;
                dwfl dwflVar = ((dwmz) obj).b;
                if (dwflVar == null) {
                    dwflVar = dwfl.w;
                }
                return dcepVar.contains(dwflVar.q);
            }
        });
        boolean p2 = dcbg.b(this.b.p).w(5).p(new dbsl(this) { // from class: cils
            private final cilu a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dcep<String> dcepVar = this.a.d;
                dwfl dwflVar = ((dwmz) obj).b;
                if (dwflVar == null) {
                    dwflVar = dwfl.w;
                }
                return dcepVar.contains(dwflVar.q);
            }
        });
        if (!this.e.d && !p && (!this.g || !p2)) {
            size = Math.min(this.b.p.size(), 6);
        } else {
            size = this.b.p.size();
        }
        int i = 0;
        while (i < size) {
            Integer valueOf = Integer.valueOf(this.b.p.size() - i);
            dwmz dwmzVar = this.b.p.get(i);
            chrx chrxVar = this.a;
            dcep<String> dcepVar = this.c;
            dwfl dwflVar = dwmzVar.b;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            boolean contains = dcepVar.contains(dwflVar.q);
            dwlh dwlhVar = this.b.d;
            if (dwlhVar == null) {
                dwlhVar = dwlh.n;
            }
            String str = dwlhVar.c;
            Integer num = (i != size + (-1) || valueOf.intValue() <= 1) ? null : valueOf;
            boolean z = this.g;
            cing.a(chrxVar, 1);
            cing.a(this, 2);
            cing.a(dwmzVar, 3);
            cing.a(str, 5);
            G.g(new cinf(chrxVar, this, dwmzVar, contains, str, i, num, z));
            i++;
        }
        this.f = G.f();
    }

    @Override // defpackage.chyv
    public chyu a() {
        return this.h;
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.UNKNOWN;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    @Override // defpackage.cill
    public String e() {
        dwlh dwlhVar = this.b.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        return dwlhVar.c;
    }

    public boolean equals(@dzsi Object obj) {
        return cidc.a(this, obj, new cidd(this) { // from class: cilt
            private final cilu a;

            {
                this.a = this;
            }

            @Override // defpackage.cidd
            public final boolean a(Object obj2) {
                cilu ciluVar = this.a;
                cilu ciluVar2 = (cilu) obj2;
                chxr chxrVar = ciluVar.b.b;
                if (chxrVar == null) {
                    chxrVar = chxr.e;
                }
                chxr chxrVar2 = ciluVar2.b.b;
                if (chxrVar2 == null) {
                    chxrVar2 = chxr.e;
                }
                return dbsd.a(chxrVar, chxrVar2) && dbsd.a(ciluVar.c, ciluVar2.c);
            }
        });
    }

    @Override // defpackage.cill
    public List<cinc> f() {
        return this.f;
    }

    @Override // defpackage.cill
    public Integer g() {
        return Integer.valueOf(this.c.size());
    }

    @Override // defpackage.cill
    public Boolean h() {
        return Boolean.valueOf(!this.c.isEmpty());
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        chxr chxrVar = this.b.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        objArr[0] = chxrVar;
        objArr[1] = chxj.BULK_PHOTO_UPLOAD;
        objArr[2] = this.c;
        return Arrays.hashCode(objArr);
    }

    @Override // defpackage.cill
    public cqkl i() {
        this.h = chyu.COMPLETED;
        dcdc z = dcbg.b(this.b.p).o(new dbsl(this) { // from class: ciln
            private final cilu a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dcep<String> dcepVar = this.a.c;
                dwfl dwflVar = ((dwmz) obj).b;
                if (dwflVar == null) {
                    dwflVar = dwfl.w;
                }
                return dcepVar.contains(dwflVar.q);
            }
        }).z();
        chrx chrxVar = this.a;
        chxr chxrVar = this.b.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        chrxVar.O(chxrVar, z);
        return cqkl.a;
    }

    @Override // defpackage.cill
    public Boolean j() {
        return Boolean.valueOf(this.e.c.size() == 0);
    }

    @Override // defpackage.cill
    public cqkl k() {
        final dcbg s = dcbg.b(this.b.p).s(cilo.a);
        p(new dbrn(s) { // from class: cilp
            private final Iterable a;

            {
                this.a = s;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Iterable<String> iterable = this.a;
                chxp chxpVar = (chxp) obj;
                dsqp dsqpVar = (dsqp) chxpVar.cu(5);
                dsqpVar.bC(chxpVar);
                chxm chxmVar = (chxm) dsqpVar;
                if (chxmVar.c) {
                    chxmVar.bF();
                    chxmVar.c = false;
                }
                chxp chxpVar2 = chxp.k;
                ((chxp) chxmVar.b).c = dsqw.ck();
                chxmVar.a(iterable);
                return chxmVar.bK();
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.cill
    public Boolean l() {
        return Boolean.valueOf(this.e.c.size() > 0);
    }

    @Override // defpackage.cill
    public cqkl m() {
        p(cilq.a);
        return cqkl.a;
    }

    @Override // defpackage.cill
    public Boolean n() {
        return Boolean.valueOf(this.e.c.size() == 0);
    }

    @Override // defpackage.cill
    public cqkl o() {
        this.h = chyu.DISMISSED;
        chrx chrxVar = this.a;
        chxr chxrVar = this.b.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        chrxVar.P(chxrVar);
        return cqkl.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(dbrn<chxp, chxp> dbrnVar) {
        q(dbrnVar.a(this.e));
        chrx chrxVar = this.a;
        chxr chxrVar = this.b.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        chrxVar.Q(chxrVar, dbrnVar);
        cqkx.p(this);
    }
}

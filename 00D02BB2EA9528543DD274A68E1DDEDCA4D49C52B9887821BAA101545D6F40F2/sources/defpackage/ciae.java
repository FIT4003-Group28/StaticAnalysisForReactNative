package defpackage;
/* compiled from: PG */
/* renamed from: ciae  reason: default package */
/* loaded from: classes4.dex */
abstract class ciae extends cibj implements cicy {
    protected final chrx a;
    protected final chxl b;
    private final String c;

    public ciae(chrx chrxVar, chxl chxlVar, bmdv bmdvVar) {
        super(chxlVar);
        this.a = chrxVar;
        this.b = chxlVar;
        String str = "";
        if (!chxlVar.f.isEmpty()) {
            str = chxlVar.f;
        } else if (chxlVar.g.size() != 0) {
            str = bmdvVar.d(chxlVar.g.get(0).b, str, true);
        } else if (chxlVar.b == null) {
            chxr chxrVar = chxr.e;
        }
        this.c = str;
    }

    @Override // defpackage.cicy
    public String e() {
        dwlh dwlhVar = this.b.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        return dwlhVar.c;
    }

    public boolean equals(@dzsi Object obj) {
        return (obj instanceof ciae) && this.b.equals(((ciae) obj).b);
    }

    @Override // defpackage.cicy
    public String f() {
        dwlh dwlhVar = this.b.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dwle dwleVar = dwlhVar.e;
        if (dwleVar == null) {
            dwleVar = dwle.d;
        }
        return dwleVar.b;
    }

    @Override // defpackage.cicy
    public Boolean g() {
        return Boolean.valueOf(this.b.k > 0);
    }

    @Override // defpackage.cicy
    public Integer h() {
        chxl chxlVar = this.b;
        int i = chxlVar.k;
        if (i <= 0) {
            i = chxlVar.j;
        }
        return Integer.valueOf(i);
    }

    public int hashCode() {
        chxr chxrVar = this.b.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        int i = chxrVar.bC;
        if (i != 0) {
            return i;
        }
        int c = dsst.a.b(chxrVar).c(chxrVar);
        chxrVar.bC = c;
        return c;
    }

    @Override // defpackage.cicy
    public String i() {
        return this.c;
    }

    @Override // defpackage.cicy
    public cqkl j() {
        this.a.k(this.b);
        return cqkl.a;
    }

    @Override // defpackage.cicy
    public cqkl k() {
        this.a.l(this.b);
        return cqkl.a;
    }

    @Override // defpackage.cicy
    public cqkl l() {
        this.a.j(this.b);
        return cqkl.a;
    }

    @Override // defpackage.cicy
    public cqkl m() {
        throw null;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: cieg  reason: default package */
/* loaded from: classes4.dex */
class cieg implements ciec {
    private final chrx a;
    private final djao b;
    private final chxl c;
    private final cieb d;

    public cieg(chrx chrxVar, djao djaoVar, chxl chxlVar, ciej ciejVar) {
        this.a = chrxVar;
        this.b = djaoVar;
        this.c = chxlVar;
        djam djamVar = djaoVar.b;
        djag djagVar = (djamVar == null ? djam.m : djamVar).c;
        djagVar = djagVar == null ? djag.d : djagVar;
        ciej.a(chxlVar, 1);
        ciej.a(djagVar, 2);
        gga a = ciejVar.a.a();
        ciej.a(a, 3);
        this.d = new cief(chxlVar, djagVar, a);
    }

    @Override // defpackage.ciec
    public cieb a() {
        return this.d;
    }

    @Override // defpackage.ciec
    public CharSequence b() {
        djam djamVar = this.b.b;
        if (djamVar == null) {
            djamVar = djam.m;
        }
        return djamVar.d;
    }

    @Override // defpackage.ciec
    public CharSequence c() {
        djam djamVar = this.b.b;
        if (djamVar == null) {
            djamVar = djam.m;
        }
        return djamVar.i;
    }

    @Override // defpackage.ciec
    public Integer d() {
        return Integer.valueOf(this.b.d);
    }

    @Override // defpackage.ciec
    public cqkl e() {
        chrx chrxVar = this.a;
        chxr chxrVar = this.c.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        chrxVar.A(chxrVar, this.b);
        return cqkl.a;
    }

    @Override // defpackage.ciec
    public cqkl f() {
        this.a.r(this.c, this.b, false);
        return cqkl.a;
    }

    @Override // defpackage.ciec
    public cqkl g() {
        this.a.r(this.c, this.b, true);
        return cqkl.a;
    }

    @Override // defpackage.ciec
    public cqkl h() {
        this.a.B(this.b);
        return cqkl.a;
    }

    @Override // defpackage.ciec
    public cjtd i(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.g(this.c.c);
        chxr chxrVar = this.c.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        b.g = decs.a(akqi.b(chxrVar.b == 1 ? (String) chxrVar.c : "").c);
        return b.a();
    }
}

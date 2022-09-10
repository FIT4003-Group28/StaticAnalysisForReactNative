package defpackage;
/* compiled from: PG */
/* renamed from: ayne  reason: default package */
/* loaded from: classes3.dex */
public class ayne implements ayml {
    public final aypi a;
    private final gga b;
    private final akfa c;
    private final bwrs<baad> d;
    private final akfc e;

    public ayne(gga ggaVar, akfa akfaVar, akfc akfcVar, bwrs bwrsVar, aypi aypiVar) {
        this.b = ggaVar;
        this.c = akfaVar;
        this.e = akfcVar;
        this.d = bwrsVar;
        this.a = aypiVar;
    }

    @dzsi
    private final String k(dbrn<btlu, String> dbrnVar) {
        btlu j = this.c.j();
        if (j != null && btlu.i(j) == btlt.GOOGLE) {
            return dbrnVar.a(j);
        }
        return null;
    }

    private final baad l() {
        baad c = this.d.c();
        dbsk.s(c);
        return c;
    }

    @Override // defpackage.ayml
    public cqkl a() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.ayml
    public cqkl b() {
        this.e.k(new aynd(this), null);
        return cqkl.a;
    }

    @Override // defpackage.ayml
    public cqkl c() {
        this.a.a.aT();
        return cqkl.a;
    }

    @Override // defpackage.ayml
    public String d() {
        return l().E(this.b.getApplicationContext());
    }

    @Override // defpackage.ayml
    public String e() {
        return l().O();
    }

    @Override // defpackage.ayml
    public jic f() {
        return new jic(l().N().c, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998);
    }

    @Override // defpackage.ayml
    public Boolean g() {
        return Boolean.valueOf(l().x());
    }

    @Override // defpackage.ayml
    @dzsi
    public String h() {
        return k(ayna.a);
    }

    @Override // defpackage.ayml
    @dzsi
    public String i() {
        return k(aynb.a);
    }

    @Override // defpackage.ayml
    public jic j() {
        return new jic(k(aync.a), ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: akfu  reason: default package */
/* loaded from: classes2.dex */
public class akfu implements akfz {
    private final gga a;
    private final akft b;
    private final boolean c;
    private boolean d;
    private final int e;
    private final int f;
    @dzsi
    private final cjtd g;
    @dzsi
    private final cjtd h;

    public akfu(gga ggaVar, cqhn cqhnVar, akft akftVar, boolean z, int i, int i2, @dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2) {
        this.a = ggaVar;
        this.b = akftVar;
        this.c = z;
        this.e = i;
        this.f = i2;
        this.g = cjtdVar;
        this.h = cjtdVar2;
    }

    public void e(Boolean bool) {
        this.d = bool.booleanValue();
        cqkx.p(this);
    }

    @Override // defpackage.akfz
    public Boolean f() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.akfz
    public Boolean g() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.akfz
    public cqkl h() {
        this.b.q();
        return cqkl.a;
    }

    @Override // defpackage.akfz
    public cqkl i() {
        this.b.w();
        return cqkl.a;
    }

    @Override // defpackage.akfz
    public CharSequence j() {
        return this.a.getString(this.e);
    }

    @Override // defpackage.akfz
    public CharSequence k() {
        return this.a.getString(this.f);
    }

    @Override // defpackage.akfz
    @dzsi
    public cjtd l() {
        return this.g;
    }

    @Override // defpackage.akfz
    @dzsi
    public cjtd m() {
        return this.h;
    }
}

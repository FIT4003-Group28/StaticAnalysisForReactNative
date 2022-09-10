package defpackage;
/* compiled from: PG */
/* renamed from: ciqz  reason: default package */
/* loaded from: classes4.dex */
public final class ciqz implements chmj, chmr {
    private final jic a;
    @dzsi
    private final chmi b;
    @dzsi
    private final cqix<? extends cqkp> c;
    private final CharSequence d;
    private final cjtd e;

    public ciqz(cchz cchzVar, dxio<chjx> dxioVar, chiu chiuVar, @dzsi cqix<? extends cqkp> cqixVar, int i, CharSequence charSequence, boolean z, boolean z2, cjtd cjtdVar) {
        ccih l = cchzVar.d().l();
        dbsk.s(l);
        this.a = chiuVar.a(l.b());
        this.b = (!z || i == 0) ? null : dxioVar.a().a(i, !z2);
        this.c = cqixVar;
        this.d = charSequence;
        this.e = cjtdVar;
    }

    @Override // defpackage.chmj
    /* renamed from: a */
    public dcdc<chml> h() {
        return dcdc.e();
    }

    @Override // defpackage.chlz
    public chmr b() {
        return this;
    }

    @Override // defpackage.chmj
    public CharSequence c() {
        return this.d;
    }

    @Override // defpackage.chmj
    @dzsi
    public chmi d() {
        return this.b;
    }

    public int hashCode() {
        return ciqz.class.hashCode();
    }

    @Override // defpackage.chmj
    public String i() {
        return "";
    }

    @Override // defpackage.chmj
    public jic j() {
        return this.a;
    }

    @Override // defpackage.chmj
    @dzsi
    public jic k() {
        return null;
    }

    @Override // defpackage.chmj
    public cjtd l() {
        return this.e;
    }

    @Override // defpackage.chmr
    public void q(cqiv cqivVar) {
        cqix<? extends cqkp> cqixVar = this.c;
        if (cqixVar != null) {
            cqivVar.e(cqixVar);
        }
    }
}

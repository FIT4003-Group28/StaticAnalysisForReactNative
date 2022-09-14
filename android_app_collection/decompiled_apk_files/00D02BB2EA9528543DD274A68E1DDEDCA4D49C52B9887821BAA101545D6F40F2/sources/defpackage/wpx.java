package defpackage;
/* compiled from: PG */
/* renamed from: wpx  reason: default package */
/* loaded from: classes7.dex */
public class wpx implements jad {
    private final eaow a;
    private final boolean b;
    private final mw<eaow> c;

    public wpx(eaow eaowVar, boolean z, mw<eaow> mwVar) {
        this.a = eaowVar;
        this.b = z;
        this.c = mwVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(!this.b);
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.c.a(this.a);
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtyc.bX);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        long f = this.a.f();
        StringBuilder sb = new StringBuilder(32);
        sb.append(f);
        sb.append(" mins before");
        return sb.toString();
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }
}

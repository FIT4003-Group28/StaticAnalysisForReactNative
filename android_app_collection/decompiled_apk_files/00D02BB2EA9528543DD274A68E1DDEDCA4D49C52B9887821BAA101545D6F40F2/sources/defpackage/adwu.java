package defpackage;
/* compiled from: PG */
/* renamed from: adwu  reason: default package */
/* loaded from: classes2.dex */
public class adwu implements advr {
    private final axne a;

    public adwu(cqhn cqhnVar, axne axneVar) {
        this.a = axneVar;
        cqkx.j(axneVar, new cqhm(this) { // from class: adwt
            private final adwu a;

            {
                this.a = this;
            }

            @Override // defpackage.cqhm
            public final void a() {
                cqkx.p(this.a);
            }
        });
    }

    @Override // defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(!this.a.j().booleanValue());
    }

    @Override // defpackage.advr
    public CharSequence b() {
        return this.a.b();
    }

    @Override // defpackage.jad
    public cqkl c() {
        return this.a.c();
    }

    @Override // defpackage.jad
    public cjtd d() {
        return this.a.d();
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.e();
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

    @Override // defpackage.advr, defpackage.jad
    public cqtd i() {
        return this.a.n();
    }

    @Override // defpackage.advr
    public Boolean j() {
        return this.a.k();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: adwf  reason: default package */
/* loaded from: classes2.dex */
public class adwf implements advr {
    private final bfco a;

    public adwf(cqhn cqhnVar, bfco bfcoVar) {
        this.a = bfcoVar;
        cqkx.j(bfcoVar, new cqhm(this) { // from class: adwe
            private final adwf a;

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
        return Boolean.valueOf(!this.a.m().booleanValue());
    }

    @Override // defpackage.advr
    public CharSequence b() {
        return this.a.k();
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
        return false;
    }

    public boolean k() {
        return this.a.a().booleanValue();
    }
}

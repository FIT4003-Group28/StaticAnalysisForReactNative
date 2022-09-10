package defpackage;
/* compiled from: PG */
/* renamed from: ozg  reason: default package */
/* loaded from: classes7.dex */
public class ozg extends bllj {
    private final cjzt a;
    private final dtol b;

    public ozg(cjzt cjztVar, dtol dtolVar) {
        this.a = cjztVar;
        this.b = dtolVar;
    }

    @Override // defpackage.bllj, defpackage.jax
    public CharSequence b() {
        dtol dtolVar = this.b;
        return (dtolVar.a & 2) != 0 ? dtolVar.c : "";
    }

    @Override // defpackage.bllj, defpackage.jax
    public CharSequence f() {
        dtol dtolVar = this.b;
        return (dtolVar.a & 16) != 0 ? dtolVar.f : "";
    }

    @Override // defpackage.bllj, defpackage.jax
    public jic k() {
        dtkq dtkqVar = this.b.b;
        if (dtkqVar == null) {
            dtkqVar = dtkq.f;
        }
        return owy.e(dtkqVar, 2131232077);
    }

    @Override // defpackage.bllj, defpackage.jax
    public cjtd s() {
        cjta cjtaVar = new cjta();
        cjtaVar.b = this.a.b;
        cjtaVar.g(this.b.n);
        dvnp dvnpVar = this.a.e;
        if (dvnpVar != null) {
            cjtaVar.f = dvnpVar;
        }
        return cjtaVar.a();
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqss u() {
        return ire.n();
    }
}

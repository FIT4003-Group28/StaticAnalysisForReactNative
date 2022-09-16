package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: ahzd  reason: default package */
/* loaded from: classes.dex */
public final class ahzd implements ahyo {
    public final ahyp a;
    public final aibg b;
    private final airr c;
    private final yni d;
    private final aizn e;

    public ahzd(airr airrVar, yni yniVar, aizn aiznVar, ahyp ahypVar, aibg aibgVar) {
        this.c = airrVar;
        this.d = yniVar;
        this.e = aiznVar;
        this.a = ahypVar;
        this.b = aibgVar;
    }

    @Override // defpackage.ahyo
    public final void c() {
        this.c.C(new ahzc(this));
    }

    @Override // defpackage.ahyo
    public final void d() {
        this.d.f(new ahhv(false));
    }

    @Override // defpackage.ahyo
    public final void e() {
        this.e.c();
    }

    @Override // defpackage.ahyo
    public final void f() {
        this.e.d();
    }

    @Override // defpackage.ahyo
    public final void k() {
    }

    @Override // defpackage.ahyo
    public final void l() {
        this.e.g(-10000L);
    }

    @Override // defpackage.ahyo
    public final void m() {
        this.e.g(10000L);
    }

    @Override // defpackage.ahyo
    public final void n() {
        this.a.ny();
        this.e.e();
    }

    @Override // defpackage.ahyo
    public final void o() {
        this.e.f();
    }

    @Override // defpackage.ahyo
    public final void p(long j) {
    }

    @Override // defpackage.ahyo
    public final void q() {
    }

    @Override // defpackage.ahyo
    public final void r(long j) {
        this.e.i(j);
    }

    @Override // defpackage.ahyo
    public final void u() {
        this.d.f(new ahhv(true));
    }

    @Override // defpackage.ahyo
    public final void v(boolean z) {
        aizn aiznVar = this.e;
        aiznVar.b.b();
        ((aizl) aiznVar.a.get()).E(z);
    }
}

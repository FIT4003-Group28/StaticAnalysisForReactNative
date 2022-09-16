package defpackage;
/* compiled from: PG */
/* renamed from: agcg  reason: default package */
/* loaded from: classes.dex */
public final class agcg implements akae, agcd {
    private final ajwb a;
    private final agce b;
    private boolean c;
    private boolean d;

    public agcg(ajwb ajwbVar, agca agcaVar) {
        this.a = ajwbVar;
        this.b = new agce(ajwbVar, agcaVar, this);
    }

    private final void f() {
        ajfz U;
        if (this.c && (U = this.a.U(ajfy.INVALIDATION)) != null) {
            this.b.b(U);
        }
    }

    private final void g() {
        this.b.c();
    }

    @Override // defpackage.akae
    public final void a() {
        this.c = true;
        f();
    }

    @Override // defpackage.akae
    public final void b() {
    }

    @Override // defpackage.akae
    public final void c(aakw aakwVar, boolean z) {
        f();
    }

    @Override // defpackage.akae
    public final void d() {
        this.d = true;
        this.c = false;
        g();
    }

    @Override // defpackage.akae
    public final void e() {
        this.c = false;
        g();
    }

    @Override // defpackage.agcd
    public final void h(ajfz ajfzVar) {
        if (this.d) {
            return;
        }
        this.a.ll();
    }
}

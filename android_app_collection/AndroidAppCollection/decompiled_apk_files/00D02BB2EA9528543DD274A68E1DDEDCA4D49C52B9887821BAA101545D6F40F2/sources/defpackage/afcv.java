package defpackage;
/* compiled from: PG */
/* renamed from: afcv  reason: default package */
/* loaded from: classes.dex */
final class afcv implements cpcf<Void> {
    final /* synthetic */ boolean a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ afdd d;

    public afcv(afdd afddVar, boolean z, Runnable runnable, Runnable runnable2) {
        this.d = afddVar;
        this.a = z;
        this.b = runnable;
        this.c = runnable2;
    }

    @Override // defpackage.cpcf
    public final void a(cpcq<Void> cpcqVar) {
        if (cpcqVar.b()) {
            dcqe dcqeVar = afdd.k;
            this.d.t.q();
            ((ckco) this.d.q.a().a(ckfn.r)).a(this.a ? afez.a(1) : afez.a(3));
            this.b.run();
            return;
        }
        ((ckco) this.d.q.a().a(ckfn.n)).a(afed.a(8));
        ((ckco) this.d.q.a().a(ckfn.r)).a(this.a ? afez.a(2) : afez.a(4));
        Exception e = cpcqVar.e();
        if (e == null) {
            bvoo.h("ULR privateModeToggle failed without exception", new Object[0]);
        } else {
            bvoo.i(new RuntimeException(e));
        }
        afdd afddVar = this.d;
        afddVar.p.a().j().m();
        afddVar.p();
        this.c.run();
    }
}

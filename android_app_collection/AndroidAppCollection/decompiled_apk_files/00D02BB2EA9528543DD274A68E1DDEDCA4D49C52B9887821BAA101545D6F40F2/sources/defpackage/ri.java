package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ri  reason: default package */
/* loaded from: classes.dex */
public final class ri implements Runnable {
    final /* synthetic */ rv a;

    public ri(rv rvVar) {
        this.a = rvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rv rvVar = this.a;
        rvVar.o.showAtLocation(rvVar.n, 55, 0, 0);
        this.a.B();
        if (this.a.A()) {
            this.a.n.setAlpha(0.0f);
            rv rvVar2 = this.a;
            oi B = od.B(rvVar2.n);
            B.b(1.0f);
            rvVar2.q = B;
            this.a.q.f(new rh(this));
            return;
        }
        this.a.n.setAlpha(1.0f);
        this.a.n.setVisibility(0);
    }
}

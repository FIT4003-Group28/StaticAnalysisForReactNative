package defpackage;
/* compiled from: PG */
/* renamed from: aemo  reason: default package */
/* loaded from: classes.dex */
public final class aemo implements ankb {
    private agp a;

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        this.a.d(th);
    }

    public final String c(agp agpVar) {
        this.a = agpVar;
        return "Onesie init segment future.";
    }

    public final void d() {
        this.a.b();
    }

    @Override // defpackage.ankb
    /* renamed from: e */
    public final void b(aemd aemdVar) {
        if (aemdVar != null) {
            this.a.c(aemdVar);
        }
        this.a.d(new NullPointerException());
    }
}

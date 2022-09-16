package defpackage;
/* compiled from: PG */
/* renamed from: ruj  reason: default package */
/* loaded from: classes4.dex */
final class ruj implements Runnable {
    final /* synthetic */ rve a;
    final /* synthetic */ ruk b;

    public ruj(ruk rukVar, rve rveVar) {
        this.b = rukVar;
        this.a = rveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((rvj) this.a).d) {
            this.b.b.u();
            return;
        }
        try {
            this.b.b.t(this.b.a.a(this.a));
        } catch (rvc e) {
            if (e.getCause() instanceof Exception) {
                this.b.b.s((Exception) e.getCause());
            } else {
                this.b.b.s(e);
            }
        } catch (Exception e2) {
            this.b.b.s(e2);
        }
    }
}

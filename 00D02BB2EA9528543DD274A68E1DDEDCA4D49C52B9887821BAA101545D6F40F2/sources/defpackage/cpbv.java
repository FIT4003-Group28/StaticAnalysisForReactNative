package defpackage;
/* compiled from: PG */
/* renamed from: cpbv  reason: default package */
/* loaded from: classes5.dex */
final class cpbv implements Runnable {
    final /* synthetic */ cpcq a;
    final /* synthetic */ cpbw b;

    public cpbv(cpbw cpbwVar, cpcq cpcqVar) {
        this.b = cpbwVar;
        this.a = cpcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((cpcx) this.a).d) {
            this.b.b.x();
            return;
        }
        try {
            this.b.b.t(this.b.a.a(this.a));
        } catch (cpco e) {
            if (e.getCause() instanceof Exception) {
                this.b.b.u((Exception) e.getCause());
            } else {
                this.b.b.u(e);
            }
        } catch (Exception e2) {
            this.b.b.u(e2);
        }
    }
}

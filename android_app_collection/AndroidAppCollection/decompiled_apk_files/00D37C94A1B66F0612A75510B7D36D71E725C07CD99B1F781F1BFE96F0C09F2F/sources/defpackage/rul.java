package defpackage;
/* compiled from: PG */
/* renamed from: rul  reason: default package */
/* loaded from: classes4.dex */
final class rul implements Runnable {
    final /* synthetic */ rve a;
    final /* synthetic */ rum b;

    public rul(rum rumVar, rve rveVar) {
        this.b = rumVar;
        this.a = rveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            rve rveVar = (rve) this.b.a.a(this.a);
            if (rveVar == null) {
                this.b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            rveVar.p(rvi.b, this.b);
            rveVar.o(rvi.b, this.b);
            rveVar.l(rvi.b, this.b);
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

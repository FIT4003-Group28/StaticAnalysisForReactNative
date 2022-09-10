package defpackage;
/* compiled from: PG */
/* renamed from: cpbx  reason: default package */
/* loaded from: classes5.dex */
final class cpbx implements Runnable {
    final /* synthetic */ cpcq a;
    final /* synthetic */ cpby b;

    public cpbx(cpby cpbyVar, cpcq cpcqVar) {
        this.b = cpbyVar;
        this.a = cpcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            cpcq cpcqVar = (cpcq) this.b.a.a(this.a);
            if (cpcqVar == null) {
                this.b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            cpcqVar.p(cpcw.b, this.b);
            cpcqVar.o(cpcw.b, this.b);
            cpcqVar.l(cpcw.b, this.b);
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

package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: rva  reason: default package */
/* loaded from: classes4.dex */
final class rva implements Runnable {
    final /* synthetic */ rve a;
    final /* synthetic */ rvb b;

    public rva(rvb rvbVar, rve rveVar) {
        this.b = rvbVar;
        this.a = rveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            rve a = this.b.a.a(this.a.g());
            a.p(rvi.b, this.b);
            a.o(rvi.b, this.b);
            a.l(rvi.b, this.b);
        } catch (CancellationException unused) {
            this.b.b();
        } catch (rvc e) {
            if (e.getCause() instanceof Exception) {
                this.b.c((Exception) e.getCause());
            } else {
                this.b.c(e);
            }
        } catch (Exception e2) {
            this.b.c(e2);
        }
    }
}

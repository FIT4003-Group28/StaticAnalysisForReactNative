package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: cpcm  reason: default package */
/* loaded from: classes5.dex */
final class cpcm implements Runnable {
    final /* synthetic */ cpcq a;
    final /* synthetic */ cpcn b;

    public cpcm(cpcn cpcnVar, cpcq cpcqVar) {
        this.b = cpcnVar;
        this.a = cpcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            cpcq a = this.b.a.a(this.a.d());
            if (a == null) {
                this.b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            a.p(cpcw.b, this.b);
            a.o(cpcw.b, this.b);
            a.l(cpcw.b, this.b);
        } catch (cpco e) {
            if (e.getCause() instanceof Exception) {
                this.b.d((Exception) e.getCause());
            } else {
                this.b.d(e);
            }
        } catch (CancellationException unused) {
            this.b.e();
        } catch (Exception e2) {
            this.b.d(e2);
        }
    }
}

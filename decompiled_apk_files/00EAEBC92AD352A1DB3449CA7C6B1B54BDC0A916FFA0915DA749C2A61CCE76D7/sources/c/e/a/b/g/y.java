package c.e.a.b.g;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
final class y implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f4654b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ x f4655c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(x xVar, h hVar) {
        this.f4655c = xVar;
        this.f4654b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        try {
            gVar = this.f4655c.f4652b;
            h a2 = gVar.a(this.f4654b.b());
            if (a2 == null) {
                this.f4655c.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a2.a(j.f4611b, (e) this.f4655c);
            a2.a(j.f4611b, (d) this.f4655c);
            a2.a(j.f4611b, (b) this.f4655c);
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4655c.a((Exception) e2.getCause());
            } else {
                this.f4655c.a((Exception) e2);
            }
        } catch (CancellationException unused) {
            this.f4655c.a();
        } catch (Exception e3) {
            this.f4655c.a(e3);
        }
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aemp  reason: default package */
/* loaded from: classes.dex */
public final class aemp {
    final /* synthetic */ aems a;
    private ori b = null;
    private long c = 0;

    public aemp(aems aemsVar) {
        this.a = aemsVar;
    }

    public final synchronized void a(ori oriVar) {
        this.b = oriVar;
        this.c = this.a.n.d();
    }

    public final synchronized void b() {
        this.b = null;
        this.c = 0L;
        notifyAll();
    }

    public final synchronized void c(String str) {
        long d = this.a.n.d();
        long j = this.a.p.f;
        long j2 = d - this.c;
        ori oriVar = this.b;
        if (oriVar != null && j2 < j) {
            if (!oriVar.b.equals(str)) {
                return;
            }
            while (this.b != null) {
                try {
                    long j3 = j - (d - this.c);
                    if (j3 <= 0) {
                        break;
                    }
                    wait(j3);
                    d = this.a.n.d();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.b = null;
                    this.c = 0L;
                    return;
                }
            }
            this.b = null;
            this.c = 0L;
        }
    }
}

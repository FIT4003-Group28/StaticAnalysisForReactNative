package defpackage;
/* compiled from: PG */
/* renamed from: byct  reason: default package */
/* loaded from: classes4.dex */
final class byct {
    boolean a = false;
    boolean b = false;
    private final cqat c;
    private final long d;

    public byct(cqat cqatVar, long j) {
        this.c = cqatVar;
        this.d = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(boolean z) {
        if (!this.b) {
            this.b = true;
            this.a = z;
        }
        notify();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b() {
        long e = this.c.e();
        while (!this.b) {
            long e2 = (this.d + e) - this.c.e();
            if (e2 <= 0) {
                this.b = true;
            } else {
                try {
                    wait(e2);
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.a;
    }
}

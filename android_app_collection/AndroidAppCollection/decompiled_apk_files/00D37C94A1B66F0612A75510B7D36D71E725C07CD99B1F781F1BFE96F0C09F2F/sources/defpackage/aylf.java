package defpackage;
/* compiled from: PG */
/* renamed from: aylf  reason: default package */
/* loaded from: classes2.dex */
final class aylf extends azqj {
    long a;
    final /* synthetic */ aylv b;
    private final aylt c;

    public aylf(aylv aylvVar, aylt ayltVar) {
        this.b = aylvVar;
        this.c = ayltVar;
    }

    @Override // defpackage.azqj
    public final void k(long j) {
        if (this.b.r.f != null) {
            return;
        }
        synchronized (this.b.l) {
            if (this.b.r.f == null) {
                aylt ayltVar = this.c;
                if (!ayltVar.b) {
                    long j2 = this.a + j;
                    this.a = j2;
                    aylv aylvVar = this.b;
                    long j3 = aylvVar.t;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > aylvVar.n) {
                        ayltVar.c = true;
                    } else {
                        long a = aylvVar.m.a(j2 - j3);
                        aylv aylvVar2 = this.b;
                        aylvVar2.t = this.a;
                        if (a > aylvVar2.o) {
                            this.c.c = true;
                        }
                    }
                    aylt ayltVar2 = this.c;
                    Runnable q = ayltVar2.c ? this.b.q(ayltVar2) : null;
                    if (q == null) {
                        return;
                    }
                    q.run();
                }
            }
        }
    }
}

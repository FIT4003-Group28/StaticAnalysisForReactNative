package defpackage;
/* compiled from: PG */
/* renamed from: dfcr  reason: default package */
/* loaded from: classes6.dex */
final class dfcr extends dyfe {
    private final Object a = new Object();
    private long b;
    private long c;
    private final dfcq d;

    public dfcr(dfcq dfcqVar) {
        this.d = dfcqVar;
    }

    @Override // defpackage.dyje
    public final void b(long j) {
        synchronized (this.a) {
            this.b += j;
        }
    }

    @Override // defpackage.dyje
    public final void c(long j) {
        synchronized (this.a) {
            this.c += j;
        }
    }

    @Override // defpackage.dyje
    public final void d() {
        synchronized (this.a) {
            dfcq dfcqVar = this.d;
            long j = this.b;
            boolean z = true;
            dbsk.b(j >= 0, "Cannot record negative request bytes.");
            dfcqVar.j.add(Long.valueOf(j));
            dfcq dfcqVar2 = this.d;
            long j2 = this.c;
            if (j2 < 0) {
                z = false;
            }
            dbsk.b(z, "Cannot record negative response bytes.");
            dfcqVar2.k.add(Long.valueOf(j2));
        }
    }
}

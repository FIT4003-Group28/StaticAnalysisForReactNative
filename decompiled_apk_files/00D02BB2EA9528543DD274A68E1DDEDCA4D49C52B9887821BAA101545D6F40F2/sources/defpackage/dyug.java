package defpackage;
/* compiled from: PG */
/* renamed from: dyug  reason: default package */
/* loaded from: classes6.dex */
final class dyug extends dyfe {
    long a;
    final /* synthetic */ dyut b;
    private final dyur c;

    public dyug(dyut dyutVar, dyur dyurVar) {
        this.b = dyutVar;
        this.c = dyurVar;
    }

    @Override // defpackage.dyje
    public final void b(long j) {
        if (this.b.t.f != null) {
            return;
        }
        synchronized (this.b.n) {
            if (this.b.t.f == null) {
                dyur dyurVar = this.c;
                if (!dyurVar.b) {
                    long j2 = this.a + j;
                    this.a = j2;
                    dyut dyutVar = this.b;
                    long j3 = dyutVar.v;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > dyutVar.p) {
                        dyurVar.c = true;
                    } else {
                        long a = dyutVar.o.a(j2 - j3);
                        dyut dyutVar2 = this.b;
                        dyutVar2.v = this.a;
                        if (a > dyutVar2.q) {
                            this.c.c = true;
                        }
                    }
                    dyur dyurVar2 = this.c;
                    Runnable r = dyurVar2.c ? this.b.r(dyurVar2) : null;
                    if (r == null) {
                        return;
                    }
                    r.run();
                }
            }
        }
    }
}

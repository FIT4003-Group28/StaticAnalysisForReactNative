package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: roy  reason: default package */
/* loaded from: classes4.dex */
public final class roy {
    protected long a;
    protected long b;
    public final rjv c;
    final /* synthetic */ rpa d;

    public roy(rpa rpaVar) {
        this.d = rpaVar;
        this.c = new rox(this, rpaVar.w);
        rpaVar.Q();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        this.b = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j) {
        long j2 = this.b;
        this.b = j;
        return j - j2;
    }

    public final boolean b(boolean z, boolean z2, long j) {
        this.d.n();
        this.d.a();
        axsw.b();
        if (!this.d.J().o(rkg.ak)) {
            rlc rlcVar = this.d.M().n;
            this.d.Q();
            rlcVar.b(System.currentTimeMillis());
        } else if (this.d.w.w()) {
            rlc rlcVar2 = this.d.M().n;
            this.d.Q();
            rlcVar2.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = a(j);
            }
            this.d.aG().k.b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            rps.E(this.d.k().o(!this.d.J().r()), bundle, true);
            if (!this.d.J().o(rkg.U) && z2) {
                bundle.putLong("_fr", 1L);
            }
            if (!this.d.J().o(rkg.U) || !z2) {
                this.d.j().u("auto", "_e", bundle);
            }
            this.a = j;
            this.c.a();
            this.c.c(3600000L);
            return true;
        }
        this.d.aG().k.b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.c.a();
    }
}

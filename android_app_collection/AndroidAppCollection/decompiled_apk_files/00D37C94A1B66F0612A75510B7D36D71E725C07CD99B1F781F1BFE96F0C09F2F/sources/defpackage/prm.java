package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: prm  reason: default package */
/* loaded from: classes4.dex */
public final class prm extends pkt {
    private static final Object a = new Object();
    private final long b;
    private final long d;
    private final boolean e;
    private final pjc f;
    private final pja g;

    static {
        pix pixVar = new pix();
        pixVar.b("SinglePeriodTimeline");
        pixVar.a = Uri.EMPTY;
        pixVar.a();
    }

    public prm(long j, boolean z, boolean z2, pjc pjcVar) {
        pja pjaVar = z2 ? pjcVar.c : null;
        this.b = j;
        this.d = j;
        this.e = z;
        ptx.a(pjcVar);
        this.f = pjcVar;
        this.g = pjaVar;
    }

    @Override // defpackage.pkt
    public final int b(Object obj) {
        return a.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.pkt
    public final pkr e(int i, pkr pkrVar, boolean z) {
        ptx.g(i, 1);
        pkrVar.i(null, z ? a : null, this.b, 0L);
        return pkrVar;
    }

    @Override // defpackage.pkt
    public final pks g(int i, pks pksVar, long j) {
        ptx.g(i, 1);
        pksVar.e(pks.a, this.f, -9223372036854775807L, -9223372036854775807L, this.e, false, this.g, 0L, this.d, 0L);
        return pksVar;
    }

    @Override // defpackage.pkt
    public final Object j(int i) {
        ptx.g(i, 1);
        return a;
    }

    @Override // defpackage.pkt
    public final int p() {
        return 1;
    }

    @Override // defpackage.pkt
    public final int q() {
        return 1;
    }
}

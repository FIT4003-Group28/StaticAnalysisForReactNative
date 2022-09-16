package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: afgh  reason: default package */
/* loaded from: classes.dex */
public final class afgh extends afgc {
    public boolean d;
    public long e;
    private long f;

    public afgh(ovk ovkVar, afga afgaVar, int i, Handler handler, ovi oviVar, int i2, int i3, owy owyVar, boolean z) {
        super(ovkVar, afgaVar, i, handler, oviVar, i2, i3, owyVar);
        this.d = z;
    }

    @Override // defpackage.afgc, defpackage.ovj, defpackage.ouh
    public final int b(int i, long j, oue oueVar, oug ougVar) {
        if (this.d) {
            long a = this.a.a();
            if (this.a.h((-30000) + j) && this.f <= 0) {
                this.e += this.a.a() - a;
            }
        }
        int b = super.b(i, j, oueVar, ougVar);
        long j2 = this.f;
        if (j2 > 0 && ougVar != null && ougVar.e >= j2) {
            this.f = 0L;
        }
        return b;
    }

    @Override // defpackage.ovj, defpackage.ouh
    public final void k(long j) {
        this.f = j;
        super.k(j);
    }
}

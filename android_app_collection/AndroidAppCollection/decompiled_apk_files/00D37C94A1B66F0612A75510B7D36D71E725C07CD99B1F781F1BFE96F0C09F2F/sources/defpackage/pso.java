package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: pso  reason: default package */
/* loaded from: classes4.dex */
public abstract class pso extends pmz implements psk {
    private psk a;
    private long b;

    @Override // defpackage.psk
    public final int a() {
        psk pskVar = this.a;
        ptx.a(pskVar);
        return pskVar.a();
    }

    @Override // defpackage.psk
    public final int b(long j) {
        psk pskVar = this.a;
        ptx.a(pskVar);
        return pskVar.b(j - this.b);
    }

    @Override // defpackage.psk
    public final long c(int i) {
        psk pskVar = this.a;
        ptx.a(pskVar);
        return pskVar.c(i) + this.b;
    }

    @Override // defpackage.pmo
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // defpackage.psk
    public final List d(long j) {
        psk pskVar = this.a;
        ptx.a(pskVar);
        return pskVar.d(j - this.b);
    }

    public final void e(long j, psk pskVar, long j2) {
        this.timeUs = j;
        this.a = pskVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.b = j;
    }
}

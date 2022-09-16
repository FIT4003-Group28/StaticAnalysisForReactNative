package defpackage;
/* compiled from: PG */
/* renamed from: pch  reason: default package */
/* loaded from: classes4.dex */
public final class pch implements oye {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ pci c;

    public pch(pci pciVar, long j, long j2) {
        this.c = pciVar;
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.oye
    public final long b(long j) {
        return this.b + this.c.b[pcx.s(this.c.a, (j * this.a) / 1000000, true)];
    }

    @Override // defpackage.oye
    public final boolean c() {
        return true;
    }
}

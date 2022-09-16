package defpackage;
/* compiled from: PG */
/* renamed from: avc  reason: default package */
/* loaded from: classes2.dex */
public final class avc implements avb {
    private final ayy a;
    private final long b;

    public avc(ayy ayyVar, long j) {
        this.a = ayyVar;
        this.b = j;
    }

    @Override // defpackage.avb
    public final long a(long j, long j2) {
        return this.a.d[(int) j];
    }

    @Override // defpackage.avb
    public final long b(long j) {
        return this.a.e[(int) j] - this.b;
    }

    @Override // defpackage.avb
    public final avf c(long j) {
        ayy ayyVar = this.a;
        int i = (int) j;
        return new avf(null, ayyVar.c[i], ayyVar.b[i]);
    }

    @Override // defpackage.avb
    public final void d() {
    }

    @Override // defpackage.avb
    public final long e() {
        return this.a.a;
    }

    @Override // defpackage.avb
    public final long f(long j) {
        return this.a.d(j + this.b);
    }
}

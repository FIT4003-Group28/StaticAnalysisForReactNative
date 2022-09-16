package defpackage;
/* compiled from: PG */
/* renamed from: pql  reason: default package */
/* loaded from: classes4.dex */
final class pql implements pri {
    public final pri a;
    private final long b;

    public pql(pri priVar, long j) {
        this.a = priVar;
        this.b = j;
    }

    @Override // defpackage.pri
    public final int a(pit pitVar, pmv pmvVar, int i) {
        int a = this.a.a(pitVar, pmvVar, i);
        if (a == -4) {
            pmvVar.f = Math.max(0L, pmvVar.f + this.b);
            return -4;
        }
        return a;
    }

    @Override // defpackage.pri
    public final int b(long j) {
        return this.a.b(j - this.b);
    }

    @Override // defpackage.pri
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.pri
    public final boolean pZ() {
        return this.a.pZ();
    }
}

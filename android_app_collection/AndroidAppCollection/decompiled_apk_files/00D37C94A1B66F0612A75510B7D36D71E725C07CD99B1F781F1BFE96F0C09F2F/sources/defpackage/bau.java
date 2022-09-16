package defpackage;
/* compiled from: PG */
/* renamed from: bau  reason: default package */
/* loaded from: classes2.dex */
public final class bau implements azh {
    public final long b;
    private final azh c;

    public bau(long j, azh azhVar) {
        this.b = j;
        this.c = azhVar;
    }

    @Override // defpackage.azh
    public final void b() {
        this.c.b();
    }

    @Override // defpackage.azh
    public final bab pT(int i, int i2) {
        return this.c.pT(i, i2);
    }

    @Override // defpackage.azh
    public final void ry(azy azyVar) {
        this.c.ry(new bat(this, azyVar));
    }
}

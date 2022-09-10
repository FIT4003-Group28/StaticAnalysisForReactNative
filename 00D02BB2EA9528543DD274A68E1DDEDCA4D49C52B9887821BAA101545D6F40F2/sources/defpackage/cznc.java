package defpackage;
/* compiled from: PG */
/* renamed from: cznc  reason: default package */
/* loaded from: classes5.dex */
final class cznc implements czmx<Long> {
    long a = 0;

    @Override // defpackage.czmx
    public final dfed a() {
        dfec bZ = dfed.c.bZ();
        long j = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfed dfedVar = (dfed) bZ.b;
        dfedVar.a = 1;
        dfedVar.b = Long.valueOf(j);
        return bZ.bK();
    }

    @Override // defpackage.czmx
    public final /* bridge */ /* synthetic */ void b(Long l) {
        this.a += l.longValue();
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}

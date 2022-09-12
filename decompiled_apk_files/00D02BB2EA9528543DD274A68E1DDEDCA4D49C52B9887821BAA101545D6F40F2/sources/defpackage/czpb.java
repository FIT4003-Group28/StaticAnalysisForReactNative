package defpackage;
/* compiled from: PG */
/* renamed from: czpb  reason: default package */
/* loaded from: classes5.dex */
public final class czpb {
    private final long a = System.nanoTime();

    private czpb() {
    }

    public static czpb a() {
        return new czpb();
    }

    public final dstv b() {
        long j = this.a;
        dstu bZ = dstv.c.bZ();
        long j2 = j / 1000000000;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dstv dstvVar = (dstv) bZ.b;
        dstvVar.a = j2;
        dstvVar.b = (int) (j % 1000000000);
        return bZ.bK();
    }

    public final dspt c() {
        long nanoTime = System.nanoTime() - this.a;
        dsps bZ = dspt.c.bZ();
        long j = nanoTime / 1000000000;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dspt dsptVar = (dspt) bZ.b;
        dsptVar.a = j;
        dsptVar.b = (int) (nanoTime % 1000000000);
        return bZ.bK();
    }
}

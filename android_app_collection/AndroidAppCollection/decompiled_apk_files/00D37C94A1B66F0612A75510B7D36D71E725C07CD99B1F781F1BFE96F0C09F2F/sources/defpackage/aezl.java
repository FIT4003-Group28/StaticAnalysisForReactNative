package defpackage;
/* compiled from: PG */
/* renamed from: aezl  reason: default package */
/* loaded from: classes.dex */
final class aezl extends pkt {
    private final boolean a;
    private final pjc b;

    public aezl(boolean z, pjc pjcVar) {
        this.a = z;
        this.b = pjcVar;
    }

    @Override // defpackage.pkt
    public final int b(Object obj) {
        return obj != aezp.b ? -1 : 0;
    }

    @Override // defpackage.pkt
    public final int p() {
        return 1;
    }

    @Override // defpackage.pkt
    public final int q() {
        return 1;
    }

    @Override // defpackage.pkt
    public final pkr e(int i, pkr pkrVar, boolean z) {
        if (i != 0) {
            throw new IndexOutOfBoundsException();
        }
        Integer num = null;
        Integer num2 = z ? aezp.a : null;
        if (z) {
            num = aezp.b;
        }
        pkrVar.i(num2, num, -9223372036854775807L, 0L);
        return pkrVar;
    }

    @Override // defpackage.pkt
    public final pks g(int i, pks pksVar, long j) {
        if (i != 0) {
            throw new IndexOutOfBoundsException();
        }
        Object obj = pks.a;
        pjc pjcVar = this.b;
        pksVar.e(obj, pjcVar, -9223372036854775807L, -9223372036854775807L, this.a, true, pjcVar.c, 0L, -9223372036854775807L, 0L);
        return pksVar;
    }

    @Override // defpackage.pkt
    public final Object j(int i) {
        if (i != 0) {
            throw new IndexOutOfBoundsException();
        }
        return aezp.b;
    }
}

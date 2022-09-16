package defpackage;
/* compiled from: PG */
/* renamed from: ppu  reason: default package */
/* loaded from: classes4.dex */
public final class ppu extends pkt {
    private final pjc a;

    public ppu(pjc pjcVar) {
        this.a = pjcVar;
    }

    @Override // defpackage.pkt
    public final int b(Object obj) {
        return obj == ppt.b ? 0 : -1;
    }

    @Override // defpackage.pkt
    public final pkr e(int i, pkr pkrVar, boolean z) {
        Object obj = null;
        Integer num = z ? 0 : null;
        if (z) {
            obj = ppt.b;
        }
        pkrVar.h(num, obj, -9223372036854775807L, 0L, asm.a, true);
        return pkrVar;
    }

    @Override // defpackage.pkt
    public final pks g(int i, pks pksVar, long j) {
        pksVar.e(pks.a, this.a, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0L);
        pksVar.l = true;
        return pksVar;
    }

    @Override // defpackage.pkt
    public final Object j(int i) {
        return ppt.b;
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

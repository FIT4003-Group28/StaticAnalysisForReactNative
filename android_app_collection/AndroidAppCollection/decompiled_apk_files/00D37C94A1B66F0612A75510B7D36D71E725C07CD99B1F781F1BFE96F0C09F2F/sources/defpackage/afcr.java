package defpackage;
/* compiled from: PG */
/* renamed from: afcr  reason: default package */
/* loaded from: classes.dex */
public final class afcr extends pkt {
    private final long a;
    private final pjc b;

    public afcr(pjc pjcVar) {
        pjb pjbVar = pjcVar.b;
        afms.a(pjbVar);
        Object obj = pjbVar.h;
        afms.a(obj);
        this.a = phk.c(((afbi) obj).b().d);
        this.b = pjcVar;
    }

    @Override // defpackage.pkt
    public final int b(Object obj) {
        return "YtVodPeriodUid".equals(obj) ? 0 : -1;
    }

    @Override // defpackage.pkt
    public final pkr e(int i, pkr pkrVar, boolean z) {
        ptx.g(i, 1);
        String str = null;
        String str2 = true != z ? null : "YtVodPeriodId";
        if (true == z) {
            str = "YtVodPeriodUid";
        }
        pkrVar.i(str2, str, this.a, 0L);
        return pkrVar;
    }

    @Override // defpackage.pkt
    public final pks g(int i, pks pksVar, long j) {
        ptx.g(i, 1);
        pksVar.e(pks.a, this.b, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, this.a, 0L);
        return pksVar;
    }

    @Override // defpackage.pkt
    public final Object j(int i) {
        ptx.g(i, 1);
        return "YtVodPeriodUid";
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

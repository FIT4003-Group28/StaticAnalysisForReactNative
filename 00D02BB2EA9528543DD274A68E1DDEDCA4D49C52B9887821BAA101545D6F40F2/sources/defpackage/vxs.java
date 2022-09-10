package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vxs  reason: default package */
/* loaded from: classes7.dex */
public final class vxs {
    @dzsi
    public static eaol a(@dzsi dgaw dgawVar) {
        if (dgawVar == null || (dgawVar.a & 1) == 0) {
            return null;
        }
        return new eaol(TimeUnit.SECONDS.toMillis(dgawVar.b), c(dgawVar));
    }

    public static eapd b(long j) {
        return new eapd(TimeUnit.SECONDS.toMillis(j));
    }

    public static eaou c(dgaw dgawVar) {
        int i = dgawVar.a;
        if ((i & 8) == 0) {
            if ((i & 2) != 0) {
                try {
                    return eaou.j(dgawVar.c);
                } catch (IllegalArgumentException unused) {
                }
            }
            return eaou.b;
        }
        return eaou.k((int) TimeUnit.SECONDS.toMillis(dgawVar.e));
    }
}

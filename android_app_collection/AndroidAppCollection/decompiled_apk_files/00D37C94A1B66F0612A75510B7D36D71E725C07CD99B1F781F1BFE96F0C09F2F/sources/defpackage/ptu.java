package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ptu  reason: default package */
/* loaded from: classes4.dex */
final class ptu implements psk {
    private final List a;
    private final List b;

    public ptu(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.psk
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.psk
    public final int b(long j) {
        int ad = pxi.ad(this.b, Long.valueOf(j));
        if (ad < this.b.size()) {
            return ad;
        }
        return -1;
    }

    @Override // defpackage.psk
    public final long c(int i) {
        boolean z = true;
        ptx.c(i >= 0);
        if (i >= this.b.size()) {
            z = false;
        }
        ptx.c(z);
        return ((Long) this.b.get(i)).longValue();
    }

    @Override // defpackage.psk
    public final List d(long j) {
        int af = pxi.af(this.b, Long.valueOf(j));
        if (af == -1) {
            return Collections.emptyList();
        }
        return (List) this.a.get(af);
    }
}

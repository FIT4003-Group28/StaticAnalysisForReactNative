package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmhq  reason: default package */
/* loaded from: classes5.dex */
final class cmhq implements cmga {
    private final List<List<cmfw>> a;
    private final List<Long> b;

    public cmhq(List<List<cmfw>> list, List<Long> list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.cmga
    public final int a(long j) {
        int ab = cmny.ab(this.b, Long.valueOf(j));
        if (ab < this.b.size()) {
            return ab;
        }
        return -1;
    }

    @Override // defpackage.cmga
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.cmga
    public final long c(int i) {
        boolean z = true;
        cmmn.a(i >= 0);
        if (i >= this.b.size()) {
            z = false;
        }
        cmmn.a(z);
        return this.b.get(i).longValue();
    }

    @Override // defpackage.cmga
    public final List<cmfw> d(long j) {
        int ad = cmny.ad(this.b, Long.valueOf(j));
        if (ad == -1) {
            return Collections.emptyList();
        }
        return this.a.get(ad);
    }
}

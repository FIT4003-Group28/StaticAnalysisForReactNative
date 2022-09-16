package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmgt  reason: default package */
/* loaded from: classes5.dex */
final class cmgt implements cmga {
    private final List<cmfw> a;

    public cmgt(List<cmfw> list) {
        this.a = list;
    }

    @Override // defpackage.cmga
    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.cmga
    public final int b() {
        return 1;
    }

    @Override // defpackage.cmga
    public final long c(int i) {
        cmmn.a(i == 0);
        return 0L;
    }

    @Override // defpackage.cmga
    public final List<cmfw> d(long j) {
        return j >= 0 ? this.a : Collections.emptyList();
    }
}

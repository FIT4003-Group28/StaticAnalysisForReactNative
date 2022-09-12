package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmih  reason: default package */
/* loaded from: classes5.dex */
final class cmih implements cmga {
    private final List<cmfw> a;

    public cmih(List<cmfw> list) {
        this.a = Collections.unmodifiableList(list);
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

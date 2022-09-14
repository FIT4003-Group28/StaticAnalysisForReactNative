package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmie  reason: default package */
/* loaded from: classes5.dex */
final class cmie implements cmga {
    public static final cmie a = new cmie();
    private final List<cmfw> b;

    private cmie() {
        this.b = Collections.emptyList();
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
        return j >= 0 ? this.b : Collections.emptyList();
    }

    public cmie(cmfw cmfwVar) {
        this.b = Collections.singletonList(cmfwVar);
    }
}

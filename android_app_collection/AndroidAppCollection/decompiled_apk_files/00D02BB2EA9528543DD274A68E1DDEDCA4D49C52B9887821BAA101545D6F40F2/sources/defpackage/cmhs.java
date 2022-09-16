package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmhs  reason: default package */
/* loaded from: classes5.dex */
final class cmhs implements cmga {
    private final cmfw[] a;
    private final long[] b;

    public cmhs(cmfw[] cmfwVarArr, long[] jArr) {
        this.a = cmfwVarArr;
        this.b = jArr;
    }

    @Override // defpackage.cmga
    public final int a(long j) {
        int ac = cmny.ac(this.b, j, false);
        if (ac < this.b.length) {
            return ac;
        }
        return -1;
    }

    @Override // defpackage.cmga
    public final int b() {
        return this.b.length;
    }

    @Override // defpackage.cmga
    public final long c(int i) {
        boolean z = true;
        cmmn.a(i >= 0);
        if (i >= this.b.length) {
            z = false;
        }
        cmmn.a(z);
        return this.b[i];
    }

    @Override // defpackage.cmga
    public final List<cmfw> d(long j) {
        int af = cmny.af(this.b, j, false);
        if (af == -1 || this.a[af] == cmfw.a) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.a[af]);
    }
}

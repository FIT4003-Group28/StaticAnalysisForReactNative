package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ptw  reason: default package */
/* loaded from: classes4.dex */
final class ptw implements psk {
    private final psg[] a;
    private final long[] b;

    public ptw(psg[] psgVarArr, long[] jArr) {
        this.a = psgVarArr;
        this.b = jArr;
    }

    @Override // defpackage.psk
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.psk
    public final int b(long j) {
        int ae = pxi.ae(this.b, j, false);
        if (ae < this.b.length) {
            return ae;
        }
        return -1;
    }

    @Override // defpackage.psk
    public final long c(int i) {
        boolean z = true;
        ptx.c(i >= 0);
        if (i >= this.b.length) {
            z = false;
        }
        ptx.c(z);
        return this.b[i];
    }

    @Override // defpackage.psk
    public final List d(long j) {
        int ah = pxi.ah(this.b, j, false);
        if (ah == -1 || this.a[ah] == psg.a) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.a[ah]);
    }
}

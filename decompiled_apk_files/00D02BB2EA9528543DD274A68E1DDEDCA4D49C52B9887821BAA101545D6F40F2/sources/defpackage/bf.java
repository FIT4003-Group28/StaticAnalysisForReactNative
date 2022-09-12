package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bf  reason: default package */
/* loaded from: classes3.dex */
final class bf {
    final long[] a;
    final boolean[] b;

    public bf(int i) {
        long[] jArr = new long[i];
        this.a = jArr;
        boolean[] zArr = new boolean[i];
        this.b = zArr;
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }
}

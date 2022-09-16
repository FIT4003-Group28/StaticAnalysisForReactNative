package defpackage;

import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pey  reason: default package */
/* loaded from: classes4.dex */
public final class pey implements pfa {
    public pez c;
    public int d;
    private int h;
    private long i;
    final long[] e = new long[1];
    final double[] f = new double[1];
    final String[] g = new String[1];
    private byte[] j = new byte[8];
    public final ArrayDeque a = new ArrayDeque();
    public final pfg b = new pfg();

    private final boolean b(peu peuVar, int i, long[] jArr) {
        if (peuVar.i(this.j, 0, i)) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 8) | (this.j[i2] & 255);
            }
            jArr[0] = j;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0410, code lost:
        throw defpackage.pjq.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x06ba, code lost:
        if (r6 != 7) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        if (r2 == 1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.peu r28) {
        /*
            Method dump skipped, instructions count: 2808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pey.a(peu):boolean");
    }
}

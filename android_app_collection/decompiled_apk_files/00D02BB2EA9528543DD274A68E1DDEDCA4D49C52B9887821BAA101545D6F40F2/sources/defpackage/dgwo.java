package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: dgwo  reason: default package */
/* loaded from: classes6.dex */
final class dgwo extends dgtl<BitSet> {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r8.m() != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (java.lang.Integer.parseInt(r1) != 0) goto L13;
     */
    @Override // defpackage.dgtl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.util.BitSet a(defpackage.dgxe r8) {
        /*
            r7 = this;
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r8.a()
            int r1 = r8.q()
            r2 = 0
            r3 = 0
        Le:
            r4 = 2
            if (r1 == r4) goto L77
            int r4 = r1 + (-1)
            if (r1 == 0) goto L75
            r5 = 5
            r6 = 1
            if (r4 == r5) goto L48
            r5 = 6
            if (r4 == r5) goto L3f
            r5 = 7
            if (r4 != r5) goto L24
            boolean r6 = r8.i()
            goto L52
        L24:
            dgtj r8 = new dgtj
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Invalid bitset value type: "
            r0.append(r2)
            java.lang.String r1 = defpackage.dgxf.a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L3f:
            int r1 = r8.m()
            if (r1 == 0) goto L46
            goto L52
        L46:
            r6 = 0
            goto L52
        L48:
            java.lang.String r1 = r8.h()
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L5e
            if (r1 == 0) goto L46
        L52:
            if (r6 == 0) goto L57
            r0.set(r3)
        L57:
            int r3 = r3 + 1
            int r1 = r8.q()
            goto Le
        L5e:
            dgtj r8 = new dgtj
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L75:
            r8 = 0
            throw r8
        L77:
            r8.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgwo.a(dgxe):java.lang.Object");
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, BitSet bitSet) {
        BitSet bitSet2 = bitSet;
        dgxgVar.a();
        int length = bitSet2.length();
        for (int i = 0; i < length; i++) {
            dgxgVar.g(bitSet2.get(i) ? 1L : 0L);
        }
        dgxgVar.c();
    }
}

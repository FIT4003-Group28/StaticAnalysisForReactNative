package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: pdo  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class pdo {
    public static long a(pdp pdpVar) {
        pdr pdrVar = (pdr) pdpVar;
        if (pdrVar.b.containsKey("exo_len")) {
            return ByteBuffer.wrap((byte[]) pdrVar.b.get("exo_len")).getLong();
        }
        return -1L;
    }

    public static void b(pde pdeVar, String str) {
        for (pdj pdjVar : pdeVar.f(str)) {
            try {
                pdeVar.l(pdjVar);
            } catch (pdc unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.UUID c(byte[] r9) {
        /*
            pct r0 = new pct
            r0.<init>(r9)
            int r9 = r0.c
            r1 = 0
            r2 = 32
            if (r9 >= r2) goto Le
        Lc:
            r9 = r1
            goto L78
        Le:
            r9 = 0
            r0.z(r9)
            int r2 = r0.c()
            int r3 = r0.a()
            int r3 = r3 + 4
            if (r2 == r3) goto L1f
            goto Lc
        L1f:
            int r2 = r0.c()
            int r3 = defpackage.oyu.X
            if (r2 == r3) goto L28
            goto Lc
        L28:
            int r2 = r0.c()
            int r2 = defpackage.oyu.f(r2)
            r3 = 1
            if (r2 <= r3) goto L4c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r0 = 37
            r9.<init>(r0)
            java.lang.String r0 = "Unsupported pssh version: "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "PsshAtomUtil"
            android.util.Log.w(r0, r9)
            goto Lc
        L4c:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.m()
            long r7 = r0.m()
            r4.<init>(r5, r7)
            if (r2 != r3) goto L64
            int r2 = r0.j()
            int r2 = r2 * 16
            r0.A(r2)
        L64:
            int r2 = r0.j()
            int r3 = r0.a()
            if (r2 == r3) goto L6f
            goto Lc
        L6f:
            byte[] r3 = new byte[r2]
            r0.u(r3, r9, r2)
            android.util.Pair r9 = android.util.Pair.create(r4, r3)
        L78:
            if (r9 != 0) goto L7b
            return r1
        L7b:
            java.lang.Object r9 = r9.first
            java.util.UUID r9 = (java.util.UUID) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdo.c(byte[]):java.util.UUID");
    }
}

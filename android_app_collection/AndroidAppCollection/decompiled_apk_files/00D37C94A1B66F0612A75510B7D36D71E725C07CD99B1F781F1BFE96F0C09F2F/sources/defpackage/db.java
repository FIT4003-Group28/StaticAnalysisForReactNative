package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: db  reason: default package */
/* loaded from: classes3.dex */
public final class db extends da {
    public final Object c;
    public final Object d;

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public db(defpackage.fx r4, defpackage.akl r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            r3.<init>(r4, r5)
            int r5 = r4.e
            r0 = 0
            r1 = 2
            if (r5 != r1) goto L35
            if (r6 == 0) goto L21
            dp r5 = r4.a
            dm r1 = r5.R
            if (r1 != 0) goto L12
            goto L26
        L12:
            java.lang.Object r1 = r1.j
            java.lang.Object r2 = defpackage.dp.f
            if (r1 != r2) goto L1c
            r5.aw()
            goto L26
        L1c:
            dm r5 = r5.R
            java.lang.Object r5 = r5.j
            goto L27
        L21:
            dp r5 = r4.a
            r5.av()
        L26:
            r5 = r0
        L27:
            r3.c = r5
            if (r6 == 0) goto L30
            dp r5 = r4.a
            dm r5 = r5.R
            goto L55
        L30:
            dp r5 = r4.a
            dm r5 = r5.R
            goto L55
        L35:
            if (r6 == 0) goto L4d
            dp r5 = r4.a
            dm r1 = r5.R
            if (r1 != 0) goto L3e
            goto L52
        L3e:
            java.lang.Object r1 = r1.i
            java.lang.Object r2 = defpackage.dp.f
            if (r1 != r2) goto L48
            r5.av()
            goto L52
        L48:
            dm r5 = r5.R
            java.lang.Object r5 = r5.i
            goto L53
        L4d:
            dp r5 = r4.a
            r5.aw()
        L52:
            r5 = r0
        L53:
            r3.c = r5
        L55:
            if (r7 == 0) goto L79
            if (r6 == 0) goto L71
            dp r4 = r4.a
            dm r5 = r4.R
            if (r5 != 0) goto L60
            goto L6e
        L60:
            java.lang.Object r5 = r5.k
            java.lang.Object r6 = defpackage.dp.f
            if (r5 != r6) goto L6a
            r4.ay()
            goto L6e
        L6a:
            dm r4 = r4.R
            java.lang.Object r0 = r4.k
        L6e:
            r3.d = r0
            return
        L71:
            dp r4 = r4.a
            r4.ay()
            r3.d = r0
            return
        L79:
            r3.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.<init>(fx, akl, boolean, boolean):void");
    }

    public final void a(Object obj) {
        if (obj == null) {
            return;
        }
        int i = ey.b;
        if (ey.a != null) {
            ey.a.a();
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }
}

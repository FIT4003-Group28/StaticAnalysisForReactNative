package defpackage;
/* compiled from: PG */
/* renamed from: cqid  reason: default package */
/* loaded from: classes.dex */
public final class cqid {
    private final boolean a;

    public cqid() {
        this(false);
    }

    public cqid(boolean z) {
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r8 == 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <V extends defpackage.cqkp> void b(defpackage.cqja<V> r5, defpackage.cqkv r6, V r7, int r8) {
        /*
            r0 = 0
            r1 = 0
        L2:
            cqiz<V extends cqkp>[] r2 = r5.b
            int r3 = r2.length
            if (r1 >= r3) goto L46
            r2 = r2[r1]
            r3 = 3
            r4 = 1
            if (r8 != r3) goto L14
            boolean r3 = r2.d()
            if (r3 == 0) goto L1b
            goto L17
        L14:
            if (r8 != r4) goto L17
            goto L18
        L17:
            r4 = 0
        L18:
            r2.b(r6, r7, r4)     // Catch: java.lang.Exception -> L1e
        L1b:
            int r1 = r1 + 1
            goto L2
        L1e:
            r5 = move-exception
            r6 = r5
        L20:
            if (r6 == 0) goto L27
            java.lang.Throwable r6 = r6.getCause()
            goto L20
        L27:
            dbsb r6 = defpackage.dbsc.b(r2)
            java.lang.String r8 = "property"
            r6.b(r8, r2)
            java.lang.String r8 = "viewModel"
            r6.b(r8, r7)
            java.lang.String r6 = r6.toString()
            cqly r7 = new cqly
            r7.<init>(r6, r5)
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            r7.setStackTrace(r5)
            throw r7
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqid.b(cqja, cqkv, cqkp, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(cqja<?> cqjaVar, cqkv cqkvVar, int i) {
        if (i != 4) {
            cqkvVar = null;
        }
        int i2 = 0;
        while (true) {
            cqiz<?>[] cqizVarArr = cqjaVar.b;
            if (i2 < cqizVarArr.length) {
                cqizVarArr[i2].a(cqkvVar, this.a);
                i2++;
            } else {
                return;
            }
        }
    }
}

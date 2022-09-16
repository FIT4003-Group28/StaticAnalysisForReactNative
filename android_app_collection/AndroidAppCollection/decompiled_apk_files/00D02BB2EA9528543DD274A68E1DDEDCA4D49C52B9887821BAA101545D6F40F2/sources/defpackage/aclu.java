package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aclu  reason: default package */
/* loaded from: classes.dex */
final class aclu implements View.OnClickListener {
    final /* synthetic */ Object a;
    final /* synthetic */ cqjz b;
    final /* synthetic */ aclv c;

    public aclu(aclv aclvVar, Object obj, cqjz cqjzVar) {
        this.c = aclvVar;
        this.a = obj;
        this.b = cqjzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            aclv r0 = r6.c
            cjqy r0 = r0.b
            cjqm r0 = defpackage.cjqg.r(r0, r7)
            cjqi r1 = defpackage.cjqi.a
            defpackage.cjqg.f(r1, r7, r0)
            java.lang.Object r1 = r6.a
            boolean r2 = r1 instanceof android.view.View.OnClickListener
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1c
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r1.onClick(r7)
        L1a:
            r3 = 1
            goto L40
        L1c:
            boolean r2 = r1 instanceof defpackage.cqkn
            if (r2 == 0) goto L2c
            cqjz r0 = r6.b
            V extends cqkp r0 = r0.j
            if (r0 == 0) goto L1a
            cqkn r1 = (defpackage.cqkn) r1
            r1.a(r0, r7)
            goto L1a
        L2c:
            boolean r2 = r1 instanceof defpackage.cqnx
            if (r2 == 0) goto L40
            cqjz r2 = r6.b
            V extends cqkp r2 = r2.j
            if (r2 == 0) goto L1a
            cqnx r1 = (defpackage.cqnx) r1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r0
            r1.a(r2, r5)
            goto L1a
        L40:
            cjqi r0 = defpackage.cjqi.a
            r1 = 0
            defpackage.cjqg.f(r0, r7, r1)
            if (r3 == 0) goto L49
            return
        L49:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.Object r0 = r6.a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 60
            r2.<init>(r1)
            java.lang.String r1 = "Can't apply method to an unsupported type. Unexpected type: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r7.<init>(r0)
            goto L71
        L70:
            throw r7
        L71:
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aclu.onClick(android.view.View):void");
    }
}

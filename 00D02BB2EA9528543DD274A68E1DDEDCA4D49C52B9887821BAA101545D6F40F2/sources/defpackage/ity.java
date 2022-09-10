package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ity  reason: default package */
/* loaded from: classes.dex */
final class ity implements View.OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    final /* synthetic */ cqjz c;
    final /* synthetic */ iub d;

    public ity(iub iubVar, View view, Object obj, cqjz cqjzVar) {
        this.d = iubVar;
        this.a = view;
        this.b = obj;
        this.c = cqjzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            iub r0 = r5.d
            cjqy r0 = r0.a
            cjqm r0 = defpackage.cjqg.r(r0, r6)
            cjqi r1 = defpackage.cjqi.a
            android.view.View r2 = r5.a
            defpackage.cjqg.f(r1, r2, r0)
            java.lang.Object r1 = r5.b
            boolean r2 = r1 instanceof android.view.View.OnClickListener
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1e
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r1.onClick(r6)
        L1c:
            r3 = 1
            goto L42
        L1e:
            boolean r2 = r1 instanceof defpackage.cqkn
            if (r2 == 0) goto L2e
            cqjz r0 = r5.c
            V extends cqkp r0 = r0.j
            if (r0 == 0) goto L1c
            cqkn r1 = (defpackage.cqkn) r1
            r1.a(r0, r6)
            goto L1c
        L2e:
            boolean r6 = r1 instanceof defpackage.cqnx
            if (r6 == 0) goto L42
            cqjz r6 = r5.c
            V extends cqkp r6 = r6.j
            if (r6 == 0) goto L1c
            cqnx r1 = (defpackage.cqnx) r1
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            r1.a(r6, r2)
            goto L1c
        L42:
            cjqi r6 = defpackage.cjqi.a
            android.view.View r0 = r5.a
            r1 = 0
            defpackage.cjqg.f(r6, r0, r1)
            if (r3 == 0) goto L4d
            return
        L4d:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "Can't apply method to an unsupported type."
            r6.<init>(r0)
            goto L56
        L55:
            throw r6
        L56:
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ity.onClick(android.view.View):void");
    }
}

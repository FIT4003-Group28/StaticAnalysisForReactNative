package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: jzn  reason: default package */
/* loaded from: classes3.dex */
public final class jzn extends aigl {
    public int a;
    private final int j;
    private jzm k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jzn(android.content.Context r7, defpackage.acti r8, defpackage.aign r9, defpackage.axnm r10, defpackage.aacz r11, defpackage.axxu r12) {
        /*
            r6 = this;
            r10.getClass()
            jzo r4 = new jzo
            r0 = 1
            r4.<init>(r10, r0)
            aacz r12 = r12.b
            apyy r12 = r12.b()
            aqxe r12 = r12.C
            if (r12 != 0) goto L15
            aqxe r12 = defpackage.aqxe.a
        L15:
            r1 = 45358198(0x2b41c76, double:2.24099274E-316)
            boolean r3 = r12.a(r1)
            r5 = 0
            if (r3 == 0) goto L48
            aoqp r12 = r12.b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r2 = r12.containsKey(r1)
            if (r2 == 0) goto L42
            java.lang.Object r12 = r12.get(r1)
            aqxf r12 = (defpackage.aqxf) r12
            int r1 = r12.b
            if (r1 != r0) goto L3d
            java.lang.Object r12 = r12.c
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r5 = r12.booleanValue()
        L3d:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
            goto L4c
        L42:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L48:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
        L4c:
            boolean r5 = r12.booleanValue()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            apyy r8 = r11.b()
            asxj r8 = r8.e
            if (r8 != 0) goto L61
            asxj r8 = defpackage.asxj.a
        L61:
            boolean r8 = r8.ce
            if (r8 != 0) goto L68
            r10.get()
        L68:
            android.content.res.Resources r8 = r7.getResources()
            r9 = 2131168773(0x7f070e05, float:1.7951857E38)
            int r8 = r8.getDimensionPixelSize(r9)
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131165389(0x7f0700cd, float:1.7944994E38)
            int r7 = r7.getDimensionPixelSize(r9)
            r6.j = r7
            int r7 = r7 - r8
            r6.a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzn.<init>(android.content.Context, acti, aign, axnm, aacz, axxu):void");
    }

    @Override // defpackage.aigl
    protected final int a() {
        return this.j + this.h;
    }

    @Override // defpackage.aigl
    protected final int b() {
        return this.a + this.h;
    }

    @Override // defpackage.aigl
    protected final void c(RecyclerView recyclerView) {
        recyclerView.s = true;
        jzm jzmVar = new jzm(this);
        this.k = jzmVar;
        recyclerView.addOnLayoutChangeListener(jzmVar);
    }
}

package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ybj  reason: default package */
/* loaded from: classes7.dex */
public class ybj implements xzj {
    @dzsi
    private final String a;
    private final List<zws> b;
    private final dour c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ybj(android.content.res.Resources r8, defpackage.dpgc r9, defpackage.dour r10) {
        /*
            r7 = this;
            int r0 = r9.b
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r2[r4] = r3
            r3 = 2131820750(0x7f1100ce, float:1.9274224E38)
            java.lang.String r8 = r8.getQuantityString(r3, r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            dsrj<dpfz> r2 = r9.a
            int r2 = r2.size()
            r0.<init>(r2)
            r2 = 0
        L1f:
            int r3 = r9.b
            if (r2 >= r3) goto L33
            if (r2 != 0) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = 0
        L28:
            r5 = 0
            zws r3 = defpackage.zws.e(r4, r3, r5, r5)
            r0.add(r3)
            int r2 = r2 + 1
            goto L1f
        L33:
            dsrj<dpfz> r2 = r9.a
            java.util.Iterator r2 = r2.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L70
            java.lang.Object r3 = r2.next()
            dpfz r3 = (defpackage.dpfz) r3
            int r4 = r3.b
            int r4 = r4 + (-1)
            java.lang.Object r5 = r0.get(r4)
            zws r5 = (defpackage.zws) r5
            boolean r5 = r5.b()
            int r6 = r3.a
            r6 = r6 & 2
            if (r6 == 0) goto L5c
            java.lang.String r6 = r3.c
            goto L62
        L5c:
            int r6 = r3.b
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L62:
            int r3 = r3.b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            zws r3 = defpackage.zws.e(r1, r5, r6, r3)
            r0.set(r4, r3)
            goto L39
        L70:
            dcdc r0 = defpackage.dcdc.r(r0)
            dour r1 = defpackage.dour.UNKNOWN_DIRECTION_OF_MOTION
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L86
            int r9 = r9.c
            dour r10 = defpackage.dour.b(r9)
            if (r10 != 0) goto L86
            dour r10 = defpackage.dour.UNKNOWN_DIRECTION_OF_MOTION
        L86:
            r7.<init>(r8, r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybj.<init>(android.content.res.Resources, dpgc, dour):void");
    }

    @Override // defpackage.xzj
    @dzsi
    public String a() {
        return this.a;
    }

    @Override // defpackage.xzj
    public List<zws> b() {
        return this.b;
    }

    @Override // defpackage.xzj
    public dour c() {
        return this.c;
    }

    public ybj(@dzsi String str, List<zws> list, dour dourVar) {
        this.a = str;
        this.b = dcdc.r(list);
        this.c = dourVar;
    }
}

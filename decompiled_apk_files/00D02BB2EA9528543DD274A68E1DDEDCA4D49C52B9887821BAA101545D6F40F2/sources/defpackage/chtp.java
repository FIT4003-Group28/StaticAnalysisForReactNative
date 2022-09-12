package defpackage;
/* compiled from: PG */
/* renamed from: chtp  reason: default package */
/* loaded from: classes4.dex */
public abstract class chtp {
    private boolean a;

    public static chtp f(chtq chtqVar, dcdc<chxl> dcdcVar, dcdc<chxl> dcdcVar2, boolean z, boolean z2, boolean z3) {
        chtl chtlVar = new chtl(chtqVar, dcdcVar, dcdcVar2, z, z2);
        ((chtp) chtlVar).a = z3;
        return chtlVar;
    }

    public abstract chtq a();

    public abstract dcdc<chxl> b();

    public abstract dcdc<chxl> c();

    public abstract boolean d();

    public abstract boolean e();

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        r3 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r7 = this;
            chtq r0 = r7.a()
            boolean r0 = r0.p()
            if (r0 == 0) goto L3f
            boolean r0 = r7.a
            if (r0 == 0) goto L3f
            dcdc r0 = r7.b()
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L18:
            if (r3 >= r1) goto L3d
            java.lang.Object r4 = r0.get(r3)
            chxl r4 = (defpackage.chxl) r4
            dsrj<chxk> r4 = r4.u
            java.util.Iterator r4 = r4.iterator()
        L26:
            int r5 = r3 + 1
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L3b
            java.lang.Object r5 = r4.next()
            chxk r5 = (defpackage.chxk) r5
            int r5 = r5.b
            r6 = 8
            if (r5 == r6) goto L26
            goto L3e
        L3b:
            r3 = r5
            goto L18
        L3d:
            r2 = 1
        L3e:
            return r2
        L3f:
            dcdc r0 = r7.b()
            boolean r0 = r0.isEmpty()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chtp.g():boolean");
    }
}

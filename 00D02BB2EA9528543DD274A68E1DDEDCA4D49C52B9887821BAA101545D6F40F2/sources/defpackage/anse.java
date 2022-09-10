package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: anse  reason: default package */
/* loaded from: classes2.dex */
final class anse implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ ansf a;

    public anse(ansf ansfVar) {
        this.a = ansfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (((java.lang.Boolean) r4.get("erwv_r")).booleanValue() != false) goto L16;
     */
    @Override // defpackage.dbrn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r0 = "erwv_r"
            if (r4 == 0) goto L22
            boolean r1 = r4.containsKey(r0)
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.get(r0)
            boolean r1 = r1 instanceof java.lang.Boolean
            if (r1 != 0) goto L15
            goto L22
        L15:
            java.lang.Object r0 = r4.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L37
            goto L30
        L22:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.String r0 = "stringObjectMap must contain %s of type Boolean, but got: %s"
            defpackage.bvoo.h(r0, r1)
        L30:
            ansf r0 = r3.a
            ansh r0 = r0.e
            r0.a()
        L37:
            java.lang.String r0 = "erwv_a"
            boolean r1 = r4.containsKey(r0)
            if (r1 == 0) goto L53
            java.lang.Object r1 = r4.get(r0)
            boolean r1 = r1 instanceof java.lang.Integer
            defpackage.dbsk.l(r1)
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            dbsg r4 = defpackage.dbsg.i(r4)
            goto L55
        L53:
            dbpy<java.lang.Object> r4 = defpackage.dbpy.a
        L55:
            ansf r0 = r3.a
            gga r0 = r0.b
            ansd r1 = new ansd
            r1.<init>(r3, r4)
            r0.runOnUiThread(r1)
            java.util.Map<java.lang.String, java.lang.Object> r4 = defpackage.bvwy.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anse.a(java.lang.Object):java.lang.Object");
    }
}

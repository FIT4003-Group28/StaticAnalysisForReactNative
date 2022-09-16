package defpackage;
/* compiled from: PG */
/* renamed from: azxj  reason: default package */
/* loaded from: classes2.dex */
final class azxj extends azsu implements azsg {
    final /* synthetic */ azxi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azxj(azxi azxiVar) {
        super(2);
        this.a = azxiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 == null) goto L5;
     */
    @Override // defpackage.azsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            azra r5 = (defpackage.azra) r5
            azrb r0 = r5.getKey()
            azxi r1 = r3.a
            azrd r1 = r1.b
            azra r1 = r1.get(r0)
            azus r2 = defpackage.azvo.b
            if (r0 == r2) goto L20
            if (r5 == r1) goto L1d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L2f
        L1d:
            int r4 = r4 + 1
            goto L2f
        L20:
            azvo r1 = (defpackage.azvo) r1
            azvo r5 = (defpackage.azvo) r5
            if (r5 != r1) goto L27
            goto L2b
        L27:
            boolean r0 = r5 instanceof defpackage.azye
            if (r0 != 0) goto L5c
        L2b:
            if (r5 != r1) goto L34
            if (r1 != 0) goto L1d
        L2f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L34:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r5 = ", expected child of "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L5c:
            azye r5 = (defpackage.azye) r5
            r4 = 0
            goto L61
        L60:
            throw r4
        L61:
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxj.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

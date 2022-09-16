package defpackage;
/* compiled from: PG */
/* renamed from: dcre  reason: default package */
/* loaded from: classes.dex */
public final class dcre extends dcue<StringBuilder> implements dcua {
    public final Object[] a;
    public final StringBuilder b;
    public int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public dcre(dcsl dcslVar, Object[] objArr, StringBuilder sb) {
        super(dcslVar);
        this.c = 0;
        this.a = (Object[]) dcuj.a(objArr, "arguments");
        this.b = sb;
    }

    public static void b(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(dcrn.a(obj));
        sb.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        if ((r8 instanceof java.math.BigDecimal) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
        if ((r8 instanceof java.math.BigInteger) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a1  */
    @Override // defpackage.dcua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r8, defpackage.dcrf r9, defpackage.dcrg r10) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcre.a(java.lang.Object, dcrf, dcrg):void");
    }
}

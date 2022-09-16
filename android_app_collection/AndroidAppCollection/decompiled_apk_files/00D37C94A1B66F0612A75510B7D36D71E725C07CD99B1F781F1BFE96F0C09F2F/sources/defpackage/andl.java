package defpackage;
/* compiled from: PG */
/* renamed from: andl  reason: default package */
/* loaded from: classes.dex */
public final class andl implements andh {
    public int a = 0;
    public int b = -1;
    public final Object[] c;
    public final StringBuilder d;
    public int e;
    private final ancf f;

    public andl(ancf ancfVar, Object[] objArr, StringBuilder sb) {
        anha.c(ancfVar, "context");
        this.f = ancfVar;
        this.e = 0;
        this.c = (Object[]) anha.c(objArr, "arguments");
        this.d = sb;
    }

    public static void d(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(anbh.b(obj));
        sb.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        if ((r8 instanceof java.math.BigDecimal) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
        if ((r8 instanceof java.math.BigInteger) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a1  */
    @Override // defpackage.andh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r8, defpackage.anba r9, defpackage.anbb r10) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.andl.a(java.lang.Object, anba, anbb):void");
    }

    public final andm b() {
        return this.f.a;
    }

    public final String c() {
        return this.f.b;
    }
}

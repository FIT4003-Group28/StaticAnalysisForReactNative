package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azwn  reason: default package */
/* loaded from: classes2.dex */
public final class azwn implements azwv {
    public final azwp a;
    public Object b = azwq.d;

    public azwn(azwp azwpVar) {
        this.a = azwpVar;
    }

    private static final boolean c(Object obj) {
        if (obj instanceof azxa) {
            Throwable th = ((azxa) obj).a;
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r6 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        r0 = defpackage.azuy.a;
        r0 = r6.d.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        if ((r0 instanceof defpackage.azuj) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        r0 = ((defpackage.azuj) r0).c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        r0 = r6.c;
        r5 = defpackage.aztv.a;
        r0.a = 0;
        r6.d.a = defpackage.aztx.a;
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        r0 = new defpackage.azub(r10, 2);
     */
    @Override // defpackage.azwv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.azqy r10) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azwn.a(azqy):java.lang.Object");
    }

    @Override // defpackage.azwv
    public final Object b() {
        Object obj = this.b;
        if (obj instanceof azxa) {
            azxa azxaVar = (azxa) obj;
            throw null;
        } else if (obj != azwq.d) {
            this.b = azwq.d;
            return obj;
        } else {
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
    }
}

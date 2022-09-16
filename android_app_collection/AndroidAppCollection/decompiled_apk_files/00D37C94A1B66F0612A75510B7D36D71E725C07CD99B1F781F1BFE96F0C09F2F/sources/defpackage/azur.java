package defpackage;
/* compiled from: PG */
/* renamed from: azur  reason: default package */
/* loaded from: classes2.dex */
public abstract class azur extends azqt implements azqz {
    public static final azqu c = new azqu(azqz.a, azuq.a);

    public azur() {
        super(azqz.a);
    }

    @Override // defpackage.azqz
    public final azqy a(azqy azqyVar) {
        return new azxp(this, azqyVar);
    }

    @Override // defpackage.azqz
    public final void b(azqy azqyVar) {
        azxp azxpVar = (azxp) azqyVar;
        do {
        } while (azxpVar.e.a == azxq.b);
        Object obj = azxpVar.e.a;
        azub azubVar = obj instanceof azub ? (azub) obj : null;
        if (azubVar == null) {
            return;
        }
        azubVar.h();
    }

    public boolean d(azrd azrdVar) {
        azrdVar.getClass();
        return true;
    }

    @Override // defpackage.azqt, defpackage.azra, defpackage.azrd
    public final azra get(azrb azrbVar) {
        azrbVar.getClass();
        if (azrbVar instanceof azqu) {
            azqu azquVar = (azqu) azrbVar;
            if (!azquVar.b(getKey())) {
                return null;
            }
            azra a = azquVar.a(this);
            if (a instanceof azra) {
                return a;
            }
        } else if (azqz.a == azrbVar) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (defpackage.azqz.a == r2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        return defpackage.azre.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2.a(r1) != null) goto L7;
     */
    @Override // defpackage.azqt, defpackage.azrd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.azrd minusKey(defpackage.azrb r2) {
        /*
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.azqu
            if (r0 == 0) goto L1a
            azqu r2 = (defpackage.azqu) r2
            azrb r0 = r1.getKey()
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L21
            azra r2 = r2.a(r1)
            if (r2 == 0) goto L21
            goto L1e
        L1a:
            azus r0 = defpackage.azqz.a
            if (r0 != r2) goto L21
        L1e:
            azre r2 = defpackage.azre.a
            goto L22
        L21:
            r2 = r1
        L22:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azur.minusKey(azrb):azrd");
    }

    public abstract void st(azrd azrdVar, Runnable runnable);

    public String toString() {
        return banl.j(this) + '@' + banl.k(this);
    }
}

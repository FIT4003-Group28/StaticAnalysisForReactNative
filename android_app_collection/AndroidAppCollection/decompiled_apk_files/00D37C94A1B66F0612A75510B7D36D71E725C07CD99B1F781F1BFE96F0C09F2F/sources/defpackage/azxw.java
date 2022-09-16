package defpackage;
/* compiled from: PG */
/* renamed from: azxw  reason: default package */
/* loaded from: classes2.dex */
public class azxw {
    public final aztu c = ayme.f(this);
    public final aztu d = ayme.f(this);
    private final aztu a = ayme.f(null);

    public final int f(azxw azxwVar, azxw azxwVar2, azxv azxvVar) {
        azxwVar.d.b(this);
        azxwVar.c.b(azxwVar2);
        azxvVar.d = azxwVar2;
        if (!this.c.c(azxwVar2, azxvVar)) {
            return 0;
        }
        return azxvVar.c(this) == null ? 1 : 2;
    }

    public final Object g() {
        aztu aztuVar = this.c;
        while (true) {
            Object obj = aztuVar.a;
            if (!(obj instanceof azyc)) {
                return obj;
            }
            ((azyc) obj).c(this);
        }
    }

    public final azxw h() {
        return azxu.a(g());
    }

    public final azxw i() {
        azxw n = n();
        if (n == null) {
            Object obj = this.d.a;
            while (true) {
                azxw azxwVar = (azxw) obj;
                if (!azxwVar.sw()) {
                    return azxwVar;
                }
                obj = azxwVar.d.a;
            }
        } else {
            return n;
        }
    }

    public final azxw j() {
        Object g;
        azxw azxwVar;
        azyd azydVar;
        do {
            g = g();
            if (g instanceof azyd) {
                return ((azyd) g).a;
            }
            if (g != this) {
                azxwVar = (azxw) g;
                azydVar = (azyd) azxwVar.a.a;
                if (azydVar == null) {
                    azydVar = new azyd(azxwVar);
                    azxwVar.a.b(azydVar);
                }
            } else {
                return (azxw) g;
            }
        } while (!this.c.c(g, azydVar));
        azxwVar.n();
        return null;
    }

    public final void k(azxw azxwVar) {
        azxw azxwVar2;
        aztu aztuVar = azxwVar.d;
        do {
            azxwVar2 = (azxw) aztuVar.a;
            if (g() != azxwVar) {
                return;
            }
        } while (!azxwVar.d.c(azxwVar2, this));
        if (sw()) {
            azxwVar.n();
        }
    }

    public final void l() {
        azxw azxwVar = this;
        while (true) {
            Object g = azxwVar.g();
            if (g instanceof azyd) {
                azxwVar = ((azyd) g).a;
            } else {
                azxwVar.n();
                return;
            }
        }
    }

    public final boolean m() {
        return j() == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r3.c.c(r2, ((defpackage.azyd) r4).a) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.azxw n() {
        /*
            r7 = this;
        L0:
            aztu r0 = r7.d
            java.lang.Object r0 = r0.a
            azxw r0 = (defpackage.azxw) r0
            r1 = 0
            r2 = r0
        L8:
            r3 = r1
        L9:
            aztu r4 = r2.c
            java.lang.Object r4 = r4.a
            if (r4 != r7) goto L1b
            if (r0 != r2) goto L12
            return r2
        L12:
            aztu r1 = r7.d
            boolean r0 = r1.c(r0, r2)
            if (r0 == 0) goto L0
            return r2
        L1b:
            boolean r5 = r7.sw()
            if (r5 == 0) goto L22
            return r1
        L22:
            if (r4 != 0) goto L25
            return r2
        L25:
            boolean r5 = r4 instanceof defpackage.azyc
            if (r5 == 0) goto L2f
            azyc r4 = (defpackage.azyc) r4
            r4.c(r2)
            goto L0
        L2f:
            boolean r5 = r4 instanceof defpackage.azyd
            if (r5 == 0) goto L4a
            if (r3 == 0) goto L43
            aztu r5 = r3.c
            azyd r4 = (defpackage.azyd) r4
            azxw r4 = r4.a
            boolean r2 = r5.c(r2, r4)
            if (r2 == 0) goto L0
            r2 = r3
            goto L8
        L43:
            aztu r2 = r2.d
            java.lang.Object r2 = r2.a
            azxw r2 = (defpackage.azxw) r2
            goto L9
        L4a:
            r3 = r4
            azxw r3 = (defpackage.azxw) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxw.n():azxw");
    }

    public boolean sw() {
        return g() instanceof azyd;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}

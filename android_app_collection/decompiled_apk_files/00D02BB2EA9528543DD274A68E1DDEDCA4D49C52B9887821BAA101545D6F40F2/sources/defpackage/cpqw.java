package defpackage;
/* compiled from: PG */
/* renamed from: cpqw  reason: default package */
/* loaded from: classes5.dex */
public final class cpqw {
    public int a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public boolean h;

    public cpqw(int i) {
        this.a = 0;
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.b = new int[i];
        this.c = new int[i];
        this.d = new int[i];
        this.e = new int[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r5, int r6, int r7) {
        /*
            r4 = this;
            boolean r0 = r4.c()
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Attempt to add target after animation is complete."
            defpackage.cpwl.e(r0, r2)
            int[] r0 = r4.b
            int r2 = r4.f
            r0[r2] = r6
            int[] r0 = r4.d
            r0[r2] = r5
            int[] r0 = r4.e
            r0[r2] = r7
            boolean r0 = r4.h
            if (r5 == r6) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            r0 = r0 | r3
            r4.h = r0
            int r0 = r4.a
            if (r0 == 0) goto L3a
            if (r0 == r1) goto L35
            r6 = 2
            if (r0 != r6) goto L2d
            goto L3a
        L2d:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r6 = "Bad animation mode"
            r5.<init>(r6)
            throw r5
        L35:
            int[] r5 = r4.c
            r5[r2] = r6
            goto L3e
        L3a:
            int[] r6 = r4.c
            r6[r2] = r5
        L3e:
            int r2 = r2 + r1
            r4.f = r2
            if (r7 == 0) goto L48
            int r5 = r4.g
            int r5 = r5 + r1
            r4.g = r5
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpqw.b(int, int, int):void");
    }

    public final boolean c() {
        return this.c == null;
    }

    public final void a(int i) {
        this.a = i;
        if (!c()) {
            if (i != 0) {
                if (i == 1) {
                    System.arraycopy(this.b, 0, this.c, 0, this.f);
                    return;
                } else if (i != 2) {
                    throw new AssertionError("Bad animation mode");
                }
            }
            System.arraycopy(this.d, 0, this.c, 0, this.f);
        }
    }

    public cpqw(cpqx cpqxVar) {
        this.a = 0;
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.b = cpqxVar.a;
        int i = cpqxVar.b;
        this.f = i;
        this.g = i;
    }
}

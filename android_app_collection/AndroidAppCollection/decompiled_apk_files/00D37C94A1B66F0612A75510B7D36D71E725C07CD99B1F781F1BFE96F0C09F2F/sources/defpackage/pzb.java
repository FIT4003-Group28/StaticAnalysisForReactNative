package defpackage;
/* compiled from: PG */
/* renamed from: pzb  reason: default package */
/* loaded from: classes4.dex */
public final class pzb {
    public static final pzb a = new pzb(320, 50, "320x50_mb");
    public static final pzb b;
    public final int c;
    public final int d;
    public final String e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;

    static {
        new pzb(468, 60, "468x60_as");
        new pzb(320, 100, "320x100_as");
        new pzb(728, 90, "728x90_as");
        new pzb(300, 250, "300x250_as");
        new pzb(160, 600, "160x600_as");
        new pzb(-1, -2, "smart_banner");
        new pzb(-3, -4, "fluid");
        b = new pzb(0, 0, "invalid");
        new pzb(50, 50, "50x50_mb");
        new pzb(-3, 0, "search_v2");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pzb(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r6)
        La:
            r1 = -2
            if (r7 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L14:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 4
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = "x"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "_as"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r5.<init>(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzb.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pzb)) {
            return false;
        }
        pzb pzbVar = (pzb) obj;
        return this.c == pzbVar.c && this.d == pzbVar.d && this.e.equals(pzbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }

    public pzb(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0 && i2 != -2 && i2 != -4) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            this.c = i;
            this.d = i2;
            this.e = str;
        }
    }
}

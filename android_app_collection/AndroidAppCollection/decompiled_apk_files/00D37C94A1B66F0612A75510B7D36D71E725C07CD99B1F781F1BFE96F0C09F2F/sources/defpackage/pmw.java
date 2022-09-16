package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: pmw  reason: default package */
/* loaded from: classes4.dex */
public final class pmw {
    public final String a;
    public final Format b;
    public final Format c;
    public final int d;
    public final int e;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pmw(java.lang.String r3, com.google.android.exoplayer2.Format r4, com.google.android.exoplayer2.Format r5, int r6, int r7) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r1 = 1
            if (r6 == 0) goto La
            if (r7 != 0) goto Lb
            r7 = 0
        La:
            r0 = 1
        Lb:
            defpackage.ptx.c(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L25
            r2.a = r3
            defpackage.ptx.a(r4)
            r2.b = r4
            defpackage.ptx.a(r5)
            r2.c = r5
            r2.d = r6
            r2.e = r7
            return
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmw.<init>(java.lang.String, com.google.android.exoplayer2.Format, com.google.android.exoplayer2.Format, int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pmw pmwVar = (pmw) obj;
            if (this.d == pmwVar.d && this.e == pmwVar.e && this.a.equals(pmwVar.a) && this.b.equals(pmwVar.b) && this.c.equals(pmwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}

package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: btm  reason: default package */
/* loaded from: classes4.dex */
public final class btm extends IOException {
    private static final long serialVersionUID = 1;

    public btm(int i) {
        this("Http request failed", i);
    }

    public btm(String str, int i) {
        this(str, i, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public btm(java.lang.String r3, int r4, java.lang.Throwable r5) {
        /*
            r2 = this;
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 26
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r3 = ", status code: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btm.<init>(java.lang.String, int, java.lang.Throwable):void");
    }
}
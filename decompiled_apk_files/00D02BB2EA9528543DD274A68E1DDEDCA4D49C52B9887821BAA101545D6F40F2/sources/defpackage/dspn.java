package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: dspn  reason: default package */
/* loaded from: classes.dex */
public final class dspn extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    dspn() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dspn(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            if (r0 == 0) goto L11
            java.lang.String r3 = r1.concat(r3)
            goto L16
        L11:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L16:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dspn.<init>(java.lang.String, java.lang.Throwable):void");
    }

    public dspn(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}

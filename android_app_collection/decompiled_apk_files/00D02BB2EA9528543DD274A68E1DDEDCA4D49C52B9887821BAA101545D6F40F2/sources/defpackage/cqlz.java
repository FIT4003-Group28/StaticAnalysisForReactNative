package defpackage;

import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: cqlz  reason: default package */
/* loaded from: classes5.dex */
public final class cqlz extends cqlx {
    private String a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cqlz(java.lang.Exception r4, defpackage.cqnx<?, ?> r5) {
        /*
            r3 = this;
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r4 = r4.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 27
            int r0 = r0 + r1
            r2.<init>(r0)
            java.lang.String r0 = "Unable to invoke method: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = ": "
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqlz.<init>(java.lang.Exception, cqnx):void");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.a;
        return str != null ? str : super.getMessage();
    }

    public cqlz(InvocationTargetException invocationTargetException, cqnx<?, ?> cqnxVar) {
        this((Exception) invocationTargetException, cqnxVar);
        if (invocationTargetException.getTargetException() != null) {
            setStackTrace(invocationTargetException.getTargetException().getStackTrace());
            this.a = invocationTargetException.getTargetException().toString();
        }
    }
}

package com.google.android.libraries.youtube.media.player.scripted.engine;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VirtualMachineException extends Exception {
    private final String cpn;
    private final afhi errorType;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private VirtualMachineException(int r2, java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
        /*
            r1 = this;
            afhi r0 = defpackage.afhi.a(r2)
            if (r0 != 0) goto L19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r0 = 30
            r3.<init>(r0)
            java.lang.String r0 = "Invalid errorCode: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
        L19:
            r1.<init>(r3, r5)
            afhi r2 = defpackage.afhi.a(r2)
            if (r2 != 0) goto L24
            afhi r2 = defpackage.afhi.SCRIPTED_PLAYER_ERROR_TYPE_INVALID_ARGUMENT
        L24:
            r1.errorType = r2
            r1.cpn = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.media.player.scripted.engine.VirtualMachineException.<init>(int, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    public String getCpn() {
        return this.cpn;
    }

    public afhi getErrorCode() {
        return this.errorType;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        int number = this.errorType.getNumber();
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
        sb.append("e.");
        sb.append(number);
        sb.append(";m.");
        sb.append(message);
        return sb.toString();
    }

    public VirtualMachineException(afhi afhiVar, String str) {
        this(afhiVar, str, null);
    }

    public VirtualMachineException(afhi afhiVar, String str, Throwable th) {
        super(str, th);
        this.errorType = afhiVar;
        this.cpn = null;
    }
}

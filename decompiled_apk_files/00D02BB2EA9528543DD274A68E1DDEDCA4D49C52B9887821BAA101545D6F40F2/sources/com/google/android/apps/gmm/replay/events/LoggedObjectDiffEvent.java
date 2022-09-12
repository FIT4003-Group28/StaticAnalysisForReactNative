package com.google.android.apps.gmm.replay.events;
/* compiled from: PG */
@ckol(a = "logged-object-diff", b = ckok.LOW)
/* loaded from: classes.dex */
public class LoggedObjectDiffEvent {
    private static final int XDELTA_CHUNK_SIZE = 4;
    private final String encodedDiff;
    private final String messageName;
    private final int sequenceNo;
    private static final dcqe logger = dcqe.c("com.google.android.apps.gmm.replay.events.LoggedObjectDiffEvent");
    private static final byte[] EMPTY_BYTES = new byte[0];

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private LoggedObjectDiffEvent(java.lang.String r3, defpackage.bnwq r4) {
        /*
            r2 = this;
            ddae r0 = defpackage.ddae.e
            byte[] r1 = r4.a
            r1 = 0
            java.lang.String r0 = r0.i(r1)
            int r4 = r4.b
            r4 = 0
            r2.<init>(r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.replay.events.LoggedObjectDiffEvent.<init>(java.lang.String, bnwq):void");
    }

    public LoggedObjectDiffEvent(@ckoo(a = "messageName") String str, @ckoo(a = "encodedDiff") String str2, @ckoo(a = "sequenceNo") int i) {
        this.messageName = str;
        this.encodedDiff = str2;
        this.sequenceNo = i;
    }

    @ckom(a = "encodedDiff")
    public String getEncodedDiff() {
        return this.encodedDiff;
    }

    public byte[] getEncodedDiffBytes() {
        return ddae.e.j(getEncodedDiff());
    }

    @ckom(a = "messageName")
    public String getMessageName() {
        return this.messageName;
    }

    @ckom(a = "sequenceNo")
    public int getSequenceNo() {
        return this.sequenceNo;
    }
}

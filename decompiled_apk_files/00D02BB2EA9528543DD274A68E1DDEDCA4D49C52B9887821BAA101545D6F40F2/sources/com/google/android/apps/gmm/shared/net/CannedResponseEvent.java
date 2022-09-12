package com.google.android.apps.gmm.shared.net;

import android.util.Base64;
/* compiled from: PG */
@ckol(a = "canned-response", b = ckok.LOW)
/* loaded from: classes.dex */
public class CannedResponseEvent {
    private final dunt requestId;
    @dzsi
    private final String responseEncoded;

    public CannedResponseEvent(@ckoo(a = "request") int i, @dzsi @ckoo(a = "response") String str) {
        dunt b = dunt.b(i);
        dbsk.s(b);
        this.requestId = b;
        this.responseEncoded = str;
    }

    private static String writeProtoToBase64String(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    @ckom(a = "request")
    public int getRequestId() {
        return this.requestId.hp;
    }

    public byte[] getResponse() {
        String str = this.responseEncoded;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @ckom(a = "response")
    @dzsi
    public String getResponseEncoded() {
        return this.responseEncoded;
    }

    @ckon(a = "response")
    public boolean hasResponse() {
        return this.responseEncoded != null;
    }

    CannedResponseEvent(dunt duntVar, @dzsi byte[] bArr) {
        this(duntVar.hp, bArr == null ? null : writeProtoToBase64String(bArr));
    }
}

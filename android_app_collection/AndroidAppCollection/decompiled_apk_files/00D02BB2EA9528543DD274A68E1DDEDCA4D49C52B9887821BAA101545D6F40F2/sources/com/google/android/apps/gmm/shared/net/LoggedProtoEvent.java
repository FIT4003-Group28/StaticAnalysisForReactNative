package com.google.android.apps.gmm.shared.net;

import android.util.Base64;
/* compiled from: PG */
@ckol(a = "logged-proto", b = ckok.LOW)
/* loaded from: classes.dex */
public class LoggedProtoEvent {
    private final String encoded;
    @dzsi
    private final String localTime;
    private final String messageName;

    public LoggedProtoEvent(String str, dssj dssjVar) {
        this(str, Base64.encodeToString(dssjVar.bS(), 11), eato.b("yyyy-MM-dd HH:mm").f(eaol.a()));
    }

    public LoggedProtoEvent(@ckoo(a = "messageName") String str, @ckoo(a = "encoded") String str2, @dzsi @ckoo(a = "localTime") String str3) {
        this.messageName = str;
        this.encoded = str2;
        this.localTime = str3;
    }

    @ckom(a = "encoded")
    public String getEncoded() {
        return this.encoded;
    }

    @dzsi
    public String getExtraDataForTombstone() {
        return getMessageName();
    }

    @ckom(a = "localTime")
    @dzsi
    public String getLocalTime() {
        return this.localTime;
    }

    @ckom(a = "messageName")
    public String getMessageName() {
        return this.messageName;
    }

    @ckon(a = "localTime")
    public boolean hasLocalTime() {
        return this.localTime != null;
    }

    public boolean mayRecord() {
        return true;
    }
}

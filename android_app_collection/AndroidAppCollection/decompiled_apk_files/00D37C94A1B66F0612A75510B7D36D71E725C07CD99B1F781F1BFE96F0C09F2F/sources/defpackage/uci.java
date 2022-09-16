package defpackage;
/* compiled from: PG */
/* renamed from: uci  reason: default package */
/* loaded from: classes4.dex */
public enum uci {
    PRODUCTION("https://notifications-pa.googleapis.com:443"),
    AUTOPUSH("https://autopush-notifications-pa.sandbox.googleapis.com:443"),
    AUTOPUSH_PRODDATA("https://autopush-proddata-notifications-pa.sandbox.googleapis.com:443"),
    STAGING("https://staging-notifications-pa.sandbox.googleapis.com:443"),
    DEV("https://dev-notifications-pa.corp.googleapis.com:443");
    
    public final String f;

    uci(String str) {
        this.f = str;
    }
}

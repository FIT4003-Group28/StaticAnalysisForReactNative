package defpackage;
/* compiled from: PG */
/* renamed from: cvjr  reason: default package */
/* loaded from: classes.dex */
public enum cvjr {
    PRODUCTION("https://notifications-pa.googleapis.com:443"),
    AUTOPUSH("https://autopush-notifications-pa.sandbox.googleapis.com:443"),
    AUTOPUSH_PRODDATA("https://autopush-proddata-notifications-pa.sandbox.googleapis.com:443"),
    DAILY_0("https://daily-0-notifications-pa.sandbox.googleapis.com:443"),
    DAILY_1("https://daily-1-notifications-pa.sandbox.googleapis.com:443"),
    DAILY_2("https://daily-2-notifications-pa.sandbox.googleapis.com:443"),
    DAILY_3("https://daily-3-notifications-pa.sandbox.googleapis.com:443"),
    DAILY_4("https://daily-4-notifications-pa.sandbox.googleapis.com:443"),
    DAILY_5("https://daily-5-notifications-pa.sandbox.googleapis.com:443"),
    DAILY_6("https://daily-6-notifications-pa.sandbox.googleapis.com:443"),
    STAGING("https://staging-notifications-pa.sandbox.googleapis.com:443"),
    DEV("https://dev-notifications-pa.corp.googleapis.com:443");
    
    public final String m;

    cvjr(String str) {
        this.m = str;
    }
}

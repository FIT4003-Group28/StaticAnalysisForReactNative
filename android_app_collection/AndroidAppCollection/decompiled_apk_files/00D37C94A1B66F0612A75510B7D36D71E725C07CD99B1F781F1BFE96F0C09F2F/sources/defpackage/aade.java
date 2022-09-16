package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: aade  reason: default package */
/* loaded from: classes.dex */
public enum aade {
    PRODUCTION("https://youtubei.googleapis.com"),
    STAGING("https://green-youtubei.sandbox.googleapis.com"),
    RELEASE("https://release-youtubei.sandbox.googleapis.com"),
    TEST("https://test-youtubei.sandbox.googleapis.com"),
    CAMI("http://cami-youtubei.sandbox.googleapis.com"),
    uYTFE("https://uytfe.sandbox.google.com"),
    PPG("http://127.0.0.1:8787"),
    UBERDEMO("No default address as the demo is dynamically created when needed.");
    
    public final Uri i;

    aade(String str) {
        this.i = Uri.parse(str);
    }

    public static aade a() {
        return values()[0];
    }
}

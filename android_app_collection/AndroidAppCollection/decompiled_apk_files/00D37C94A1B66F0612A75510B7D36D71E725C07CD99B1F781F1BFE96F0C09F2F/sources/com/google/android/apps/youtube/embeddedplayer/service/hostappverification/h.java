package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import android.net.Uri;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h {
    private final yqw a;
    private final String b;
    private final String c;
    private final String d;

    public h(yqw yqwVar, com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f fVar, String str) {
        this.a = yqwVar;
        this.b = fVar.c;
        this.c = fVar.a;
        this.d = str;
    }

    public final ankt a() {
        yqw yqwVar = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        str.getClass();
        return anii.i(yqwVar.b(new f(new Uri.Builder().scheme("https").authority("youtubeembeddedplayer.googleapis.com").appendEncodedPath("v1beta1:verifyHostApp").appendQueryParameter("key", str).build().toString(), str, str2, str3)), g.a, anjk.a);
    }
}

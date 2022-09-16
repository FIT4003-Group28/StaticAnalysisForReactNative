package com.crashlytics.android.answers;

import android.content.Context;
import b.a.a.a.a.b.i;
import b.a.a.a.a.b.p;
import java.util.Map;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SessionMetadataCollector {
    private final Context context;
    private final p idManager;
    private final String versionCode;
    private final String versionName;

    public SessionMetadataCollector(Context context, p pVar, String str, String str2) {
        this.context = context;
        this.idManager = pVar;
        this.versionCode = str;
        this.versionName = str2;
    }

    public SessionEventMetadata getMetadata() {
        Map<p.a, String> h = this.idManager.h();
        return new SessionEventMetadata(this.idManager.c(), UUID.randomUUID().toString(), this.idManager.b(), this.idManager.j(), h.get(p.a.FONT_TOKEN), i.m(this.context), this.idManager.d(), this.idManager.g(), this.versionCode, this.versionName);
    }
}

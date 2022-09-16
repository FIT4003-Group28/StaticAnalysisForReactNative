package com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g implements amqo {
    private final Context a;
    private final String b;
    private final f c;

    public g(Context context, String str, f fVar) {
        this.a = context;
        this.b = str;
        this.c = fVar;
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.google.android.youtube.player/");
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.a.getPackageName());
        sb.append('/');
        sb.append(alyz.a(this.a));
        sb.append(' ');
        sb.append(this.c.a);
        sb.append('/');
        sb.append(this.c.b);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append(" Build/");
            sb.append(str2);
        }
        sb.append(')');
        return sb.toString();
    }
}

package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aiva  reason: default package */
/* loaded from: classes.dex */
public final class aiva {
    public final Executor a;
    public final asv b;
    public final pwx c;
    public asy d;
    public final int e;
    public volatile boolean f = false;
    public Thread g;

    public aiva(Executor executor, afjm afjmVar, pwx pwxVar, Uri uri, int i, String str) {
        this.a = executor;
        this.b = new aya(afjmVar.a(), pwxVar, -10);
        this.c = pwxVar;
        if (uri != null && ("https".equals(uri.getScheme()) || "http".equals(uri.getScheme()))) {
            if (!TextUtils.isEmpty(str)) {
                zgp b = zgp.b(uri);
                b.h("cpn", str);
                uri = b.a();
            }
            this.d = new asy(uri);
        }
        this.e = i;
    }
}

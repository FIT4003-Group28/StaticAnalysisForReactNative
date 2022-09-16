package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aipi  reason: default package */
/* loaded from: classes.dex */
public final class aipi {
    final /* synthetic */ aipk a;
    private final Uri.Builder b;
    private final Set c = new HashSet();

    public aipi(aipk aipkVar, String str) {
        this.a = aipkVar;
        Uri.Builder scheme = new Uri.Builder().scheme("http");
        int localPort = aipkVar.e.getLocalPort();
        StringBuilder sb = new StringBuilder(21);
        sb.append("localhost:");
        sb.append(localPort);
        this.b = scheme.encodedAuthority(sb.toString()).path(str);
    }

    public final synchronized Uri a() {
        aipp aippVar;
        Uri.Builder builder;
        aippVar = this.a.c;
        builder = this.b;
        return builder.appendQueryParameter("sig", aippVar.a(builder.appendQueryParameter("sparams", TextUtils.join(",", this.c)).build())).build();
    }

    public final synchronized void b(String str, String str2) {
        aqxo.y(!this.c.contains(str));
        Uri.Builder builder = this.b;
        if (str2 == null) {
            str2 = "";
        }
        builder.appendQueryParameter(str, str2);
        this.c.add(str);
    }

    public final void c(String str, long j) {
        b(str, Long.toString(j));
    }
}

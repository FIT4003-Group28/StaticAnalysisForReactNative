package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cmrp  reason: default package */
/* loaded from: classes5.dex */
public final class cmrp {
    public final Context a;
    public final cmrn b;
    private final cmro c;

    public cmrp(Context context) {
        cmrn cmrnVar = new cmrn();
        cmro cmroVar = new cmro();
        this.a = context;
        this.b = cmrnVar;
        this.c = cmroVar;
    }

    public static String a(String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        for (String str : strArr) {
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                String host = url.getHost();
                StringBuilder sb = new StringBuilder(String.valueOf(protocol).length() + 3 + String.valueOf(host).length());
                sb.append(protocol);
                sb.append("://");
                sb.append(host);
                builder.appendQueryParameter("url", sb.toString());
            } catch (MalformedURLException unused) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid URL: ".concat(valueOf) : new String("Invalid URL: "));
            }
        }
        String valueOf2 = String.valueOf(builder.build().getQuery());
        return valueOf2.length() != 0 ? "weblogin:".concat(valueOf2) : new String("weblogin:");
    }

    public final void b(List<cmul> list) {
        Set a;
        int size = list.size();
        if (size == 0) {
            a = new aih();
        } else {
            a = cnxl.a(size, true);
        }
        for (cmul cmulVar : list) {
            String str = !TextUtils.isEmpty(cmulVar.e) ? cmulVar.e : cmulVar.d;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(cmulVar.b) && !TextUtils.isEmpty(cmulVar.c)) {
                Long l = null;
                Boolean valueOf = (cmulVar.a & 32) != 0 ? Boolean.valueOf(cmulVar.g) : null;
                cnwc.l(str);
                String str2 = true != cmqx.a(valueOf) ? "http" : "https";
                StringBuilder sb = new StringBuilder(str2.length() + 3 + String.valueOf(str).length());
                sb.append(str2);
                sb.append("://");
                sb.append(str);
                String sb2 = sb.toString();
                String str3 = cmulVar.b;
                String str4 = cmulVar.c;
                String str5 = cmulVar.d;
                String str6 = cmulVar.f;
                Boolean valueOf2 = (cmulVar.a & 64) != 0 ? Boolean.valueOf(cmulVar.h) : null;
                Boolean valueOf3 = (cmulVar.a & 32) != 0 ? Boolean.valueOf(cmulVar.g) : null;
                if ((cmulVar.a & 128) != 0) {
                    l = Long.valueOf(cmulVar.i);
                }
                StringBuilder sb3 = new StringBuilder(str3);
                sb3.append('=');
                if (!TextUtils.isEmpty(str4)) {
                    sb3.append(str4);
                }
                if (cmqx.a(valueOf2)) {
                    sb3.append(";HttpOnly");
                }
                if (cmqx.a(valueOf3)) {
                    sb3.append(";Secure");
                }
                if (!TextUtils.isEmpty(str5)) {
                    sb3.append(";Domain=");
                    sb3.append(str5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    sb3.append(";Path=");
                    sb3.append(str6);
                }
                if (l != null && l.longValue() > 0) {
                    sb3.append(";Max-Age=");
                    sb3.append(l);
                }
                String sb4 = sb3.toString();
                if (String.valueOf(sb2).length() == 0) {
                    new String("Setting cookie for url: ");
                }
                this.c.a.setCookie(sb2, sb4);
                a.add(sb2);
            }
        }
    }
}

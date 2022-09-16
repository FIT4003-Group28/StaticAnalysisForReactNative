package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qid  reason: default package */
/* loaded from: classes4.dex */
public final class qid {
    private final Context a;
    private final qic b;

    public qid(Context context) {
        qic qicVar = new qic();
        this.a = context;
        this.b = qicVar;
    }

    public static qid a(Context context) {
        return new qid(context);
    }

    static String b(String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        for (int i = 0; i <= 0; i++) {
            String str = strArr[i];
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

    private final Set d(List list) {
        Set hashSet;
        Set set;
        String str;
        int size = list.size();
        int i = 128;
        if (size == 0) {
            set = new afy();
        } else {
            if (size <= 128) {
                hashSet = new afy(size);
            } else {
                hashSet = new HashSet(size, 0.75f);
            }
            set = hashSet;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qja qjaVar = (qja) it.next();
            String str2 = !TextUtils.isEmpty(qjaVar.f) ? qjaVar.f : qjaVar.e;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(qjaVar.c) || TextUtils.isEmpty(qjaVar.d)) {
                Log.w("WebLoginHelper", "Invalid cookie.");
            } else {
                String str3 = null;
                Boolean valueOf = (qjaVar.b & 32) != 0 ? Boolean.valueOf(qjaVar.h) : null;
                qnm.l(str2);
                boolean z = true;
                String str4 = true != qhp.a(valueOf) ? "http" : "https";
                StringBuilder sb = new StringBuilder(str4.length() + 3 + String.valueOf(str2).length());
                sb.append(str4);
                sb.append("://");
                sb.append(str2);
                String sb2 = sb.toString();
                String str5 = qjaVar.c;
                String str6 = qjaVar.d;
                String str7 = qjaVar.e;
                String str8 = qjaVar.g;
                Boolean valueOf2 = (qjaVar.b & 64) != 0 ? Boolean.valueOf(qjaVar.i) : null;
                Boolean valueOf3 = (qjaVar.b & 32) != 0 ? Boolean.valueOf(qjaVar.h) : null;
                Long valueOf4 = (qjaVar.b & i) != 0 ? Long.valueOf(qjaVar.j) : null;
                if ((qjaVar.b & 256) != 0) {
                    int i2 = qfl.i(qjaVar.k);
                    str = (i2 == 0 || i2 == 1) ? "UNKNOWN_PRIORITY" : i2 != 2 ? i2 != 3 ? "HIGH" : "MEDIUM" : "LOW";
                } else {
                    str = null;
                }
                int i3 = qjaVar.b;
                if ((i3 & 512) != 0) {
                    str3 = qjaVar.l;
                }
                if ((i3 & 1024) == 0 || TextUtils.isEmpty(qjaVar.m)) {
                    z = false;
                }
                Boolean valueOf5 = Boolean.valueOf(z);
                if (str5 == null) {
                    str5 = "";
                }
                StringBuilder sb3 = new StringBuilder(str5);
                sb3.append('=');
                if (!TextUtils.isEmpty(str6)) {
                    sb3.append(str6);
                }
                if (qhp.a(valueOf2)) {
                    sb3.append(";HttpOnly");
                }
                if (qhp.a(valueOf3)) {
                    sb3.append(";Secure");
                }
                if (!TextUtils.isEmpty(str7)) {
                    sb3.append(";Domain=");
                    sb3.append(str7);
                }
                if (!TextUtils.isEmpty(str8)) {
                    sb3.append(";Path=");
                    sb3.append(str8);
                }
                if (valueOf4 != null && valueOf4.longValue() > 0) {
                    sb3.append(";Max-Age=");
                    sb3.append(valueOf4);
                }
                if (!TextUtils.isEmpty(str)) {
                    sb3.append(";Priority=");
                    sb3.append(str);
                }
                if (!TextUtils.isEmpty(str3)) {
                    sb3.append(";SameSite=");
                    sb3.append(str3);
                }
                if (qhp.a(valueOf5)) {
                    sb3.append(";SameParty");
                }
                String sb4 = sb3.toString();
                String valueOf6 = String.valueOf(sb2);
                if (valueOf6.length() != 0) {
                    "Setting cookie for url: ".concat(valueOf6);
                }
                this.b.a.setCookie(sb2, sb4);
                set.add(sb2);
            }
            i = 128;
        }
        return set;
    }

    public final Set c(Account account, String... strArr) {
        qnm.b(account);
        int i = 1;
        qnm.d(true, "Must have at least one URL.");
        try {
            qjb qjbVar = (qjb) aopi.parseFrom(qjb.a, Base64.decode(qhz.e(this.a, account, b(strArr)), 9), aoos.b());
            if (qjbVar == null || (qjbVar.b & 1) == 0) {
                throw new qhr("Invalid response.");
            }
            qjd qjdVar = qjbVar.c;
            if (qjdVar == null) {
                qjdVar = qjd.a;
            }
            int k = qzv.k(qjdVar.b);
            if (k == 0) {
                k = 1;
            }
            int i2 = k - 1;
            if (i2 == 1) {
                return d(qjdVar.c);
            }
            if (i2 == 2) {
                throw new IOException("Request failed, but server said RETRY.");
            }
            if (i2 == 5) {
                d(qjdVar.c);
                for (qjc qjcVar : qjdVar.d) {
                    int l = qzv.l(qjcVar.b);
                    if (l == 0) {
                        l = 1;
                    }
                    int i3 = l - 1;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            String str = qjcVar.c;
                            throw new qib();
                        } else if (i3 != 3) {
                            int l2 = qzv.l(qjcVar.b);
                            if (l2 == 0) {
                                l2 = 1;
                            }
                            StringBuilder sb = new StringBuilder(47);
                            sb.append("Unrecognized failed account status: ");
                            sb.append(l2 - 1);
                            Log.w("WebLoginHelper", sb.toString());
                        }
                    }
                }
                throw new qhr("Authorization failed, but no recoverable accounts.");
            }
            String valueOf = String.valueOf(qjdVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb2.append("Unexpected response: ");
            sb2.append(valueOf);
            Log.w("WebLoginHelper", sb2.toString());
            int k2 = qzv.k(qjdVar.b);
            if (k2 != 0) {
                i = k2;
            }
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("Unknown response status: ");
            sb3.append(i - 1);
            throw new qhr(sb3.toString());
        } catch (aopx e) {
            throw new qhr("Couldn't read data from server.", e);
        }
    }
}

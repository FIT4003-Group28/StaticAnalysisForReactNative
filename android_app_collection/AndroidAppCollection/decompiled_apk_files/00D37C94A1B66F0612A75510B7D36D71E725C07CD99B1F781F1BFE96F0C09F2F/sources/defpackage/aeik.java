package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aeik  reason: default package */
/* loaded from: classes.dex */
public final class aeik {
    public static apfx a(apyy apyyVar) {
        apfz b = b(apyyVar);
        if (b != null && (b.b & 4) != 0) {
            apfw apfwVar = b.d;
            if (apfwVar == null) {
                apfwVar = apfw.a;
            }
            if ((apfwVar.b & 2) != 0) {
                apfw apfwVar2 = b.d;
                if (apfwVar2 == null) {
                    apfwVar2 = apfw.a;
                }
                apfx apfxVar = apfwVar2.d;
                return apfxVar == null ? apfx.a : apfxVar;
            }
        }
        return null;
    }

    public static apfz b(apyy apyyVar) {
        if (apyyVar != null) {
            apfo apfoVar = apyyVar.d;
            if (apfoVar == null) {
                apfoVar = apfo.a;
            }
            apfq apfqVar = apfoVar.c;
            if (apfqVar == null) {
                apfqVar = apfq.a;
            }
            if ((apfqVar.b & 1) != 0) {
                apfo apfoVar2 = apyyVar.d;
                if (apfoVar2 == null) {
                    apfoVar2 = apfo.a;
                }
                apfq apfqVar2 = apfoVar2.c;
                if (apfqVar2 == null) {
                    apfqVar2 = apfq.a;
                }
                apfz apfzVar = apfqVar2.c;
                return apfzVar == null ? apfz.a : apfzVar;
            }
        }
        return null;
    }

    public static Executor c(int i, Executor executor) {
        afms.a(executor);
        int i2 = i - 1;
        if (i2 != 2) {
            if (i2 == 3) {
                return new ylk(4, new yli(3, "mediaCronetResp"));
            }
            return i2 != 4 ? executor : new ylk(4, new yli(0, "mediaCronetResp"));
        }
        return new ylk(4, new yli(6, "mediaCronetResp"));
    }

    public static ampq d(Uri uri, ampq ampqVar) {
        if (!h(uri)) {
            return amon.a;
        }
        String f = f(uri);
        String e = e(uri);
        afms.a(f);
        afms.a(e);
        if (ampqVar.h()) {
            return ampq.j(((String) ampqVar.c()).replace("{fvip}", f).replace("{mn}", e).concat(".").concat("googlevideo.com"));
        }
        return ampq.j(String.format("r%s---%s.%s", f, e, "googlevideo.com"));
    }

    public static String e(Uri uri) {
        List h;
        String queryParameter = uri.getQueryParameter("mn");
        if (TextUtils.isEmpty(queryParameter) || (h = amqf.b(',').h(queryParameter)) == null || h.size() <= 1) {
            return null;
        }
        return (String) h.get(1);
    }

    public static String f(Uri uri) {
        return uri.getQueryParameter("fvip");
    }

    public static final boolean g(Uri uri, Uri uri2) {
        return uri != null && uri2 != null && TextUtils.equals(uri.getAuthority(), uri2.getAuthority()) && TextUtils.equals(uri.getPath(), uri2.getPath()) && TextUtils.equals(uri.getQueryParameter("signature"), uri2.getQueryParameter("signature")) && TextUtils.equals(uri.getQueryParameter("sig"), uri2.getQueryParameter("sig")) && TextUtils.equals(uri.getQueryParameter("lsig"), uri2.getQueryParameter("lsig"));
    }

    public static boolean h(Uri uri) {
        String authority = uri.getAuthority();
        return !TextUtils.isEmpty(authority) && authority.endsWith("googlevideo.com") && !TextUtils.isEmpty(f(uri)) && !TextUtils.isEmpty(e(uri));
    }

    public static String i(boolean z, String str, String str2) {
        String str3;
        Object[] objArr = new Object[3];
        if (adih.b(str2)) {
            str3 = str2.length() != 0 ? ".".concat(str2) : new String(".");
        } else {
            str3 = "";
        }
        objArr[0] = str3;
        objArr[1] = true != z ? "phone" : "tablet";
        objArr[2] = str;
        return String.format("android%s-%s-%s", objArr);
    }
}

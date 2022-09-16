package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: afhf  reason: default package */
/* loaded from: classes.dex */
public final class afhf {
    public static boolean a(Uri uri, String str) {
        return b(uri, dcdc.f(str), dcdc.f(str));
    }

    public static boolean b(Uri uri, dcdc<String> dcdcVar, dcdc<String> dcdcVar2) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        if (host == null || path == null) {
            return false;
        }
        return (host.startsWith("www.google.") && c(path, dcdcVar2)) || (host.startsWith("maps.google.") && c(path, dcdcVar));
    }

    private static boolean c(String str, Iterable<String> iterable) {
        for (String str2 : iterable) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}

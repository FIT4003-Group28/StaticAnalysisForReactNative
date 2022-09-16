package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aear  reason: default package */
/* loaded from: classes.dex */
public final class aear {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "BT709" : "DCIP3" : "BT2020";
    }

    public static long b(String str) {
        return Long.parseLong(str.substring(str.lastIndexOf(46) + 1));
    }

    public static String c(String str, int i, String str2, long j) {
        String b = ovm.b(i, str2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(b).length());
        sb.append(str);
        sb.append(".");
        sb.append(b);
        sb.append(".");
        sb.append(j);
        return sb.toString();
    }

    public static String d(String str) {
        if (str == null) {
            afus.e(1, 6, "null cacheKey in getFormatId.", 0.01d);
            return "";
        }
        int indexOf = str.indexOf(46);
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(46, i);
        if (indexOf < 0 || indexOf2 < 0) {
            afus.e(1, 6, str.length() != 0 ? "Invalid formatId in cacheKey: ".concat(str) : new String("Invalid formatId in cacheKey: "), 0.01d);
            return "";
        }
        return str.substring(i, indexOf2);
    }

    public static String e(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(46)) < 0) {
            String valueOf = String.valueOf(str);
            afus.e(1, 6, valueOf.length() != 0 ? "Invalid videoId in cacheKey: ".concat(valueOf) : new String("Invalid videoId in cacheKey: "), 0.01d);
            return "";
        }
        return str.substring(0, indexOf);
    }

    public static yqj f(int i) {
        ypg a = yqj.a();
        a.d(i);
        a.c(false);
        return a.a();
    }

    public static yqj g(int i, int i2) {
        ypg a = yqj.a();
        a.b(i);
        a.d(i2);
        a.c(false);
        return a.a();
    }

    public static String h(acwu acwuVar, aczr aczrVar) {
        HashSet hashSet;
        amvn amvnVar = acwuVar.b;
        if (amvnVar == null || amvnVar.isEmpty()) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(amvnVar);
        }
        if (!acwuVar.h) {
            hashSet.remove("ska");
        }
        if (aczrVar.h) {
            hashSet.add("que");
        }
        if (aczrVar.k) {
            hashSet.add("mlm");
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(",", hashSet);
    }
}

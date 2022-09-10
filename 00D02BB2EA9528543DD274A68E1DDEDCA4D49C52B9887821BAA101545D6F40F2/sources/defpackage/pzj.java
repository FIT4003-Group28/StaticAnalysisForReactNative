package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: pzj  reason: default package */
/* loaded from: classes7.dex */
public final class pzj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri a(String str) {
        String valueOf = String.valueOf(str.replaceAll("[^+0-9]", "").replaceAll("(?<!^)\\+", ""));
        return Uri.parse(valueOf.length() != 0 ? "tel:".concat(valueOf) : new String("tel:"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(dnpq dnpqVar, String str) {
        String str2 = dnpqVar.d;
        return dbsj.d(str2) ? str : str2;
    }
}

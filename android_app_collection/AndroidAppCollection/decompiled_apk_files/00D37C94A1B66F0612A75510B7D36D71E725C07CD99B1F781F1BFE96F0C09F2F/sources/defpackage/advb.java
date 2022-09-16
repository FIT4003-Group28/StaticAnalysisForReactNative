package defpackage;

import android.net.Uri;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: advb  reason: default package */
/* loaded from: classes.dex */
public final class advb {
    public final String a;
    public final String b;
    public final adig c;
    public final int d;
    public String e;

    public advb(String str, String str2, adig adigVar, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = adigVar;
        this.d = i;
        this.e = str3;
    }

    public static ampq a(String str, String str2, String str3, adig adigVar, int i) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? amon.a : ampq.j(new advb(str2, str3, adigVar, i, str));
    }

    public final String b() {
        adid adidVar;
        Uri uri;
        adig adigVar = this.c;
        if ((adigVar instanceof adid) && (uri = (adidVar = (adid) adigVar).b) != null && !TextUtils.isEmpty(uri.toString())) {
            return adidVar.b.toString();
        }
        return null;
    }
}

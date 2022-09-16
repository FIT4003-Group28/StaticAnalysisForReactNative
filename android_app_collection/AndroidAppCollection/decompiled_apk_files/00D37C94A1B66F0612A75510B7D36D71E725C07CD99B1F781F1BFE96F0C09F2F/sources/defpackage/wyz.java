package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: wyz  reason: default package */
/* loaded from: classes4.dex */
public final class wyz implements afzn {
    private final xio a;

    public wyz(xio xioVar) {
        this.a = xioVar;
    }

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        Integer num = (Integer) wzc.a.get(str);
        if (num != null && num.intValue() == 61) {
            return this.a.c(uri.getQueryParameter("ai"));
        }
        return null;
    }

    @Override // defpackage.afzn
    public final String b() {
        return "wyz";
    }
}

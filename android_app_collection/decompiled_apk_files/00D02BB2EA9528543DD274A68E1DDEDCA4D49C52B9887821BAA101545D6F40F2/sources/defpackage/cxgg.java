package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cxgg  reason: default package */
/* loaded from: classes5.dex */
public abstract class cxgg {
    @Deprecated
    public static cxgg a(Context context, String str) {
        return new cxgh(context.getPackageName(), str);
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public final String e() {
        String b = b();
        String c = c();
        String d = d();
        int length = String.valueOf(b).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(c).length() + String.valueOf(d).length());
        sb.append(b);
        sb.append("#");
        sb.append(c);
        sb.append("#");
        sb.append(d);
        return sb.toString();
    }
}

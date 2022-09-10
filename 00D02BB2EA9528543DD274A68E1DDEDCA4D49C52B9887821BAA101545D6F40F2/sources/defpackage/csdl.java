package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: csdl  reason: default package */
/* loaded from: classes5.dex */
public final class csdl {
    public final String a;
    public final String b;
    public final String c;
    public final SharedPreferences d;
    private final String e;

    public csdl(Context context, String str) {
        this.e = str;
        this.d = context.getSharedPreferences("com.google.android.libraries.happiness", 0);
        Uri parse = Uri.parse(str);
        String lowerCase = parse.getHost().toLowerCase();
        this.a = lowerCase;
        ArrayList c = dchl.c(parse.getPathSegments());
        if (c.size() > 0) {
            c.remove(c.size() - 1);
        }
        String valueOf = String.valueOf(dbrz.e("/").g(c));
        String concat = valueOf.length() != 0 ? "/".concat(valueOf) : new String("/");
        this.b = concat;
        String scheme = parse.getScheme();
        StringBuilder sb = new StringBuilder(String.valueOf(scheme).length() + 3 + String.valueOf(lowerCase).length() + String.valueOf(concat).length());
        sb.append(scheme);
        sb.append("://");
        sb.append(lowerCase);
        sb.append(concat);
        this.c = sb.toString();
    }

    public final String a() {
        return this.d.getString("PAIDCONTENT_COOKIE", "");
    }
}

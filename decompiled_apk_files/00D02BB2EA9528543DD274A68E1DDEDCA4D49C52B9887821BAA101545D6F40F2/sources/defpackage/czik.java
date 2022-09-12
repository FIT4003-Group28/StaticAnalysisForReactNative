package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: czik  reason: default package */
/* loaded from: classes5.dex */
public final class czik {
    public String a;
    private String c = "files";
    private String d = "common";
    public Account b = czil.b;
    private String e = "";
    private final dccx<String> f = dcdc.F();

    public czik(Context context) {
        czjf.a(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public final Uri a() {
        return new Uri.Builder().scheme("android").authority(this.a).path(String.format("/%s/%s/%s/%s", this.c, this.d, czig.a(this.b), this.e)).encodedFragment(czje.b(this.f.f())).build();
    }

    public final void b(String str) {
        czjf.a(czil.d.contains(str), "The only supported locations are %s: %s", czil.d, str);
        this.c = str;
    }

    public final void c(String str) {
        czjf.a(czil.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        czjf.a(!czil.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.d = str;
    }

    public final void d(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = czil.a;
        this.e = str;
    }
}

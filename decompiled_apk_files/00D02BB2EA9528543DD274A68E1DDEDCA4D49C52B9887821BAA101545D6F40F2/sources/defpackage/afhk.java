package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: afhk  reason: default package */
/* loaded from: classes2.dex */
public final class afhk {
    private final Uri.Builder a = new Uri.Builder().scheme("http").authority("maps.google.com").path("maps");

    private afhk() {
    }

    public static afhk a() {
        return new afhk();
    }

    public final Uri b() {
        return this.a.build();
    }

    public final void c(double d, double d2) {
        Uri.Builder builder = this.a;
        StringBuilder sb = new StringBuilder(49);
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        builder.appendQueryParameter("ll", sb.toString());
    }

    public final void d(String str) {
        this.a.appendQueryParameter("q", str);
    }

    public final void e(float f) {
        this.a.appendQueryParameter("z", Float.toString(f));
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* compiled from: PG */
/* renamed from: cwwt  reason: default package */
/* loaded from: classes5.dex */
final class cwwt {
    public static final Long g = 341489692L;
    public final Context a;
    public final String b;
    public final String c;
    @dzsi
    public final String d;
    public final cqvq e;
    public final dbty<Long> f;
    @dzsi
    public final dbty<cwsv> h;
    public final int i;

    public cwwt(Context context, dbsg<cwwh> dbsgVar, @dzsi String str) {
        int i;
        this.a = context;
        this.b = context.getPackageName();
        int i2 = cwuu.b;
        String packageName = context.getPackageName();
        String d = cwuu.d();
        dbty<cwsv> dbtyVar = null;
        if (d != null && packageName != null && d.startsWith(packageName)) {
            int length = packageName.length();
            d = d.length() == length ? null : d.substring(length + 1);
        }
        this.c = d;
        this.h = dbsgVar.a() ? dbsgVar.b().a() : dbtyVar;
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            i = 3;
        } else {
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        }
        if (Build.VERSION.SDK_INT >= 23 && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
            i = 5;
        }
        this.i = i;
        this.e = new cqvq(context);
        this.f = dbud.a(new dbty(this) { // from class: cwws
            private final cwwt a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Long.valueOf(this.a.e.a().getTotalSpace() / 1024);
            }
        });
    }
}

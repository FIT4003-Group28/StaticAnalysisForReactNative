package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* compiled from: PG */
/* renamed from: uvq  reason: default package */
/* loaded from: classes4.dex */
public final class uvq {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final tih e;
    public final amqo f;
    public final amqo g;
    public final int h;

    public uvq(Context context, String str) {
        int i;
        this.a = context;
        this.b = context.getPackageName();
        int i2 = uul.b;
        String packageName = context.getPackageName();
        String b = uul.b();
        if (b != null && packageName != null && b.startsWith(packageName)) {
            int length = packageName.length();
            b = b.length() == length ? null : b.substring(length + 1);
        }
        this.c = b;
        this.g = null;
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
        this.h = i;
        this.e = new tih(context);
        this.f = aqxo.i(new amqo() { // from class: uvp
            @Override // defpackage.amqo
            public final Object get() {
                return Long.valueOf(uvq.this.e.a().getTotalSpace() / 1024);
            }
        });
    }
}

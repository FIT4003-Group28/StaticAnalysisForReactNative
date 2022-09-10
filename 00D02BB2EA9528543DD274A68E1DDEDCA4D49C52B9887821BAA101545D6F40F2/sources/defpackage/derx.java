package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
/* compiled from: PG */
/* renamed from: derx  reason: default package */
/* loaded from: classes6.dex */
public final class derx {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public derx(Context context) {
        this.a = context;
    }

    private final synchronized void f() {
        PackageInfo g = g(this.a.getPackageName());
        if (g != null) {
            this.b = Integer.toString(g.versionCode);
            this.c = g.versionName;
        }
    }

    private final PackageInfo g(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }

    public static String getDefaultSenderId(dela delaVar) {
        String str = delaVar.c().c;
        if (str != null) {
            return str;
        }
        String str2 = delaVar.c().b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (!str3.isEmpty()) {
            return str3;
        }
        return null;
    }

    public final boolean a() {
        return b() != 0;
    }

    public final synchronized int b() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        int i2 = 1;
        if (!cnxs.a()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.e = 2;
            return 2;
        }
        if (cnxs.a()) {
            this.e = 2;
            i2 = 2;
        } else {
            this.e = 1;
        }
        return i2;
    }

    public final synchronized String c() {
        if (this.b == null) {
            f();
        }
        return this.b;
    }

    public final synchronized String d() {
        if (this.c == null) {
            f();
        }
        return this.c;
    }

    public final synchronized int e() {
        PackageInfo g;
        if (this.d == 0 && (g = g("com.google.android.gms")) != null) {
            this.d = g.versionCode;
        }
        return this.d;
    }
}

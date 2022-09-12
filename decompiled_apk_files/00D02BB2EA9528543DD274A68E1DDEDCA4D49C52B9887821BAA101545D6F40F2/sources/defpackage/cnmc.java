package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
/* compiled from: PG */
/* renamed from: cnmc  reason: default package */
/* loaded from: classes5.dex */
public final class cnmc {
    private final Context a;
    private int b;
    private int c = 0;

    public cnmc(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (cnyb.b(this.a).c("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        int i2 = 1;
        if (!cnxs.a()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.c = 2;
            return 2;
        }
        if (cnxs.a()) {
            this.c = 2;
            i2 = 2;
        } else {
            this.c = 1;
        }
        return i2;
    }

    public final synchronized int b() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = cnyb.b(this.a).b("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                sb.toString();
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }
}

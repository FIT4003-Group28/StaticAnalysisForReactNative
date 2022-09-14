package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9223a;

    /* renamed from: b  reason: collision with root package name */
    private String f9224b;

    /* renamed from: c  reason: collision with root package name */
    private String f9225c;

    /* renamed from: d  reason: collision with root package name */
    private int f9226d;

    /* renamed from: e  reason: collision with root package name */
    private int f9227e = 0;

    public f0(Context context) {
        this.f9223a = context;
    }

    private PackageInfo a(String str) {
        try {
            return this.f9223a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String a(c.e.b.d dVar) {
        String e2 = dVar.d().e();
        if (e2 != null) {
            return e2;
        }
        String b2 = dVar.d().b();
        if (!b2.startsWith("1:")) {
            return b2;
        }
        String[] split = b2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (!str.isEmpty()) {
            return str;
        }
        return null;
    }

    private synchronized void f() {
        PackageInfo a2 = a(this.f9223a.getPackageName());
        if (a2 != null) {
            this.f9224b = Integer.toString(a2.versionCode);
            this.f9225c = a2.versionName;
        }
    }

    public synchronized String a() {
        if (this.f9224b == null) {
            f();
        }
        return this.f9224b;
    }

    public synchronized String b() {
        if (this.f9225c == null) {
            f();
        }
        return this.f9225c;
    }

    public synchronized int c() {
        PackageInfo a2;
        if (this.f9226d == 0 && (a2 = a("com.google.android.gms")) != null) {
            this.f9226d = a2.versionCode;
        }
        return this.f9226d;
    }

    public synchronized int d() {
        if (this.f9227e != 0) {
            return this.f9227e;
        }
        PackageManager packageManager = this.f9223a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.l.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f9227e = 1;
                return this.f9227e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f9227e = 2;
            return this.f9227e;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.l.i()) {
            this.f9227e = 2;
        } else {
            this.f9227e = 1;
        }
        return this.f9227e;
    }

    public boolean e() {
        return d() != 0;
    }
}

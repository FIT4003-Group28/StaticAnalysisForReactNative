package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cjyd  reason: default package */
/* loaded from: classes4.dex */
public final class cjyd implements bvkz {
    private final Application a;
    private final ckcw b;
    private final Executor c;

    public cjyd(Application application, ckcw ckcwVar, Executor executor) {
        this.a = application;
        this.b = ckcwVar;
        this.c = executor;
    }

    @Override // defpackage.bvkz
    public final Executor a() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        int i;
        String str;
        String str2;
        ckcw ckcwVar = this.b;
        Application application = this.a;
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences("art.pref", 0);
        File file2 = new File(application.getApplicationInfo().sourceDir);
        File file3 = new File(file2, "oat");
        if (file3.exists()) {
            File file4 = new File(file3, "arm64");
            if (!file4.exists()) {
                file4 = new File(file3, "arm");
                i = 4;
            } else {
                i = 3;
            }
            if (!file4.exists()) {
                file4 = new File(file3, "x86_64");
                i = 5;
            }
            if (!file4.exists()) {
                file4 = new File(file3, "x86");
                i = 6;
            }
            if (!file4.exists()) {
                file = file4;
                i = 2;
            } else {
                file = file4;
            }
        } else {
            file = file3;
            i = 1;
        }
        String packageName = application.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 19);
        sb.append("cur/0/");
        sb.append(packageName);
        sb.append("/");
        sb.append("primary.prof");
        File file5 = new File("/data/misc/profiles", sb.toString());
        StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 17);
        sb2.append("ref/");
        sb2.append(packageName);
        sb2.append("/");
        sb2.append("primary.prof");
        cryx cryxVar = new cryx(i, file2, file, file5, new File("/data/misc/profiles", sb2.toString()));
        try {
            str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        if (!str.equals(sharedPreferences.getString("profiles_logged_version", null))) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("profiles_logged_version", str);
            edit.putLong("profiles_initial_oat_odex_size", cryxVar.b());
            edit.putLong("profiles_initial_ref_size", Math.max(cryxVar.e(), 0L));
            edit.commit();
            long f = cryx.f(new File(cryxVar.a, "base.dm"));
            boolean canWrite = cryxVar.b.canWrite();
            long d = cryxVar.d();
            boolean canWrite2 = cryxVar.c.canWrite();
            long e = cryxVar.e();
            str2 = "profiles_initial_oat_odex_size";
            long a = cryxVar.a();
            long b = cryxVar.b();
            long c = cryxVar.c();
            long a2 = cryy.a(cryxVar);
            ckcwVar.t(ckdh.a, f);
            ckcwVar.n(ckdh.d, canWrite);
            ckcwVar.t(ckdh.b, d);
            ckcwVar.n(ckdh.e, canWrite2);
            ckcwVar.t(ckdh.c, e);
            ckcwVar.t(ckdh.g, a);
            ckcwVar.t(ckdh.h, b);
            ckcwVar.t(ckdh.i, c);
            ckcwVar.t(ckdh.f, a2);
        } else {
            str2 = "profiles_initial_oat_odex_size";
        }
        if (sharedPreferences.contains("profiles_initial_ref_size")) {
            long max = Math.max(cryxVar.e(), 0L) - sharedPreferences.getLong("profiles_initial_ref_size", 0L);
            if (max != 0) {
                long a3 = cryy.a(cryxVar);
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.remove("profiles_initial_ref_size");
                edit2.commit();
                long j = sharedPreferences.getLong(str2, 0L);
                long b2 = cryxVar.b();
                ckcwVar.t(ckdh.j, max);
                ckcwVar.t(ckdh.l, a3);
                ckcwVar.t(ckdh.k, b2 - j);
            }
        }
        boolean canWrite3 = cryxVar.b.canWrite();
        long d2 = cryxVar.d();
        long e2 = cryxVar.e();
        long a4 = cryxVar.a();
        long b3 = cryxVar.b();
        long c2 = cryxVar.c();
        int i2 = cryxVar.d;
        ckcwVar.n(ckdh.r, canWrite3);
        ckcwVar.t(ckdh.m, d2);
        ckcwVar.t(ckdh.n, e2);
        ckcwVar.t(ckdh.o, a4);
        ckcwVar.t(ckdh.p, b3);
        ckcwVar.t(ckdh.q, c2);
        ckcwVar.s(ckdh.s, i2 - 1);
    }
}

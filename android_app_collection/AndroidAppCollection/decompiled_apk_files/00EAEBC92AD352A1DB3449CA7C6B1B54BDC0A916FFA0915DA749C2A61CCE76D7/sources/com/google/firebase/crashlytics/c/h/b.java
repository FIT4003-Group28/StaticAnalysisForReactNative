package com.google.firebase.crashlytics.c.h;

import android.content.Context;
import android.content.pm.PackageInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f8612a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8613b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8614c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8615d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8616e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8617f;

    public b(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f8612a = str;
        this.f8613b = str2;
        this.f8614c = str3;
        this.f8615d = str4;
        this.f8616e = str5;
        this.f8617f = str6;
    }

    public static b a(Context context, y yVar, String str, String str2) {
        String packageName = context.getPackageName();
        String c2 = yVar.c();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new b(str, str2, c2, packageName, num, str3);
    }
}

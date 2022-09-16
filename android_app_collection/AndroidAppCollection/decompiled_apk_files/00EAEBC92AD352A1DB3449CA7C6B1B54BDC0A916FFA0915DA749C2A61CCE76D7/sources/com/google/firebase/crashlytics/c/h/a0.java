package com.google.firebase.crashlytics.c.h;

import android.content.Context;
/* loaded from: classes.dex */
class a0 {

    /* renamed from: a  reason: collision with root package name */
    private String f8611a;

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        if (this.f8611a == null) {
            this.f8611a = b(context);
        }
        return "".equals(this.f8611a) ? null : this.f8611a;
    }
}

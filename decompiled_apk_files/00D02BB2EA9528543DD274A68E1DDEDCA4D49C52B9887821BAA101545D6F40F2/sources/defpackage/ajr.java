package defpackage;

import android.app.Activity;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: ajr  reason: default package */
/* loaded from: classes.dex */
public final class ajr implements Runnable {
    final /* synthetic */ String[] a;
    final /* synthetic */ Activity b;
    final /* synthetic */ int c;

    public ajr(String[] strArr, Activity activity, int i) {
        this.a = strArr;
        this.b = activity;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[this.a.length];
        PackageManager packageManager = this.b.getPackageManager();
        String packageName = this.b.getPackageName();
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.a[i], packageName);
        }
        ((ajt) this.b).onRequestPermissionsResult(this.c, this.a, iArr);
    }
}

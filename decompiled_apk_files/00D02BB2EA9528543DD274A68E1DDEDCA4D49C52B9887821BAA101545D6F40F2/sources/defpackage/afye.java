package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
/* compiled from: PG */
/* renamed from: afye  reason: default package */
/* loaded from: classes2.dex */
public final class afye {
    public final btvo a;
    private final int b;

    public afye(Context context, btvo btvoVar) {
        int i;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                i = (int) packageInfo.getLongVersionCode();
            } else {
                i = packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        this.a = btvoVar;
        this.b = i;
    }

    public final boolean a(int i) {
        return this.b >= i;
    }
}

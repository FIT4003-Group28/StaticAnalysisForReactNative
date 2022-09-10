package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: dfde  reason: default package */
/* loaded from: classes6.dex */
public final class dfde implements dcsp {
    private final dfdd a;

    public dfde(Context context, huj hujVar, huk hukVar) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.a = new dfdd(context, packageInfo.versionCode, packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new AssertionError("Could not find our own package, this should be impossible.\nNo app version will appear in logs.");
        }
    }

    @Override // defpackage.dcsp
    public final dcrl a(String str) {
        return this.a;
    }
}

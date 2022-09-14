package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.Set;
/* compiled from: PG */
/* renamed from: btcw  reason: default package */
/* loaded from: classes4.dex */
public final class btcw {
    public final dali a;
    private final Context b;

    public btcw(Context context) {
        dali a = dalj.a(context);
        this.b = context;
        this.a = a;
    }

    public final Set<String> a() {
        return this.a.d();
    }

    public final boolean b() {
        try {
            ApplicationInfo applicationInfo = this.b.getPackageManager().getApplicationInfo(this.b.getPackageName(), 128);
            return (applicationInfo == null || applicationInfo.metaData == null || applicationInfo.metaData.getInt("com.android.vending.splits") == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}

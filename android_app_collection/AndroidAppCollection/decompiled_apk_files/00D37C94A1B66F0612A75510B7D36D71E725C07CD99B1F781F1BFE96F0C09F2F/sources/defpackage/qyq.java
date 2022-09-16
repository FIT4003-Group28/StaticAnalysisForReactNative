package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
/* compiled from: PG */
/* renamed from: qyq  reason: default package */
/* loaded from: classes4.dex */
public final class qyq {
    public final Context a;

    public qyq(Context context) {
        this.a = context;
    }

    public final int a(String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public final int b(String str, String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    public final ApplicationInfo c(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo d(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final boolean e() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return qzv.j(this.a);
        }
        if (twx.g() && (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return this.a.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}

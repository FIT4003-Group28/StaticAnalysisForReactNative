package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
/* compiled from: PG */
/* renamed from: jc  reason: default package */
/* loaded from: classes.dex */
public final class jc {
    public static int a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = Build.VERSION.SDK_INT >= 23 ? AppOpsManager.permissionToOp(str) : null;
            if (permissionToOp == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
            }
            return (Build.VERSION.SDK_INT < 23 || ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) != 0) ? -2 : 0;
        }
        return -1;
    }
}

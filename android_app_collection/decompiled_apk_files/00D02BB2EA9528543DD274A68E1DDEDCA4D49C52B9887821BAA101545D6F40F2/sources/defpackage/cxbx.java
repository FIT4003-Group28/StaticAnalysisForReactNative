package defpackage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cxbx  reason: default package */
/* loaded from: classes5.dex */
final class cxbx {
    private final String a;
    private final Class<?>[] b;

    public cxbx(String str, Class<?>[] clsArr) {
        this.a = str;
        this.b = clsArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        Object[] objArr;
        try {
            Method method = packageManager.getClass().getMethod(this.a, this.b);
            Class<?>[] clsArr = this.b;
            int length = clsArr.length;
            if (length != 2) {
                if (length == 3 && clsArr[0] == String.class && clsArr[1] == Integer.TYPE && this.b[2] == IPackageStatsObserver.class) {
                    objArr = new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
                    method.invoke(packageManager, objArr);
                    return true;
                }
                throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
            }
            if (clsArr[0] == String.class && clsArr[1] == IPackageStatsObserver.class) {
                objArr = new Object[]{str, iPackageStatsObserver};
                method.invoke(packageManager, objArr);
                return true;
            }
            throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
        } catch (Error | Exception unused) {
            int i2 = cxby.b;
            Arrays.asList(this.b);
            return false;
        } catch (NoSuchMethodException unused2) {
            int i3 = cxby.b;
            return false;
        }
    }
}

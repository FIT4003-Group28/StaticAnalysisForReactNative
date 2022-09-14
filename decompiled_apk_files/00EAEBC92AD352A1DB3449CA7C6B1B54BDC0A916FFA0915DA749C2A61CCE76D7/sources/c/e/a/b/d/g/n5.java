package c.e.a.b.d.g;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class n5 extends e1 implements p2 {
    public static p2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof p2 ? (p2) queryLocalInterface : new n4(iBinder);
    }
}

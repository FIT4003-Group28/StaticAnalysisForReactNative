package c.e.a.b.d.g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class n4 extends a implements p2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n4(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // c.e.a.b.d.g.p2
    public final Bundle a(Bundle bundle) {
        Parcel e2 = e();
        b0.a(e2, bundle);
        Parcel a2 = a(1, e2);
        Bundle bundle2 = (Bundle) b0.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }
}

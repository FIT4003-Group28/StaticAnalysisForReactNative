package c.e.a.b.d.g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class pd extends a implements nd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public pd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // c.e.a.b.d.g.nd
    public final void a(Bundle bundle) {
        Parcel e2 = e();
        b0.a(e2, bundle);
        b(1, e2);
    }
}

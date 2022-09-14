package c.e.a.b.d.g;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class qd extends e1 implements nd {
    public qd() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // c.e.a.b.d.g.e1
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((Bundle) b0.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

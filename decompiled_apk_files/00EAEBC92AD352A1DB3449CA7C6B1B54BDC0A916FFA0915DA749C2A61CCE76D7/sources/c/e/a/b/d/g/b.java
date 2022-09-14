package c.e.a.b.d.g;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class b extends e1 implements c {
    public b() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // c.e.a.b.d.g.e1
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a(parcel.readString(), parcel.readString(), (Bundle) b0.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int f2 = f();
            parcel2.writeNoException();
            parcel2.writeInt(f2);
        }
        return true;
    }
}

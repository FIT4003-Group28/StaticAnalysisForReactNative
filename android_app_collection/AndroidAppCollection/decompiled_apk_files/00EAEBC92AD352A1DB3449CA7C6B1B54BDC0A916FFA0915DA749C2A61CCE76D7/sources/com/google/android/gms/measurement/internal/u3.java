package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Collection;
/* loaded from: classes.dex */
public abstract class u3 extends c.e.a.b.d.g.e1 implements r3 {
    public u3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // c.e.a.b.d.g.e1
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        Collection a2;
        switch (i) {
            case 1:
                a((p) c.e.a.b.d.g.b0.a(parcel, p.CREATOR), (fa) c.e.a.b.d.g.b0.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                a((y9) c.e.a.b.d.g.b0.a(parcel, y9.CREATOR), (fa) c.e.a.b.d.g.b0.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                a((fa) c.e.a.b.d.g.b0.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                a((p) c.e.a.b.d.g.b0.a(parcel, p.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                b((fa) c.e.a.b.d.g.b0.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                a2 = a((fa) c.e.a.b.d.g.b0.a(parcel, fa.CREATOR), c.e.a.b.d.g.b0.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a2);
                return true;
            case 9:
                byte[] a3 = a((p) c.e.a.b.d.g.b0.a(parcel, p.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a3);
                return true;
            case 10:
                a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String c2 = c((fa) c.e.a.b.d.g.b0.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c2);
                return true;
            case 12:
                a((oa) c.e.a.b.d.g.b0.a(parcel, oa.CREATOR), (fa) c.e.a.b.d.g.b0.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                a((oa) c.e.a.b.d.g.b0.a(parcel, oa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                a2 = a(parcel.readString(), parcel.readString(), c.e.a.b.d.g.b0.a(parcel), (fa) c.e.a.b.d.g.b0.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a2);
                return true;
            case 15:
                a2 = a(parcel.readString(), parcel.readString(), parcel.readString(), c.e.a.b.d.g.b0.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a2);
                return true;
            case 16:
                a2 = a(parcel.readString(), parcel.readString(), (fa) c.e.a.b.d.g.b0.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a2);
                return true;
            case 17:
                a2 = a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a2);
                return true;
            case 18:
                d((fa) c.e.a.b.d.g.b0.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                a((Bundle) c.e.a.b.d.g.b0.a(parcel, Bundle.CREATOR), (fa) c.e.a.b.d.g.b0.a(parcel, fa.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}

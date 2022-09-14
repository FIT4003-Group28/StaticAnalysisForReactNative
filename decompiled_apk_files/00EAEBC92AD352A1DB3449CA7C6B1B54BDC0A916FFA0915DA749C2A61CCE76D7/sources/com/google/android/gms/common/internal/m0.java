package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class m0 extends c.e.a.b.d.c.b implements l0 {
    public m0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static l0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof l0 ? (l0) queryLocalInterface : new n0(iBinder);
    }

    @Override // c.e.a.b.d.c.b
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            c.e.a.b.c.a j = j();
            parcel2.writeNoException();
            c.e.a.b.d.c.c.a(parcel2, j);
        } else if (i != 2) {
            return false;
        } else {
            int l = l();
            parcel2.writeNoException();
            parcel2.writeInt(l);
        }
        return true;
    }
}

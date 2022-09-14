package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface n extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends c.e.a.b.d.c.b implements n {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // c.e.a.b.d.c.b
        protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.e.a.b.d.c.c.a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                a(parcel.readInt(), (Bundle) c.e.a.b.d.c.c.a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                a(parcel.readInt(), parcel.readStrongBinder(), (e0) c.e.a.b.d.c.c.a(parcel, e0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(int i, Bundle bundle);

    void a(int i, IBinder iBinder, Bundle bundle);

    void a(int i, IBinder iBinder, e0 e0Var);
}

package com.google.android.libraries.lens.sdk.intent;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class BinderBitmap implements Parcelable {
    public static final Parcelable.Creator<BinderBitmap> CREATOR = new csfm();
    private final Bundle a;
    @dzsi
    private final csfn b;

    public BinderBitmap(Bitmap bitmap) {
        csfn csfnVar = new csfn(bitmap);
        this.b = csfnVar;
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putBinder("binder", csfnVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public BinderBitmap(Parcel parcel) {
        this.b = null;
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.a = readBundle;
        IBinder binder = readBundle.getBinder("binder");
        if (binder != null) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                binder.transact(1, obtain, obtain2, 0);
            } catch (RemoteException unused) {
            }
            obtain2.readException();
            Bundle readBundle2 = obtain2.readBundle(Bundle.class.getClassLoader());
            if (readBundle2 != null) {
                Bitmap bitmap = (Bitmap) readBundle2.getParcelable("bitmap");
            }
            obtain.recycle();
            obtain2.recycle();
        }
    }
}

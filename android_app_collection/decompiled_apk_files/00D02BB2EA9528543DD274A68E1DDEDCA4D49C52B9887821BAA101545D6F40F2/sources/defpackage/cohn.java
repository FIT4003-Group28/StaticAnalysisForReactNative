package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cohn  reason: default package */
/* loaded from: classes5.dex */
public abstract class cohn extends clb implements coho {
    public cohn() {
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        coba coayVar;
        coba coayVar2;
        if (i == 2) {
            String readString = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            cohm cohmVar = null;
            if (readStrongBinder == null) {
                coayVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof coba) {
                    coayVar = (coba) queryLocalInterface;
                } else {
                    coayVar = new coay(readStrongBinder);
                }
            }
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 == null) {
                coayVar2 = null;
            } else {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface2 instanceof coba) {
                    coayVar2 = (coba) queryLocalInterface2;
                } else {
                    coayVar2 = new coay(readStrongBinder2);
                }
            }
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                if (queryLocalInterface3 instanceof cohm) {
                    cohmVar = (cohm) queryLocalInterface3;
                } else {
                    cohmVar = new cohm(readStrongBinder3);
                }
            }
            b(readString, coayVar, coayVar2, cohmVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

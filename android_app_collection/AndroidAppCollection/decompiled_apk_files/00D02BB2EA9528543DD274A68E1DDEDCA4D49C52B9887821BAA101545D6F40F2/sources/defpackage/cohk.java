package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cohk  reason: default package */
/* loaded from: classes5.dex */
public abstract class cohk extends clb implements cohl {
    public cohk() {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        cohj cohjVar;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                cohjVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
                if (queryLocalInterface instanceof cohj) {
                    cohjVar = (cohj) queryLocalInterface;
                } else {
                    cohjVar = new cohj(readStrongBinder);
                }
            }
            c(cohjVar);
        } else if (i == 3) {
            parcel.readInt();
            d();
        } else if (i != 4) {
            return false;
        } else {
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}

package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: clb  reason: default package */
/* loaded from: classes.dex */
public class clb extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public clb(String str) {
        attachInterface(this, str);
    }

    protected boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return Sw(i, parcel, parcel2);
    }
}

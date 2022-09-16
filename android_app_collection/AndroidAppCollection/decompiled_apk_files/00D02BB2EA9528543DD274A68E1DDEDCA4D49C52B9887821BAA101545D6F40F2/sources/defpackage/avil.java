package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: avil  reason: default package */
/* loaded from: classes3.dex */
public abstract class avil extends clb implements avim {
    public avil() {
        super("com.google.android.apps.gmm.offline.api.aidl.IOfflineExternalSearch");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        avhe avheVar = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gmm.offline.aidl.shared.IProtoResultListener");
                if (queryLocalInterface instanceof avhe) {
                    avheVar = (avhe) queryLocalInterface;
                } else {
                    avheVar = new avhe(readStrongBinder);
                }
            }
            b(avheVar);
        } else if (i == 2) {
            byte[] createByteArray = parcel.createByteArray();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.apps.gmm.offline.aidl.shared.IProtoResultListener");
                if (queryLocalInterface2 instanceof avhe) {
                    avheVar = (avhe) queryLocalInterface2;
                } else {
                    avheVar = new avhe(readStrongBinder2);
                }
            }
            c(createByteArray, avheVar);
        } else if (i != 3) {
            return false;
        } else {
            byte[] createByteArray2 = parcel.createByteArray();
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.apps.gmm.offline.aidl.shared.IProtoResultListener");
                if (queryLocalInterface3 instanceof avhe) {
                    avheVar = (avhe) queryLocalInterface3;
                } else {
                    avheVar = new avhe(readStrongBinder3);
                }
            }
            d(createByteArray2, avheVar);
        }
        return true;
    }
}

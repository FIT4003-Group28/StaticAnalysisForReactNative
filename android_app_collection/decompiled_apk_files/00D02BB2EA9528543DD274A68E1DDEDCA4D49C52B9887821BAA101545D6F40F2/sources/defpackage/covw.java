package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
/* compiled from: PG */
/* renamed from: covw  reason: default package */
/* loaded from: classes.dex */
public abstract class covw extends clb implements covx {
    public covw() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 12) {
            parcel.readInt();
            SyncStatus syncStatus = (SyncStatus) clc.d(parcel, SyncStatus.CREATOR);
            return true;
        } else if (i == 18) {
            parcel.readInt();
            SyncStatus syncStatus2 = (SyncStatus) clc.d(parcel, SyncStatus.CREATOR);
            return true;
        } else if (i == 15) {
            parcel.readInt();
            parcel.readString();
            return true;
        } else if (i == 16) {
            parcel.readInt();
            MatrixCursorParcelable matrixCursorParcelable = (MatrixCursorParcelable) clc.d(parcel, MatrixCursorParcelable.CREATOR);
            return true;
        } else {
            switch (i) {
                case 1:
                    int readInt = parcel.readInt();
                    Bundle bundle = (Bundle) clc.d(parcel, Bundle.CREATOR);
                    d(readInt, (Bundle) clc.d(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    b(parcel.readInt(), (Bundle) clc.d(parcel, Bundle.CREATOR), (DataHolder) clc.d(parcel, DataHolder.CREATOR));
                    return true;
                case 3:
                    parcel.readInt();
                    Bundle bundle2 = (Bundle) clc.d(parcel, Bundle.CREATOR);
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) clc.d(parcel, ParcelFileDescriptor.CREATOR);
                    e();
                    return true;
                case 4:
                    parcel.readInt();
                    Bundle bundle3 = (Bundle) clc.d(parcel, Bundle.CREATOR);
                    DataHolder[] dataHolderArr = (DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR);
                    return true;
                case 5:
                    c(parcel.readInt(), (Bundle) clc.d(parcel, Bundle.CREATOR), (ParcelFileDescriptor) clc.d(parcel, ParcelFileDescriptor.CREATOR), (Bundle) clc.d(parcel, Bundle.CREATOR));
                    return true;
                case 6:
                    parcel.readInt();
                    BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity = (BackedUpContactsPerDeviceEntity) clc.d(parcel, BackedUpContactsPerDeviceEntity.CREATOR);
                    return true;
                case 7:
                    parcel.readInt();
                    PersonEntity personEntity = (PersonEntity) clc.d(parcel, PersonEntity.CREATOR);
                    return true;
                case 8:
                    parcel.readInt();
                    return true;
                default:
                    return false;
            }
        }
    }
}

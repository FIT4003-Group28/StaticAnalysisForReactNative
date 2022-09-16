package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
/* compiled from: PG */
/* renamed from: rsl  reason: default package */
/* loaded from: classes4.dex */
public class rsl extends dvd implements IInterface {
    public rsl() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    public void a(int i, Bundle bundle, DataHolder dataHolder) {
    }

    public void b(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
    }

    public void c(int i, Bundle bundle) {
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 12) {
            parcel.readInt();
            SyncStatus syncStatus = (SyncStatus) dve.a(parcel, SyncStatus.CREATOR);
            return true;
        } else if (i == 18) {
            parcel.readInt();
            SyncStatus syncStatus2 = (SyncStatus) dve.a(parcel, SyncStatus.CREATOR);
            return true;
        } else if (i == 15) {
            parcel.readInt();
            parcel.readString();
            return true;
        } else if (i == 16) {
            parcel.readInt();
            MatrixCursorParcelable matrixCursorParcelable = (MatrixCursorParcelable) dve.a(parcel, MatrixCursorParcelable.CREATOR);
            return true;
        } else {
            switch (i) {
                case 1:
                    int readInt = parcel.readInt();
                    Bundle bundle = (Bundle) dve.a(parcel, Bundle.CREATOR);
                    c(readInt, (Bundle) dve.a(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    a(parcel.readInt(), (Bundle) dve.a(parcel, Bundle.CREATOR), (DataHolder) dve.a(parcel, DataHolder.CREATOR));
                    return true;
                case 3:
                    parcel.readInt();
                    Bundle bundle2 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) dve.a(parcel, ParcelFileDescriptor.CREATOR);
                    throw new RuntimeException("Shouldn't be called");
                case 4:
                    parcel.readInt();
                    Bundle bundle3 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                    DataHolder[] dataHolderArr = (DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR);
                    return true;
                case 5:
                    b(parcel.readInt(), (Bundle) dve.a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) dve.a(parcel, ParcelFileDescriptor.CREATOR), (Bundle) dve.a(parcel, Bundle.CREATOR));
                    return true;
                case 6:
                    parcel.readInt();
                    BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity = (BackedUpContactsPerDeviceEntity) dve.a(parcel, BackedUpContactsPerDeviceEntity.CREATOR);
                    return true;
                case 7:
                    parcel.readInt();
                    PersonEntity personEntity = (PersonEntity) dve.a(parcel, PersonEntity.CREATOR);
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

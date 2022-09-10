package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: ahyv  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahyv extends clb implements ahyw {
    public ahyv() {
        super("com.google.android.apps.gmm.locationsharing.interprocess.api.ILocationSharingReportingService");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        ahyx ahyxVar = null;
        ahyu ahyuVar = null;
        ahyx ahyxVar2 = null;
        ahyy ahyyVar = null;
        if (i == 3) {
            String readString = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gmm.locationsharing.interprocess.api.IReportingStateListener");
                if (queryLocalInterface instanceof ahyx) {
                    ahyxVar = (ahyx) queryLocalInterface;
                } else {
                    ahyxVar = new ahyx(readStrongBinder);
                }
            }
            d(readString, ahyxVar);
            return true;
        } else if (i == 5) {
            String readString2 = parcel.readString();
            PendingIntent pendingIntent = (PendingIntent) clc.d(parcel, PendingIntent.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.apps.gmm.locationsharing.interprocess.api.IShareCreationPrerequisitesStateListener");
                if (queryLocalInterface2 instanceof ahyy) {
                    ahyyVar = (ahyy) queryLocalInterface2;
                } else {
                    ahyyVar = new ahyy(readStrongBinder2);
                }
            }
            c(readString2, pendingIntent, ahyyVar);
            return true;
        } else if (i != 6) {
            if (i != 7) {
                return false;
            }
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.apps.gmm.locationsharing.interprocess.api.IInterfaceVersionListener");
                if (queryLocalInterface3 instanceof ahyu) {
                    ahyuVar = (ahyu) queryLocalInterface3;
                } else {
                    ahyuVar = new ahyu(readStrongBinder3);
                }
            }
            b(ahyuVar);
            return true;
        } else {
            String readString3 = parcel.readString();
            PendingIntent pendingIntent2 = (PendingIntent) clc.d(parcel, PendingIntent.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.apps.gmm.locationsharing.interprocess.api.IReportingStateListener");
                if (queryLocalInterface4 instanceof ahyx) {
                    ahyxVar2 = (ahyx) queryLocalInterface4;
                } else {
                    ahyxVar2 = new ahyx(readStrongBinder4);
                }
            }
            e(readString3, pendingIntent2, ahyxVar2);
            return true;
        }
    }
}

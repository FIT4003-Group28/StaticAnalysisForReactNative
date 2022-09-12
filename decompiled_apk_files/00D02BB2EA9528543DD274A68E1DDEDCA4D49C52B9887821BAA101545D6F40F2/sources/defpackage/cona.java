package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cona  reason: default package */
/* loaded from: classes5.dex */
public abstract class cona extends clb implements conb {
    public cona() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            parcel.createStringArray();
            b(readInt);
        } else if (i == 2) {
            int readInt2 = parcel.readInt();
            parcel.createStringArray();
            d(readInt2);
        } else if (i != 3) {
            return false;
        } else {
            int readInt3 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) clc.d(parcel, PendingIntent.CREATOR);
            c(readInt3);
        }
        return true;
    }
}

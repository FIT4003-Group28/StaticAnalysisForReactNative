package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* compiled from: PG */
/* renamed from: coku  reason: default package */
/* loaded from: classes5.dex */
public abstract class coku extends clb implements cokv {
    public coku() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            e((LocationResult) clc.d(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            f((LocationAvailability) clc.d(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}

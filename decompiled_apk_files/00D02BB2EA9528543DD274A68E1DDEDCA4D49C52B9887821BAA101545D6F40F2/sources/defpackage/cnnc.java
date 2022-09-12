package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
/* compiled from: PG */
/* renamed from: cnnc  reason: default package */
/* loaded from: classes5.dex */
public final class cnnc implements Parcelable.Creator<GoogleCertificatesLookupQuery> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleCertificatesLookupQuery createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 2) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 3) {
                z2 = cnwm.g(parcel, readInt);
            } else if (b == 4) {
                iBinder = cnwm.p(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                z3 = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GoogleCertificatesLookupQuery(str, z, z2, iBinder, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleCertificatesLookupQuery[] newArray(int i) {
        return new GoogleCertificatesLookupQuery[i];
    }
}

package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesQuery;
/* compiled from: PG */
/* renamed from: cnnf  reason: default package */
/* loaded from: classes5.dex */
public final class cnnf implements Parcelable.Creator<GoogleCertificatesQuery> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleCertificatesQuery createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 2) {
                iBinder = cnwm.p(parcel, readInt);
            } else if (b == 3) {
                z = cnwm.g(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                z2 = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GoogleCertificatesQuery(str, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleCertificatesQuery[] newArray(int i) {
        return new GoogleCertificatesQuery[i];
    }
}

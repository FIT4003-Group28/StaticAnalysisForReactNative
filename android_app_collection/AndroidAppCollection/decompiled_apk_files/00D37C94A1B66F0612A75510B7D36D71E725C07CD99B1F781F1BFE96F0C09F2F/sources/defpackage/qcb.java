package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdValueParcel;
/* compiled from: PG */
/* renamed from: qcb  reason: default package */
/* loaded from: classes4.dex */
public final class qcb extends dvd implements qcc {
    public qcb() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            AdValueParcel adValueParcel = (AdValueParcel) dve.a(parcel, AdValueParcel.CREATOR);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

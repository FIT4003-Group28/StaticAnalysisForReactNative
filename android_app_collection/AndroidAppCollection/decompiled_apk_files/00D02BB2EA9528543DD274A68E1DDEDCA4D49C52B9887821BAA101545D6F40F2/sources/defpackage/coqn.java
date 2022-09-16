package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.UlrPrivateModeRequest;
/* compiled from: PG */
/* renamed from: coqn  reason: default package */
/* loaded from: classes.dex */
public final class coqn implements Parcelable.Creator<UlrPrivateModeRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UlrPrivateModeRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new UlrPrivateModeRequest(str, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UlrPrivateModeRequest[] newArray(int i) {
        return new UlrPrivateModeRequest[i];
    }
}

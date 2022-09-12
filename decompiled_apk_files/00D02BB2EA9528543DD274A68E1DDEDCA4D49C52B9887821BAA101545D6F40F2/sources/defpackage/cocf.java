package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
/* compiled from: PG */
/* renamed from: cocf  reason: default package */
/* loaded from: classes5.dex */
public final class cocf implements Parcelable.Creator<GetActivityControlsSettingsResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetActivityControlsSettingsResult createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                bArr = cnwm.s(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GetActivityControlsSettingsResult(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetActivityControlsSettingsResult[] newArray(int i) {
        return new GetActivityControlsSettingsResult[i];
    }
}

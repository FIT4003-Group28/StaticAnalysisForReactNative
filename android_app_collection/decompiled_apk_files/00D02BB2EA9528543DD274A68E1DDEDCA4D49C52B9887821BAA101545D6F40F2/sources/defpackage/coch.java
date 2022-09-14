package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;
/* compiled from: PG */
/* renamed from: coch  reason: default package */
/* loaded from: classes5.dex */
public final class coch implements Parcelable.Creator<UpdateActivityControlsSettingsResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UpdateActivityControlsSettingsResult createFromParcel(Parcel parcel) {
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
        return new UpdateActivityControlsSettingsResult(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UpdateActivityControlsSettingsResult[] newArray(int i) {
        return new UpdateActivityControlsSettingsResult[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.ScoringConfig;
/* compiled from: PG */
/* renamed from: cmqc  reason: default package */
/* loaded from: classes5.dex */
public final class cmqc implements Parcelable.Creator<ScoringConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ScoringConfig createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ScoringConfig(z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ScoringConfig[] newArray(int i) {
        return new ScoringConfig[i];
    }
}
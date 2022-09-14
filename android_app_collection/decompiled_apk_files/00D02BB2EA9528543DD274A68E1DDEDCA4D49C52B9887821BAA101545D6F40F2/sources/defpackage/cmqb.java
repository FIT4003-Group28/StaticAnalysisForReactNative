package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;
/* compiled from: PG */
/* renamed from: cmqb  reason: default package */
/* loaded from: classes5.dex */
public final class cmqb implements Parcelable.Creator<RegisterSectionInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RegisterSectionInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Feature[] featureArr = null;
        String str4 = null;
        ScoringConfig scoringConfig = null;
        boolean z = false;
        int i = 1;
        boolean z2 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 11) {
                str4 = cnwm.o(parcel, readInt);
            } else if (b != 12) {
                switch (b) {
                    case 1:
                        str = cnwm.o(parcel, readInt);
                        continue;
                    case 2:
                        str2 = cnwm.o(parcel, readInt);
                        continue;
                    case 3:
                        z = cnwm.g(parcel, readInt);
                        continue;
                    case 4:
                        i = cnwm.i(parcel, readInt);
                        continue;
                    case 5:
                        z2 = cnwm.g(parcel, readInt);
                        continue;
                    case 6:
                        str3 = cnwm.o(parcel, readInt);
                        continue;
                    case 7:
                        featureArr = (Feature[]) cnwm.z(parcel, readInt, Feature.CREATOR);
                        continue;
                    default:
                        cnwm.d(parcel, readInt);
                        continue;
                }
            } else {
                scoringConfig = (ScoringConfig) cnwm.q(parcel, readInt, ScoringConfig.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new RegisterSectionInfo(str, str2, z, i, z2, str3, featureArr, str4, scoringConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RegisterSectionInfo[] newArray(int i) {
        return new RegisterSectionInfo[i];
    }
}

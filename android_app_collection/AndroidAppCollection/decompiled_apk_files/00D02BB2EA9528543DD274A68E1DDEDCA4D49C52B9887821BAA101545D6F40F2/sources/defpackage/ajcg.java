package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.gmm.locationsharing.modui.shares.AutoValue_CreateSharesFlowFragment_TargetData;
import com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$SavedIntent;
import com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$TargetData;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* compiled from: PG */
/* renamed from: ajcg  reason: default package */
/* loaded from: classes2.dex */
public final class ajcg implements Parcelable.Creator<AutoValue_CreateSharesFlowFragment_TargetData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_CreateSharesFlowFragment_TargetData createFromParcel(Parcel parcel) {
        char c;
        String readString = parcel.readString();
        int hashCode = readString.hashCode();
        int i = 2;
        if (hashCode == -1990968498) {
            if (readString.equals("SENDKIT_RESULT")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 235667316) {
            if (hashCode == 1757717608 && readString.equals("PRESELECTED_PROFILE")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (readString.equals("SAVED_INTENT")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            i = 1;
        } else if (c != 1) {
            if (c != 2) {
                throw new IllegalArgumentException();
            }
            i = 3;
        }
        return new AutoValue_CreateSharesFlowFragment_TargetData(i, (CreateSharesFlowFragment$SavedIntent) parcel.readParcelable(CreateSharesFlowFragment$TargetData.class.getClassLoader()), (SendKitPickerResult) parcel.readParcelable(CreateSharesFlowFragment$TargetData.class.getClassLoader()), (Profile) parcel.readParcelable(CreateSharesFlowFragment$TargetData.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_CreateSharesFlowFragment_TargetData[] newArray(int i) {
        return new AutoValue_CreateSharesFlowFragment_TargetData[i];
    }
}

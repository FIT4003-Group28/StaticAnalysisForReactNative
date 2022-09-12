package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.locationsharing.modui.shares.AutoValue_CreateSharesFlowFragment_SavedIntent;
import com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$SavedIntent;
/* compiled from: PG */
/* renamed from: ajcf  reason: default package */
/* loaded from: classes2.dex */
public final class ajcf implements Parcelable.Creator<AutoValue_CreateSharesFlowFragment_SavedIntent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_CreateSharesFlowFragment_SavedIntent createFromParcel(Parcel parcel) {
        return new AutoValue_CreateSharesFlowFragment_SavedIntent((Intent) parcel.readParcelable(CreateSharesFlowFragment$SavedIntent.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_CreateSharesFlowFragment_SavedIntent[] newArray(int i) {
        return new AutoValue_CreateSharesFlowFragment_SavedIntent[i];
    }
}

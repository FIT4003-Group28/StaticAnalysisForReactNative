package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.transitlinespace.AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState;
/* compiled from: PG */
/* renamed from: ygv  reason: default package */
/* loaded from: classes7.dex */
public final class ygv implements Parcelable.Creator<AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState createFromParcel(Parcel parcel) {
        return new AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState(parcel.readInt() == 0 ? (akqi) parcel.readSerializable() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState[] newArray(int i) {
        return new AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState[i];
    }
}

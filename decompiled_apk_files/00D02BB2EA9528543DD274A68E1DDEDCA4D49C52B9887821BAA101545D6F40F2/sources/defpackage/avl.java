package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.TwoStatePreference;
/* compiled from: PG */
/* renamed from: avl  reason: default package */
/* loaded from: classes3.dex */
public final class avl implements Parcelable.Creator<TwoStatePreference.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TwoStatePreference.SavedState createFromParcel(Parcel parcel) {
        return new TwoStatePreference.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TwoStatePreference.SavedState[] newArray(int i) {
        return new TwoStatePreference.SavedState[i];
    }
}

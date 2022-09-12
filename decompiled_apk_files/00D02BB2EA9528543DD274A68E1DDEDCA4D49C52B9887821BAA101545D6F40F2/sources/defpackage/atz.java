package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: atz  reason: default package */
/* loaded from: classes2.dex */
public final class atz implements Parcelable.Creator<Preference.BaseSavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Preference.BaseSavedState createFromParcel(Parcel parcel) {
        return new Preference.BaseSavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Preference.BaseSavedState[] newArray(int i) {
        return new Preference.BaseSavedState[i];
    }
}

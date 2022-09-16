package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatSpinner$SavedState;
/* compiled from: PG */
/* renamed from: yc  reason: default package */
/* loaded from: classes7.dex */
public final class yc implements Parcelable.Creator<AppCompatSpinner$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AppCompatSpinner$SavedState createFromParcel(Parcel parcel) {
        return new AppCompatSpinner$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AppCompatSpinner$SavedState[] newArray(int i) {
        return new AppCompatSpinner$SavedState[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.BackStackState;
/* compiled from: PG */
/* renamed from: eq  reason: default package */
/* loaded from: classes6.dex */
public final class eq implements Parcelable.Creator<BackStackState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BackStackState createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BackStackState[] newArray(int i) {
        return new BackStackState[i];
    }
}

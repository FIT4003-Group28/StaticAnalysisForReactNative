package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.FragmentManagerState;
/* compiled from: PG */
/* renamed from: gp  reason: default package */
/* loaded from: classes6.dex */
public final class gp implements Parcelable.Creator<FragmentManagerState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FragmentManagerState createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FragmentManagerState[] newArray(int i) {
        return new FragmentManagerState[i];
    }
}

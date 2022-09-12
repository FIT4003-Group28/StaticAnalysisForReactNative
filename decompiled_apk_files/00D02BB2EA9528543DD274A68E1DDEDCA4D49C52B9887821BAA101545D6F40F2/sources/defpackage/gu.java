package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.FragmentState;
/* compiled from: PG */
/* renamed from: gu  reason: default package */
/* loaded from: classes6.dex */
public final class gu implements Parcelable.Creator<FragmentState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FragmentState createFromParcel(Parcel parcel) {
        return new FragmentState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FragmentState[] newArray(int i) {
        return new FragmentState[i];
    }
}

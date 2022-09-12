package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager$SavedState;
/* compiled from: PG */
/* renamed from: aaf  reason: default package */
/* loaded from: classes2.dex */
public final class aaf implements Parcelable.Creator<LinearLayoutManager$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LinearLayoutManager$SavedState createFromParcel(Parcel parcel) {
        return new LinearLayoutManager$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LinearLayoutManager$SavedState[] newArray(int i) {
        return new LinearLayoutManager$SavedState[i];
    }
}

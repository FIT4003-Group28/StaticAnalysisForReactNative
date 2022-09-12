package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayoutManager;
/* compiled from: PG */
/* renamed from: cmpi  reason: default package */
/* loaded from: classes5.dex */
public final class cmpi implements Parcelable.Creator<FlexboxLayoutManager.LayoutParams> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FlexboxLayoutManager.LayoutParams createFromParcel(Parcel parcel) {
        return new FlexboxLayoutManager.LayoutParams(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FlexboxLayoutManager.LayoutParams[] newArray(int i) {
        return new FlexboxLayoutManager.LayoutParams[i];
    }
}

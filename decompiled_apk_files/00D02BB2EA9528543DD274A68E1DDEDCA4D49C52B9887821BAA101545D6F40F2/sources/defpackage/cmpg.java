package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayout;
/* compiled from: PG */
/* renamed from: cmpg  reason: default package */
/* loaded from: classes5.dex */
public final class cmpg implements Parcelable.Creator<FlexboxLayout.LayoutParams> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FlexboxLayout.LayoutParams createFromParcel(Parcel parcel) {
        return new FlexboxLayout.LayoutParams(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FlexboxLayout.LayoutParams[] newArray(int i) {
        return new FlexboxLayout.LayoutParams[i];
    }
}

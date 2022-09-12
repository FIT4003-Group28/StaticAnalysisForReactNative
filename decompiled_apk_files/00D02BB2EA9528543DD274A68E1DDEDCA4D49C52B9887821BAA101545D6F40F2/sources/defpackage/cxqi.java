package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChipInfo;
/* compiled from: PG */
/* renamed from: cxqi  reason: default package */
/* loaded from: classes5.dex */
public final class cxqi implements Parcelable.Creator<ChipInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChipInfo createFromParcel(Parcel parcel) {
        return new ChipInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ChipInfo[] newArray(int i) {
        return new ChipInfo[i];
    }
}

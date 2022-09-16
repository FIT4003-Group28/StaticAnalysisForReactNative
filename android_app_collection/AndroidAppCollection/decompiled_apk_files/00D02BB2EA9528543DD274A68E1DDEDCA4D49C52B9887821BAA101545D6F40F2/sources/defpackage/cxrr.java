package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousCoalescedGroup;
/* compiled from: PG */
/* renamed from: cxrr  reason: default package */
/* loaded from: classes5.dex */
public final class cxrr implements Parcelable.Creator<PopulousCoalescedGroup> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PopulousCoalescedGroup createFromParcel(Parcel parcel) {
        return new PopulousCoalescedGroup(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PopulousCoalescedGroup[] newArray(int i) {
        return new PopulousCoalescedGroup[i];
    }
}

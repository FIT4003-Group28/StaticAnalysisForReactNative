package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousCoalescedChannels;
/* compiled from: PG */
/* renamed from: cxrp  reason: default package */
/* loaded from: classes5.dex */
public final class cxrp implements Parcelable.Creator<PopulousCoalescedChannels> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PopulousCoalescedChannels createFromParcel(Parcel parcel) {
        return new PopulousCoalescedChannels(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PopulousCoalescedChannels[] newArray(int i) {
        return new PopulousCoalescedChannels[i];
    }
}

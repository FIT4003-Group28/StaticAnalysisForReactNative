package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ChipInfo implements Parcelable {
    public static final Parcelable.Creator<ChipInfo> CREATOR = new cxqi();
    public Channel a;
    public CoalescedChannels b;

    public ChipInfo() {
    }

    public ChipInfo(Parcel parcel) {
        this.a = (Channel) parcel.readParcelable(Channel.class.getClassLoader());
        this.b = (CoalescedChannels) parcel.readParcelable(CoalescedChannels.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}

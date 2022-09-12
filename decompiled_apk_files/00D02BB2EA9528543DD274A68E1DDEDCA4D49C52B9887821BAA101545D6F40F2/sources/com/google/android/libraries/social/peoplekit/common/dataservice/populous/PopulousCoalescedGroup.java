package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PopulousCoalescedGroup implements CoalescedChannels {
    public static final Parcelable.Creator<PopulousCoalescedGroup> CREATOR = new cxrr();
    private final List<Channel> a;
    private final List<Channel> b;
    private final int c;

    public PopulousCoalescedGroup(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        parcel.readList(arrayList, PopulousChannel.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        parcel.readList(arrayList2, PopulousChannel.class.getClassLoader());
        this.c = parcel.readInt();
    }

    public PopulousCoalescedGroup(cxrs cxrsVar) {
        this.a = cxrsVar.a;
        this.b = cxrsVar.b;
        this.c = cxrsVar.c;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels
    public final List<Channel> b() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels
    public final List<Channel> c() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels
    public final void d(Context context) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PopulousCoalescedGroup) {
            return this.a.get(0).equals(((PopulousCoalescedGroup) obj).a.get(0));
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
        parcel.writeList(this.b);
        parcel.writeInt(this.c);
    }
}

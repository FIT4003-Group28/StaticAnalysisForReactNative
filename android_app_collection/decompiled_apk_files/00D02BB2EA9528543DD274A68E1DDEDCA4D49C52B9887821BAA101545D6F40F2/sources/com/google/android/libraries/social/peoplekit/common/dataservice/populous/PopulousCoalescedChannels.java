package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PopulousCoalescedChannels implements CoalescedChannels {
    public static final Parcelable.Creator<PopulousCoalescedChannels> CREATOR = new cxrp();
    public List<Channel> a;
    private boolean b;

    public PopulousCoalescedChannels(Parcel parcel) {
        boolean z = false;
        this.b = false;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        parcel.readList(arrayList, PopulousChannel.class.getClassLoader());
        this.b = parcel.readInt() == 1 ? true : z;
    }

    public PopulousCoalescedChannels(cxrq cxrqVar) {
        this.b = false;
        this.a = cxrqVar.a;
    }

    public static cxrq f() {
        return new cxrq();
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels
    public final int a() {
        return this.a.size();
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels
    public final List<Channel> b() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels
    public final List<Channel> c() {
        return null;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels
    public final void d(Context context) {
        if (!this.b) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Channel channel : this.a) {
                if (hashSet.add(channel.b(context))) {
                    arrayList.add(channel);
                }
            }
            this.a = arrayList;
            this.b = true;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PopulousCoalescedChannels) {
            PopulousCoalescedChannels populousCoalescedChannels = (PopulousCoalescedChannels) obj;
            if (a() == populousCoalescedChannels.a()) {
                List<Channel> list = populousCoalescedChannels.a;
                for (int i = 0; i < a(); i++) {
                    if (!this.a.get(i).equals(list.get(i))) {
                        return false;
                    }
                }
                return true;
            }
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
        parcel.writeInt(this.b ? 1 : 0);
    }
}

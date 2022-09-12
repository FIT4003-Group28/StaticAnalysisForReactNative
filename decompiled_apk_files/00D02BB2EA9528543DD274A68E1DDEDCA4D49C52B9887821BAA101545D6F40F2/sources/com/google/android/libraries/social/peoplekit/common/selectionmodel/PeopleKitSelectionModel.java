package com.google.android.libraries.social.peoplekit.common.selectionmodel;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PeopleKitSelectionModel implements Parcelable {
    public static final Parcelable.Creator<PeopleKitSelectionModel> CREATOR = new cxsm();
    public PeopleKitDataLayer a;
    private final Set<Channel> b;
    private final Set<cxso> c;

    public PeopleKitSelectionModel() {
        this.b = new LinkedHashSet();
        this.c = new HashSet();
    }

    public final List<czha> a(Context context) {
        ArrayList arrayList = new ArrayList();
        for (Channel channel : this.b) {
            arrayList.add(channel.z(context));
        }
        return arrayList;
    }

    public final Set<Channel> b() {
        return new LinkedHashSet(this.b);
    }

    public final void c(Channel channel, CoalescedChannels coalescedChannels) {
        dbsk.s(channel);
        dbsk.s(this.a);
        if (this.b.add(channel)) {
            for (cxso cxsoVar : this.c) {
                cxsoVar.v(channel, coalescedChannels);
            }
            this.a.g(channel);
        }
    }

    public final void d(Channel channel) {
        c(channel, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(Channel channel) {
        dbsk.s(channel);
        dbsk.s(this.a);
        if (this.b.remove(channel)) {
            for (cxso cxsoVar : this.c) {
                cxsoVar.w(channel);
            }
            this.a.h(channel);
        }
    }

    public final boolean f(Channel channel) {
        return this.b.contains(channel);
    }

    public final int g() {
        return this.b.size();
    }

    public final boolean h() {
        return this.b.isEmpty();
    }

    public final void i(cxso cxsoVar) {
        this.c.add(cxsoVar);
    }

    public final void j() {
        this.c.clear();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(new ArrayList(this.b));
    }

    public PeopleKitSelectionModel(Parcel parcel) {
        this.c = new HashSet();
        this.b = new LinkedHashSet(parcel.readArrayList(Channel.class.getClassLoader()));
    }
}

package com.google.android.libraries.social.peoplekit;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PeopleKitPickerResult implements SendKitPickerResult {
    public static final Parcelable.Creator<PeopleKitPickerResult> CREATOR = new cxow();
    public final PeopleKitDataLayer a;
    public final Set<Channel> b;
    public czgw c;
    public boolean d;
    private String e;

    public PeopleKitPickerResult(Parcel parcel) {
        this.e = "";
        this.a = (PeopleKitDataLayer) parcel.readParcelable(PeopleKitDataLayer.class.getClassLoader());
        try {
            this.c = ((czgv) czgw.d.bZ().bx(parcel.createByteArray(), dsqa.c())).bK();
        } catch (dsrm unused) {
        }
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, Channel.class.getClassLoader());
        hashSet.addAll(arrayList);
        this.e = parcel.readString();
        this.d = false;
    }

    @Override // com.google.android.libraries.social.sendkit.api.SendKitPickerResult
    public final czgw a() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.sendkit.api.SendKitPickerResult
    public final void b(cxqo cxqoVar, cxrj cxrjVar, Context context) {
        if (!this.d) {
            this.a.s(context, Executors.newCachedThreadPool(), cxqoVar, cxrjVar);
            this.d = true;
        }
        this.a.j(1, this.b);
    }

    @Override // com.google.android.libraries.social.sendkit.api.SendKitPickerResult
    public final void c() {
        if (!this.d) {
            throw new IllegalStateException("PickerResults was not rehydrated for logging.");
        }
        this.a.i(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeByteArray(this.c.bS());
        parcel.writeList(new ArrayList(this.b));
        parcel.writeString(this.e);
    }

    public PeopleKitPickerResult(PeopleKitDataLayer peopleKitDataLayer, czgw czgwVar, Set<Channel> set) {
        this.e = "";
        this.a = peopleKitDataLayer;
        this.c = czgwVar;
        this.b = new HashSet(set);
        this.d = true;
    }
}

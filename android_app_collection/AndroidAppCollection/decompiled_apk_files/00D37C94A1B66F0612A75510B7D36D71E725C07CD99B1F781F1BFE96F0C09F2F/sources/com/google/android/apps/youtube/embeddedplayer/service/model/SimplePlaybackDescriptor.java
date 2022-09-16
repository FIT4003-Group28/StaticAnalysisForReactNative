package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SimplePlaybackDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.innertube.model.a(20);
    public final int a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final int e;
    public final int f;
    public final int g;

    public SimplePlaybackDescriptor(int i, String str, String str2, ArrayList arrayList, int i2, int i3, int i4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public SimplePlaybackDescriptor(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        parcel.readStringList(arrayList);
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    public static SimplePlaybackDescriptor b(String str, int i, int i2, int i3) {
        k kVar = new k();
        kVar.a = 2;
        kVar.c = str;
        kVar.e = i;
        kVar.f = i2;
        kVar.g = i3;
        return kVar.a();
    }

    public static SimplePlaybackDescriptor c(String str, int i) {
        k kVar = new k();
        kVar.a = 1;
        kVar.b = str;
        kVar.e = i;
        return kVar.a();
    }

    public static SimplePlaybackDescriptor d(String str, int i, int i2) {
        k kVar = new k();
        kVar.a = 1;
        kVar.b = str;
        kVar.e = i;
        kVar.g = i2;
        return kVar.a();
    }

    public static SimplePlaybackDescriptor e(List list, int i, int i2, int i3) {
        k kVar = new k();
        kVar.a = 3;
        kVar.d = new ArrayList(list);
        kVar.e = i;
        kVar.f = i2;
        kVar.g = i3;
        return kVar.a();
    }

    public static Optional f(String str, List list, String str2, int i, int i2, int i3) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            k kVar = new k();
            if (!TextUtils.isEmpty(str2)) {
                kVar.a = 2;
                kVar.c = str2;
                kVar.b = str;
            } else if (list == null || list.size() <= 0) {
                kVar.a = 1;
                kVar.b = str;
            } else {
                kVar.a = 3;
                kVar.d = new ArrayList();
                if (str != null) {
                    kVar.d.add(str);
                }
                kVar.d.addAll(list);
            }
            if (kVar.a != 1) {
                kVar.f = i2;
            }
            kVar.g = i3;
            kVar.e = i;
            return Optional.of(kVar.a());
        }
        return Optional.empty();
    }

    public final SimplePlaybackDescriptor a(int i) {
        k kVar = new k();
        kVar.a = this.a;
        kVar.b = this.b;
        kVar.c = this.c;
        kVar.d = new ArrayList();
        kVar.d.addAll(this.d);
        kVar.f = this.f;
        kVar.g = this.g;
        kVar.e = i;
        if (i == 2) {
            kVar.g = 0;
        }
        return kVar.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}

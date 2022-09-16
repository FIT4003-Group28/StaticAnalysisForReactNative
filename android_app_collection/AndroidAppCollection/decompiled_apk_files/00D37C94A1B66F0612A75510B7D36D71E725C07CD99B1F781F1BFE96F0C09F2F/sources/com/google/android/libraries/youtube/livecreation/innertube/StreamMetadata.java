package com.google.android.libraries.youtube.livecreation.innertube;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class StreamMetadata implements Serializable, Parcelable {
    public static final Parcelable.Creator CREATOR = new abjw(4);
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public transient arpk g;
    public transient arpl h;
    public Place i;
    public Date j;
    public transient arbt k;
    public int l;
    public int m;

    public StreamMetadata() {
        this.m = 1;
    }

    public StreamMetadata(Parcel parcel) {
        this.m = 1;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.d = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.e = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.l = akzj.E(parcel.readInt());
        this.f = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite != null) {
            this.g = (arpk) parcelableMessageLite.a(arpk.a);
        }
        ParcelableMessageLite parcelableMessageLite2 = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite2 != null) {
            this.h = (arpl) parcelableMessageLite2.a(arpl.a);
        }
        int bX = awwc.bX(parcel.readInt());
        this.m = bX;
        if (bX == 0) {
            this.m = 1;
        }
        this.i = (Place) parcel.readParcelable(Place.class.getClassLoader());
        this.j = (Date) parcel.readSerializable();
        ParcelableMessageLite parcelableMessageLite3 = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite3 != null) {
            this.k = (arbt) parcelableMessageLite3.a(arbt.a);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.g = (arpk) abxc.a(objectInputStream, arpk.a, arpk.class);
        this.h = (arpl) abxc.a(objectInputStream, arpl.a, arpl.class);
        this.k = (arbt) abxc.a(objectInputStream, arbt.a, arbt.class);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        abxc.b(objectOutputStream, this.g);
        abxc.b(objectOutputStream, this.h);
        abxc.b(objectOutputStream, this.k);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException("Equals is not implemented for and should not be implemented for StreamMetadata!");
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("hashCode is not implemented for and should not be implemented for StreamMetadata");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeValue(this.c);
        parcel.writeValue(this.d);
        parcel.writeValue(this.e);
        int i2 = this.l;
        int i3 = -1;
        if (i2 != 0) {
            i3 = (-1) + i2;
        }
        parcel.writeInt(i3);
        parcel.writeValue(this.f);
        parcel.writeParcelable(new ParcelableMessageLite(this.g), 0);
        parcel.writeParcelable(new ParcelableMessageLite(this.h), 0);
        int i4 = this.m;
        int i5 = i4 - 1;
        if (i4 != 0) {
            parcel.writeInt(i5);
            parcel.writeParcelable(this.i, 0);
            parcel.writeSerializable(this.j);
            parcel.writeParcelable(new ParcelableMessageLite(this.k), 0);
            return;
        }
        throw null;
    }
}

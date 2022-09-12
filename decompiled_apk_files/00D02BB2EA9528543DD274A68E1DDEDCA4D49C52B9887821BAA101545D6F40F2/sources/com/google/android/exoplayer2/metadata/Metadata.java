package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new cmbs();
    public final Entry[] a;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public interface Entry extends Parcelable {
        Format a();

        byte[] b();
    }

    public Metadata(Parcel parcel) {
        this.a = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.a;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public Metadata(Entry... entryArr) {
        this.a = entryArr;
    }

    public final int a() {
        return this.a.length;
    }

    public final Entry b(int i) {
        return this.a[i];
    }

    public final Metadata c(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) cmny.f(this.a, entryArr));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.a, ((Metadata) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.a));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (Entry entry : this.a) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Metadata(List<? extends Entry> list) {
        this.a = (Entry[]) list.toArray(new Entry[0]);
    }
}

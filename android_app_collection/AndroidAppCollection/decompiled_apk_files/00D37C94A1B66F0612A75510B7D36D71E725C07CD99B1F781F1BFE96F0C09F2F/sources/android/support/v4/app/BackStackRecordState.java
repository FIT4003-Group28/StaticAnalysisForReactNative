package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cs(1);
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    public BackStackRecordState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackRecordState(cr crVar) {
        int size = crVar.d.size();
        this.a = new int[size * 6];
        if (!crVar.j) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            ew ewVar = (ew) crVar.d.get(i);
            int i3 = i2 + 1;
            this.a[i2] = ewVar.a;
            ArrayList arrayList = this.b;
            dp dpVar = ewVar.b;
            arrayList.add(dpVar != null ? dpVar.l : null);
            int[] iArr = this.a;
            int i4 = i3 + 1;
            iArr[i3] = ewVar.c ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = ewVar.d;
            int i6 = i5 + 1;
            iArr[i5] = ewVar.e;
            int i7 = i6 + 1;
            iArr[i6] = ewVar.f;
            iArr[i7] = ewVar.g;
            this.c[i] = ewVar.h.ordinal();
            this.d[i] = ewVar.i.ordinal();
            i++;
            i2 = i7 + 1;
        }
        this.e = crVar.i;
        this.f = crVar.l;
        this.g = crVar.c;
        this.h = crVar.m;
        this.i = crVar.n;
        this.j = crVar.o;
        this.k = crVar.p;
        this.l = crVar.q;
        this.m = crVar.r;
        this.n = crVar.s;
    }
}

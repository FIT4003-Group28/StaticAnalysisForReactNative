package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new eq();
    public final int[] a;
    public final ArrayList<String> b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList<String> l;
    public final ArrayList<String> m;
    public final boolean n;

    public BackStackState(Parcel parcel) {
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

    public BackStackState(ep epVar) {
        int size = epVar.d.size();
        this.a = new int[size * 5];
        if (!epVar.j) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList<>(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            gy gyVar = epVar.d.get(i);
            int i3 = i2 + 1;
            this.a[i2] = gyVar.a;
            ArrayList<String> arrayList = this.b;
            fd fdVar = gyVar.b;
            arrayList.add(fdVar != null ? fdVar.n : null);
            int[] iArr = this.a;
            int i4 = i3 + 1;
            iArr[i3] = gyVar.c;
            int i5 = i4 + 1;
            iArr[i4] = gyVar.d;
            int i6 = i5 + 1;
            iArr[i5] = gyVar.e;
            iArr[i6] = gyVar.f;
            this.c[i] = gyVar.g.ordinal();
            this.d[i] = gyVar.h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.e = epVar.i;
        this.f = epVar.l;
        this.g = epVar.c;
        this.h = epVar.m;
        this.i = epVar.n;
        this.j = epVar.o;
        this.k = epVar.p;
        this.l = epVar.q;
        this.m = epVar.r;
        this.n = epVar.s;
    }
}

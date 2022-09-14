package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.c;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: android.support.v4.app.d.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d[] newArray(int i) {
            return new d[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final int[] f218a;

    /* renamed from: b  reason: collision with root package name */
    final int f219b;

    /* renamed from: c  reason: collision with root package name */
    final int f220c;

    /* renamed from: d  reason: collision with root package name */
    final String f221d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList<String> j;
    final ArrayList<String> k;
    final boolean l;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public d(c cVar) {
        int size = cVar.f211b.size();
        this.f218a = new int[size * 6];
        if (!cVar.i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        int i2 = 0;
        while (i < size) {
            c.a aVar = cVar.f211b.get(i);
            int i3 = i2 + 1;
            this.f218a[i2] = aVar.f214a;
            int i4 = i3 + 1;
            this.f218a[i3] = aVar.f215b != null ? aVar.f215b.mIndex : -1;
            int i5 = i4 + 1;
            this.f218a[i4] = aVar.f216c;
            int i6 = i5 + 1;
            this.f218a[i5] = aVar.f217d;
            int i7 = i6 + 1;
            this.f218a[i6] = aVar.e;
            this.f218a[i7] = aVar.f;
            i++;
            i2 = i7 + 1;
        }
        this.f219b = cVar.g;
        this.f220c = cVar.h;
        this.f221d = cVar.k;
        this.e = cVar.m;
        this.f = cVar.n;
        this.g = cVar.o;
        this.h = cVar.p;
        this.i = cVar.q;
        this.j = cVar.r;
        this.k = cVar.s;
        this.l = cVar.t;
    }

    public d(Parcel parcel) {
        this.f218a = parcel.createIntArray();
        this.f219b = parcel.readInt();
        this.f220c = parcel.readInt();
        this.f221d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
        this.l = parcel.readInt() != 0;
    }

    public c a(o oVar) {
        c cVar = new c(oVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f218a.length) {
            c.a aVar = new c.a();
            int i3 = i + 1;
            aVar.f214a = this.f218a[i];
            if (o.f245a) {
                Log.v("FragmentManager", "Instantiate " + cVar + " op #" + i2 + " base fragment #" + this.f218a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f218a[i3];
            if (i5 >= 0) {
                aVar.f215b = oVar.f.get(i5);
            } else {
                aVar.f215b = null;
            }
            int i6 = i4 + 1;
            aVar.f216c = this.f218a[i4];
            int i7 = i6 + 1;
            aVar.f217d = this.f218a[i6];
            int i8 = i7 + 1;
            aVar.e = this.f218a[i7];
            aVar.f = this.f218a[i8];
            cVar.f212c = aVar.f216c;
            cVar.f213d = aVar.f217d;
            cVar.e = aVar.e;
            cVar.f = aVar.f;
            cVar.a(aVar);
            i2++;
            i = i8 + 1;
        }
        cVar.g = this.f219b;
        cVar.h = this.f220c;
        cVar.k = this.f221d;
        cVar.m = this.e;
        cVar.i = true;
        cVar.n = this.f;
        cVar.o = this.g;
        cVar.p = this.h;
        cVar.q = this.i;
        cVar.r = this.j;
        cVar.s = this.k;
        cVar.t = this.l;
        cVar.a(1);
        return cVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f218a);
        parcel.writeInt(this.f219b);
        parcel.writeInt(this.f220c);
        parcel.writeString(this.f221d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
        parcel.writeInt(this.l ? 1 : 0);
    }
}

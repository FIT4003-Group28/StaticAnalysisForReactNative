package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.s;
import androidx.lifecycle.f;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final int[] f1659b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<String> f1660c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f1661d;

    /* renamed from: e  reason: collision with root package name */
    final int[] f1662e;

    /* renamed from: f  reason: collision with root package name */
    final int f1663f;

    /* renamed from: g  reason: collision with root package name */
    final String f1664g;

    /* renamed from: h  reason: collision with root package name */
    final int f1665h;
    final int i;
    final CharSequence j;
    final int k;
    final CharSequence l;
    final ArrayList<String> m;
    final ArrayList<String> n;
    final boolean o;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public b mo68createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public b[] mo69newArray(int i) {
            return new b[i];
        }
    }

    public b(Parcel parcel) {
        this.f1659b = parcel.createIntArray();
        this.f1660c = parcel.createStringArrayList();
        this.f1661d = parcel.createIntArray();
        this.f1662e = parcel.createIntArray();
        this.f1663f = parcel.readInt();
        this.f1664g = parcel.readString();
        this.f1665h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f1747a.size();
        this.f1659b = new int[size * 5];
        if (aVar.f1753g) {
            this.f1660c = new ArrayList<>(size);
            this.f1661d = new int[size];
            this.f1662e = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                s.a aVar2 = aVar.f1747a.get(i);
                int i3 = i2 + 1;
                this.f1659b[i2] = aVar2.f1755a;
                ArrayList<String> arrayList = this.f1660c;
                Fragment fragment = aVar2.f1756b;
                arrayList.add(fragment != null ? fragment.f1642f : null);
                int[] iArr = this.f1659b;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f1757c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f1758d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f1759e;
                iArr[i6] = aVar2.f1760f;
                this.f1661d[i] = aVar2.f1761g.ordinal();
                this.f1662e[i] = aVar2.f1762h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f1663f = aVar.f1752f;
            this.f1664g = aVar.i;
            this.f1665h = aVar.t;
            this.i = aVar.j;
            this.j = aVar.k;
            this.k = aVar.l;
            this.l = aVar.m;
            this.m = aVar.n;
            this.n = aVar.o;
            this.o = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public androidx.fragment.app.a a(l lVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(lVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f1659b.length) {
            s.a aVar2 = new s.a();
            int i3 = i + 1;
            aVar2.f1755a = this.f1659b[i];
            if (l.d(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f1659b[i3]);
            }
            String str = this.f1660c.get(i2);
            aVar2.f1756b = str != null ? lVar.a(str) : null;
            aVar2.f1761g = f.b.values()[this.f1661d[i2]];
            aVar2.f1762h = f.b.values()[this.f1662e[i2]];
            int[] iArr = this.f1659b;
            int i4 = i3 + 1;
            aVar2.f1757c = iArr[i3];
            int i5 = i4 + 1;
            aVar2.f1758d = iArr[i4];
            int i6 = i5 + 1;
            aVar2.f1759e = iArr[i5];
            aVar2.f1760f = iArr[i6];
            aVar.f1748b = aVar2.f1757c;
            aVar.f1749c = aVar2.f1758d;
            aVar.f1750d = aVar2.f1759e;
            aVar.f1751e = aVar2.f1760f;
            aVar.a(aVar2);
            i2++;
            i = i6 + 1;
        }
        aVar.f1752f = this.f1663f;
        aVar.i = this.f1664g;
        aVar.t = this.f1665h;
        aVar.f1753g = true;
        aVar.j = this.i;
        aVar.k = this.j;
        aVar.l = this.k;
        aVar.m = this.l;
        aVar.n = this.m;
        aVar.o = this.n;
        aVar.p = this.o;
        aVar.b(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1659b);
        parcel.writeStringList(this.f1660c);
        parcel.writeIntArray(this.f1661d);
        parcel.writeIntArray(this.f1662e);
        parcel.writeInt(this.f1663f);
        parcel.writeString(this.f1664g);
        parcel.writeInt(this.f1665h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}

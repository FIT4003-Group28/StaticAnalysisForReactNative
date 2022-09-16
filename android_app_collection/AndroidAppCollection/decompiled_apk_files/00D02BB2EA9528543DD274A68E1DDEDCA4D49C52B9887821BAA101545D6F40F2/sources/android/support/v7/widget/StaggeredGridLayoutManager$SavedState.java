package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager$SavedState implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$SavedState> CREATOR = new aef();
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public int[] f;
    public List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> g;
    public boolean h;
    public boolean i;
    public boolean j;

    public StaggeredGridLayoutManager$SavedState() {
    }

    public StaggeredGridLayoutManager$SavedState(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        int readInt = parcel.readInt();
        this.c = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.d = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.e = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.f = iArr2;
            parcel.readIntArray(iArr2);
        }
        boolean z = false;
        this.h = parcel.readInt() == 1;
        this.i = parcel.readInt() == 1;
        this.j = parcel.readInt() == 1 ? true : z;
        this.g = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
    }

    public StaggeredGridLayoutManager$SavedState(StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState) {
        this.c = staggeredGridLayoutManager$SavedState.c;
        this.a = staggeredGridLayoutManager$SavedState.a;
        this.b = staggeredGridLayoutManager$SavedState.b;
        this.d = staggeredGridLayoutManager$SavedState.d;
        this.e = staggeredGridLayoutManager$SavedState.e;
        this.f = staggeredGridLayoutManager$SavedState.f;
        this.h = staggeredGridLayoutManager$SavedState.h;
        this.i = staggeredGridLayoutManager$SavedState.i;
        this.j = staggeredGridLayoutManager$SavedState.j;
        this.g = staggeredGridLayoutManager$SavedState.g;
    }

    public final void a() {
        this.d = null;
        this.c = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
    }

    public final void b() {
        this.d = null;
        this.c = 0;
        this.a = -1;
        this.b = -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeList(this.g);
    }
}

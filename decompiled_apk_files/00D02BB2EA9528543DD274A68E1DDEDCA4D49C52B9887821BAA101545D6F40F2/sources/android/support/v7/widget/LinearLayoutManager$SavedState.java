package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LinearLayoutManager$SavedState implements Parcelable {
    public static final Parcelable.Creator<LinearLayoutManager$SavedState> CREATOR = new aaf();
    public int a;
    public int b;
    public boolean c;

    public LinearLayoutManager$SavedState() {
    }

    public LinearLayoutManager$SavedState(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 1 ? false : true;
    }

    public LinearLayoutManager$SavedState(LinearLayoutManager$SavedState linearLayoutManager$SavedState) {
        this.a = linearLayoutManager$SavedState.a;
        this.b = linearLayoutManager$SavedState.b;
        this.c = linearLayoutManager$SavedState.c;
    }

    public final boolean a() {
        return this.a >= 0;
    }

    public final void b() {
        this.a = -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}

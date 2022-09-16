package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new gp();
    public ArrayList<FragmentState> a;
    public ArrayList<String> b;
    public BackStackState[] c;
    public int d;
    public String e;
    public ArrayList<String> f;
    public ArrayList<Bundle> g;
    public ArrayList<FragmentManager$LaunchedFragmentInfo> h;

    public FragmentManagerState() {
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.h = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
    }
}

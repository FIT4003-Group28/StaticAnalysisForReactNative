package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManager.java */
/* loaded from: classes.dex */
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new Parcelable.Creator<q>() { // from class: android.support.v4.app.q.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q[] newArray(int i) {
            return new q[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    r[] f283a;

    /* renamed from: b  reason: collision with root package name */
    int[] f284b;

    /* renamed from: c  reason: collision with root package name */
    d[] f285c;

    /* renamed from: d  reason: collision with root package name */
    int f286d;
    int e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public q() {
        this.f286d = -1;
    }

    public q(Parcel parcel) {
        this.f286d = -1;
        this.f283a = (r[]) parcel.createTypedArray(r.CREATOR);
        this.f284b = parcel.createIntArray();
        this.f285c = (d[]) parcel.createTypedArray(d.CREATOR);
        this.f286d = parcel.readInt();
        this.e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f283a, i);
        parcel.writeIntArray(this.f284b);
        parcel.writeTypedArray(this.f285c, i);
        parcel.writeInt(this.f286d);
        parcel.writeInt(this.e);
    }
}

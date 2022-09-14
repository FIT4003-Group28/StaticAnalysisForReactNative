package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<p> f1722b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<String> f1723c;

    /* renamed from: d  reason: collision with root package name */
    b[] f1724d;

    /* renamed from: e  reason: collision with root package name */
    int f1725e;

    /* renamed from: f  reason: collision with root package name */
    String f1726f;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<n> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public n mo71createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public n[] mo72newArray(int i) {
            return new n[i];
        }
    }

    public n() {
        this.f1726f = null;
    }

    public n(Parcel parcel) {
        this.f1726f = null;
        this.f1722b = parcel.createTypedArrayList(p.CREATOR);
        this.f1723c = parcel.createStringArrayList();
        this.f1724d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1725e = parcel.readInt();
        this.f1726f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1722b);
        parcel.writeStringList(this.f1723c);
        parcel.writeTypedArray(this.f1724d, i);
        parcel.writeInt(this.f1725e);
        parcel.writeString(this.f1726f);
    }
}

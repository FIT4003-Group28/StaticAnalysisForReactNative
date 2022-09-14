package android.support.v4.j;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: AbsSavedState.java */
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: b  reason: collision with root package name */
    private final Parcelable f482b;

    /* renamed from: a  reason: collision with root package name */
    public static final a f481a = new a() { // from class: android.support.v4.j.a.1
    };
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.ClassLoaderCreator<a>() { // from class: android.support.v4.j.a.2
        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return a.f481a;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a[] newArray(int i) {
            return new a[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private a() {
        this.f482b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f482b = parcelable == f481a ? null : parcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f482b = readParcelable == null ? f481a : readParcelable;
    }

    public final Parcelable a() {
        return this.f482b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f482b, i);
    }
}

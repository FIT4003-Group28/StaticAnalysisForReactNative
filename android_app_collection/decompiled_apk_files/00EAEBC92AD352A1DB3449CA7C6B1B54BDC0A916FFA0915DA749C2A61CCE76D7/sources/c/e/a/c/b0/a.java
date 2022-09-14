package c.e.a.c.b0;

import a.e.g;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class a extends a.i.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0100a();

    /* renamed from: d  reason: collision with root package name */
    public final g<String, Bundle> f4732d;

    /* renamed from: c.e.a.c.b0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0100a implements Parcelable.ClassLoaderCreator<a> {
        C0100a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public a mo161createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: createFromParcel */
        public a mo162createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public a[] mo163newArray(int i) {
            return new a[i];
        }
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f4732d = new g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f4732d.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0100a c0100a) {
        this(parcel, classLoader);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f4732d = new g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f4732d + "}";
    }

    @Override // a.i.a.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f4732d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f4732d.b(i2);
            bundleArr[i2] = this.f4732d.d(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}

package a.i.a;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: b  reason: collision with root package name */
    private final Parcelable f416b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f415c = new C0018a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a.i.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0018a extends a {
        C0018a() {
            super((C0018a) null);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public a mo12createFromParcel(Parcel parcel) {
            return mo13createFromParcel(parcel, (ClassLoader) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: createFromParcel */
        public a mo13createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f415c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public a[] mo14newArray(int i) {
            return new a[i];
        }
    }

    private a() {
        this.f416b = null;
    }

    /* synthetic */ a(C0018a c0018a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f416b = readParcelable == null ? f415c : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f416b = parcelable == f415c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable j() {
        return this.f416b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f416b, i);
    }
}

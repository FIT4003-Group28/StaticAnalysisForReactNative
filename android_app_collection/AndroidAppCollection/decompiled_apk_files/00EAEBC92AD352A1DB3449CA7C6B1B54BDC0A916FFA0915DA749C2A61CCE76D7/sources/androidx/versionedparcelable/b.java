package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f2159d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f2160e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2161f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2162g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2163h;
    private int i;
    private int j;
    private int k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a.e.a(), new a.e.a(), new a.e.a());
    }

    private b(Parcel parcel, int i, int i2, String str, a.e.a<String, Method> aVar, a.e.a<String, Method> aVar2, a.e.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2159d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.f2160e = parcel;
        this.f2161f = i;
        this.f2162g = i2;
        this.j = this.f2161f;
        this.f2163h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.f2159d.get(i);
            int dataPosition = this.f2160e.dataPosition();
            this.f2160e.setDataPosition(i2);
            this.f2160e.writeInt(dataPosition - i2);
            this.f2160e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    public void a(Parcelable parcelable) {
        this.f2160e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    protected void a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2160e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void a(String str) {
        this.f2160e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a(boolean z) {
        this.f2160e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.a
    public void a(byte[] bArr) {
        if (bArr == null) {
            this.f2160e.writeInt(-1);
            return;
        }
        this.f2160e.writeInt(bArr.length);
        this.f2160e.writeByteArray(bArr);
    }

    @Override // androidx.versionedparcelable.a
    public boolean a(int i) {
        while (this.j < this.f2162g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f2160e.setDataPosition(this.j);
            int readInt = this.f2160e.readInt();
            this.k = this.f2160e.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f2160e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f2161f) {
            i = this.f2162g;
        }
        int i2 = i;
        return new b(parcel, dataPosition, i2, this.f2163h + "  ", this.f2156a, this.f2157b, this.f2158c);
    }

    @Override // androidx.versionedparcelable.a
    public void b(int i) {
        a();
        this.i = i;
        this.f2159d.put(i, this.f2160e.dataPosition());
        c(0);
        c(i);
    }

    @Override // androidx.versionedparcelable.a
    public void c(int i) {
        this.f2160e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.a
    public boolean d() {
        return this.f2160e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] e() {
        int readInt = this.f2160e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2160e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2160e);
    }

    @Override // androidx.versionedparcelable.a
    public int g() {
        return this.f2160e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T h() {
        return (T) this.f2160e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String i() {
        return this.f2160e.readString();
    }
}

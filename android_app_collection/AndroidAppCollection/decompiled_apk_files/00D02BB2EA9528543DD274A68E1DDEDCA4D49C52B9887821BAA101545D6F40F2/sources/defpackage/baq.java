package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: baq  reason: default package */
/* loaded from: classes3.dex */
public final class baq extends bap {
    private final SparseIntArray d;
    private final Parcel e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public baq(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new aim(), new aim(), new aim());
    }

    @Override // defpackage.bap
    public final void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(i2);
            this.e.writeInt(dataPosition - i2);
            this.e.setDataPosition(dataPosition);
        }
    }

    @Override // defpackage.bap
    protected final bap b() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        int i2 = i;
        return new baq(parcel, dataPosition, i2, this.h + "  ", this.a, this.b, this.c);
    }

    @Override // defpackage.bap
    public final void c(byte[] bArr) {
        this.e.writeInt(bArr.length);
        this.e.writeByteArray(bArr);
    }

    @Override // defpackage.bap
    protected final void d(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // defpackage.bap
    public final void e(int i) {
        this.e.writeInt(i);
    }

    @Override // defpackage.bap
    public final void f(String str) {
        this.e.writeString(str);
    }

    @Override // defpackage.bap
    public final void g(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // defpackage.bap
    public final void h(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // defpackage.bap
    public final int i() {
        return this.e.readInt();
    }

    @Override // defpackage.bap
    public final String j() {
        return this.e.readString();
    }

    @Override // defpackage.bap
    public final byte[] k() {
        int readInt = this.e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.e.readByteArray(bArr);
        return bArr;
    }

    @Override // defpackage.bap
    protected final CharSequence l() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // defpackage.bap
    public final <T extends Parcelable> T m() {
        return (T) this.e.readParcelable(getClass().getClassLoader());
    }

    @Override // defpackage.bap
    public final boolean n() {
        return this.e.readInt() != 0;
    }

    @Override // defpackage.bap
    public final boolean o(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int readInt = this.e.readInt();
            this.k = this.e.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // defpackage.bap
    public final void p(int i) {
        a();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        e(0);
        e(i);
    }

    private baq(Parcel parcel, int i, int i2, String str, aim<String, Method> aimVar, aim<String, Method> aimVar2, aim<String, Class<?>> aimVar3) {
        super(aimVar, aimVar2, aimVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}

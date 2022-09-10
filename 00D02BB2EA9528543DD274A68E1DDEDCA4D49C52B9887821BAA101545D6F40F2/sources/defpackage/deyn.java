package defpackage;

import android.os.Parcel;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: deyn  reason: default package */
/* loaded from: classes6.dex */
final class deyn {
    static final dyhw a = new dyhw();

    public static void a(Parcel parcel, dyhw dyhwVar) {
        int d = dygq.d(dyhwVar);
        if (d == 0) {
            parcel.writeInt(0);
            return;
        }
        Object[] e = dygq.e(dyhwVar);
        parcel.writeInt(d);
        for (int i = 0; i < d; i++) {
            int i2 = i + i;
            byte[] bArr = (byte[]) e[i2];
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            Object obj = e[i2 + 1];
            if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                parcel.writeInt(bArr2.length);
                parcel.writeByteArray(bArr2);
            } else if (!(obj instanceof deyu)) {
                byte[] a2 = dexy.a();
                int read = ((InputStream) obj).read(a2);
                if (read >= 0) {
                    if (read != a2.length) {
                        parcel.writeInt(read);
                        if (read > 0) {
                            parcel.writeByteArray(a2, 0, read);
                        }
                        dexy.c(a2);
                    } else {
                        throw dyjb.j.g("Metadata value too large").l();
                    }
                } else {
                    throw dyjb.l.g("Failure reading metadata value").l();
                }
            } else {
                parcel.writeInt(-1);
                deyu deyuVar = (deyu) obj;
                throw null;
            }
        }
    }

    public static dyhw b(Parcel parcel, dyel dyelVar) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return a;
        }
        int dataPosition = parcel.dataPosition();
        Object[] objArr = new Object[readInt + readInt];
        for (int i = 0; i < readInt; i++) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            int i2 = i + i;
            objArr[i2] = bArr;
            int readInt2 = parcel.readInt();
            if (readInt2 == -1) {
                deyv.a(dyelVar);
                throw dyjb.h.g("Parcelable metadata values not allowed").l();
            } else if (readInt2 >= 0) {
                byte[] bArr2 = new byte[readInt2];
                if (readInt2 > 0) {
                    parcel.readByteArray(bArr2);
                }
                objArr[i2 + 1] = bArr2;
                if (parcel.dataPosition() - dataPosition > 8192) {
                    throw dyjb.j.g("Metadata too large").l();
                }
            } else {
                throw dyjb.l.g("Unrecognized metadata sentinel").l();
            }
        }
        return dygq.f(readInt, objArr);
    }
}

package defpackage;

import android.os.Parcel;
import io.grpc.Status;
/* compiled from: PG */
/* renamed from: azqj  reason: default package */
/* loaded from: classes2.dex */
public class azqj {
    public static azqf o(Object obj, Object obj2) {
        return new azqf(obj, obj2);
    }

    public static Object p(Throwable th) {
        return new azqg(th);
    }

    public static void q(Object obj) {
        if (!(obj instanceof azqg)) {
            return;
        }
        throw ((azqg) obj).a;
    }

    public static ayat r(Parcel parcel, axyb axybVar) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new ayat();
        }
        Object[] objArr = new Object[readInt + readInt];
        int i = 0;
        int i2 = 0;
        while (i < readInt) {
            int readInt2 = parcel.readInt();
            int i3 = i2 + 4;
            int i4 = i + i;
            objArr[i4] = n(parcel, readInt2, i3);
            int readInt3 = parcel.readInt();
            int i5 = i3 + readInt2 + 4;
            if (readInt3 == -1) {
                azqn azqnVar = (azqn) axybVar.c(aycl.g);
                throw Status.h.withDescription("Parcelable metadata values not allowed").asException();
            } else if (readInt3 >= 0) {
                objArr[i4 + 1] = n(parcel, readInt3, i5);
                i++;
                i2 = i5 + readInt3;
            } else {
                throw Status.n.withDescription("Unrecognized metadata sentinel").asException();
            }
        }
        return axzu.d(readInt, objArr);
    }

    public void a() {
    }

    public void b(int i) {
    }

    public void c(int i, long j, long j2) {
    }

    public void d(ayat ayatVar) {
    }

    public void e(long j) {
    }

    public void f(long j) {
    }

    public void g() {
    }

    public void h(int i) {
    }

    public void i(int i, long j, long j2) {
    }

    public void j(long j) {
    }

    public void k(long j) {
    }

    public void l(Status status) {
    }

    public void m(axyb axybVar, ayat ayatVar) {
    }

    private static byte[] n(Parcel parcel, int i, int i2) {
        if (i2 + i > 8192) {
            throw Status.j.withDescription("Metadata too large").asException();
        }
        byte[] bArr = new byte[i];
        if (i > 0) {
            parcel.readByteArray(bArr);
        }
        return bArr;
    }
}

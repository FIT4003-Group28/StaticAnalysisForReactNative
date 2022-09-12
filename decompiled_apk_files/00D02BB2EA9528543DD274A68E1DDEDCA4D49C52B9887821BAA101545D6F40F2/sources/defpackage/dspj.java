package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dspj  reason: default package */
/* loaded from: classes.dex */
public abstract class dspj {
    int a;
    final int b = 100;
    public int c = Integer.MAX_VALUE;
    dspk d;

    public static dspj I(InputStream inputStream) {
        if (inputStream == null) {
            return J(dsrk.b);
        }
        return new dsph(inputStream);
    }

    public static dspj J(byte[] bArr) {
        return O(bArr, bArr.length);
    }

    public static dspj K(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return P(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        if (!byteBuffer.isDirect() || !dsui.a) {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            return P(bArr, 0, remaining);
        }
        return new dspi(byteBuffer);
    }

    public static int L(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long M(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int N(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw dsrm.a();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw dsrm.a();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw dsrm.c();
    }

    public static dspj O(byte[] bArr, int i) {
        return P(bArr, 0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dspj P(byte[] bArr, int i, int i2) {
        dspg dspgVar = new dspg(bArr, i, i2);
        try {
            dspgVar.B(i2);
            return dspgVar;
        } catch (dsrm e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int B(int i);

    public abstract void C(int i);

    public abstract boolean D();

    public abstract int E();

    public abstract byte[] G(int i);

    public abstract int a();

    public abstract void b(int i);

    public abstract boolean c(int i);

    public abstract double d();

    public abstract float e();

    public abstract long f();

    public abstract long g();

    public abstract int h();

    public abstract long i();

    public abstract int j();

    public abstract boolean k();

    public abstract String l();

    public abstract String m();

    public abstract void n(dssi dssiVar, dsqa dsqaVar);

    public abstract <T extends dssj> T o(dssr<T> dssrVar, dsqa dsqaVar);

    public abstract dspd p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract int w();
}

package defpackage;

import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: aooj  reason: default package */
/* loaded from: classes.dex */
public final class aooj extends aool {
    private final byte[] a;
    private final int b;
    private int c;

    public aooj(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int length = bArr.length;
            int i3 = i + i2;
            if ((i | i2 | (length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.a = bArr;
            this.c = i;
            this.b = i3;
            return;
        }
        throw new NullPointerException("buffer");
    }

    @Override // defpackage.aool
    public final void A(String str) {
        int i = this.c;
        try {
            int ae = ae(str.length() * 3);
            int ae2 = ae(str.length());
            if (ae2 == ae) {
                int i2 = i + ae2;
                this.c = i2;
                int a = aosi.a(str, this.a, i2, b());
                this.c = i;
                D((a - i) - ae2);
                this.c = a;
                return;
            }
            D(aosi.b(str));
            this.c = aosi.a(str, this.a, this.c, b());
        } catch (aosh e) {
            this.c = i;
            ao(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new aook(e2);
        }
    }

    @Override // defpackage.aool
    public final void B(int i, int i2) {
        D(aosl.c(i, i2));
    }

    @Override // defpackage.aool
    public final void C(int i, int i2) {
        B(i, 0);
        D(i2);
    }

    @Override // defpackage.aool
    public final void E(int i, long j) {
        B(i, 0);
        F(j);
    }

    @Override // defpackage.aool
    public final void G(byte[] bArr, int i) {
        D(i);
        c(bArr, 0, i);
    }

    @Override // defpackage.aool, defpackage.aont
    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    @Override // defpackage.aool
    public final int b() {
        return this.b - this.c;
    }

    @Override // defpackage.aool
    public final void i() {
    }

    @Override // defpackage.aool
    public final void l(int i, boolean z) {
        B(i, 0);
        j(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.aool
    public final void m(int i, byte[] bArr) {
        throw null;
    }

    @Override // defpackage.aool
    public final void n(int i, aoob aoobVar) {
        B(i, 2);
        o(aoobVar);
    }

    @Override // defpackage.aool
    public final void o(aoob aoobVar) {
        D(aoobVar.d());
        aoobVar.p(this);
    }

    @Override // defpackage.aool
    public final void p(int i, int i2) {
        B(i, 5);
        q(i2);
    }

    @Override // defpackage.aool
    public final void q(int i) {
        try {
            byte[] bArr = this.a;
            int i2 = this.c;
            int i3 = i2 + 1;
            this.c = i3;
            bArr[i2] = (byte) (i & PrivateKeyType.INVALID);
            int i4 = i3 + 1;
            this.c = i4;
            bArr[i3] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
            int i5 = i4 + 1;
            this.c = i5;
            bArr[i4] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
            this.c = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
        } catch (IndexOutOfBoundsException e) {
            throw new aook(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.aool
    public final void r(int i, long j) {
        B(i, 1);
        s(j);
    }

    @Override // defpackage.aool
    public final void s(long j) {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            int i2 = i + 1;
            this.c = i2;
            bArr[i] = (byte) (((int) j) & PrivateKeyType.INVALID);
            int i3 = i2 + 1;
            this.c = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & PrivateKeyType.INVALID);
            int i4 = i3 + 1;
            this.c = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & PrivateKeyType.INVALID);
            int i5 = i4 + 1;
            this.c = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & PrivateKeyType.INVALID);
            int i6 = i5 + 1;
            this.c = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & PrivateKeyType.INVALID);
            int i7 = i6 + 1;
            this.c = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & PrivateKeyType.INVALID);
            int i8 = i7 + 1;
            this.c = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & PrivateKeyType.INVALID);
            this.c = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & PrivateKeyType.INVALID);
        } catch (IndexOutOfBoundsException e) {
            throw new aook(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.aool
    public final void t(int i, int i2) {
        B(i, 0);
        u(i2);
    }

    @Override // defpackage.aool
    public final void u(int i) {
        if (i >= 0) {
            D(i);
        } else {
            F(i);
        }
    }

    @Override // defpackage.aool
    public final void v(int i, aoqu aoquVar, aorm aormVar) {
        B(i, 2);
        D(((aonk) aoquVar).getSerializedSize(aormVar));
        aormVar.l(aoquVar, this.f);
    }

    @Override // defpackage.aool
    public final void w(aoqu aoquVar) {
        D(aoquVar.getSerializedSize());
        aoquVar.writeTo(this);
    }

    @Override // defpackage.aool
    public final void x(int i, aoqu aoquVar) {
        B(1, 3);
        C(2, i);
        B(3, 2);
        w(aoquVar);
        B(1, 4);
    }

    @Override // defpackage.aool
    public final void y(int i, aoob aoobVar) {
        B(1, 3);
        C(2, i);
        n(3, aoobVar);
        B(1, 4);
    }

    @Override // defpackage.aool
    public final void z(int i, String str) {
        B(i, 2);
        A(str);
    }

    @Override // defpackage.aool
    public final void D(int i) {
        boolean z = aool.e;
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new aook(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
            }
        }
        byte[] bArr2 = this.a;
        int i3 = this.c;
        this.c = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public final void c(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new aook(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), Integer.valueOf(i2)), e);
        }
    }

    @Override // defpackage.aool
    public final void j(byte b) {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            this.c = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new aook(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.aool
    public final void F(long j) {
        if (!aool.e || b() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.a;
                    int i = this.c;
                    this.c = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new aook(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
                }
            }
            byte[] bArr2 = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            bArr2[i2] = (byte) j;
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            aosg.o(bArr3, i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i4 = this.c;
        this.c = i4 + 1;
        aosg.o(bArr4, i4, (byte) j);
    }
}

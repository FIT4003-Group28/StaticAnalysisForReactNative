package defpackage;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aorl  reason: default package */
/* loaded from: classes.dex */
public final class aorl extends aoob {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    public final int d;
    public final aoob e;
    public final aoob f;
    public final int g;
    private final int h;

    public aorl(aoob aoobVar, aoob aoobVar2) {
        this.e = aoobVar;
        this.f = aoobVar2;
        int d = aoobVar.d();
        this.h = d;
        this.d = d + aoobVar2.d();
        this.g = Math.max(aoobVar.f(), aoobVar2.f()) + 1;
    }

    public static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static aoob g(aoob aoobVar, aoob aoobVar2) {
        int d = aoobVar.d();
        int d2 = aoobVar2.d();
        byte[] bArr = new byte[d + d2];
        aoobVar.G(bArr, 0, 0, d);
        aoobVar2.G(bArr, 0, d, d2);
        return aoob.B(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.aoob
    public final byte a(int i) {
        F(i, this.d);
        return b(i);
    }

    @Override // defpackage.aoob
    public final byte b(int i) {
        int i2 = this.h;
        if (i < i2) {
            return this.e.b(i);
        }
        return this.f.b(i - i2);
    }

    @Override // defpackage.aoob
    public final int d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aoob
    public final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.h;
        if (i + i3 <= i4) {
            this.e.e(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.f.e(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.e.e(bArr, i, i2, i5);
            this.f.e(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // defpackage.aoob
    public final boolean equals(Object obj) {
        boolean g;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aoob)) {
            return false;
        }
        aoob aoobVar = (aoob) obj;
        if (this.d != aoobVar.d()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        int i = this.c;
        int i2 = aoobVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        aorj aorjVar = new aorj(this);
        aony mo416next = aorjVar.mo416next();
        aorj aorjVar2 = new aorj(aoobVar);
        aony mo416next2 = aorjVar2.mo416next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int d = mo416next.d() - i3;
            int d2 = mo416next2.d() - i4;
            int min = Math.min(d, d2);
            if (i3 == 0) {
                g = mo416next.g(mo416next2, i4, min);
            } else {
                g = mo416next2.g(mo416next, i3, min);
            }
            if (!g) {
                return false;
            }
            i5 += min;
            int i6 = this.d;
            if (i5 >= i6) {
                if (i5 != i6) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if (min == d) {
                mo416next = aorjVar.mo416next();
                i3 = 0;
            } else {
                i3 += min;
            }
            if (min == d2) {
                mo416next2 = aorjVar2.mo416next();
                i4 = 0;
            } else {
                i4 += min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aoob
    public final int f() {
        return this.g;
    }

    @Override // defpackage.aoob
    public final boolean h() {
        return this.d >= c(this.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aoob
    public final int i(int i, int i2, int i3) {
        int i4 = this.h;
        if (i2 + i3 <= i4) {
            return this.e.i(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f.i(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f.i(this.e.i(i, i2, i5), 0, i3 - i5);
    }

    @Override // defpackage.aoob, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aoob
    public final int j(int i, int i2, int i3) {
        int i4 = this.h;
        if (i2 + i3 <= i4) {
            return this.e.j(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f.j(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f.j(this.e.j(i, i2, i5), 0, i3 - i5);
    }

    @Override // defpackage.aoob
    public final aoob k(int i, int i2) {
        int r = r(i, i2, this.d);
        if (r == 0) {
            return aoob.b;
        }
        if (r == this.d) {
            return this;
        }
        int i3 = this.h;
        if (i2 <= i3) {
            return this.e.k(i, i2);
        }
        if (i >= i3) {
            return this.f.k(i - i3, i2 - i3);
        }
        aoob aoobVar = this.e;
        return new aorl(aoobVar.k(i, aoobVar.d()), this.f.k(0, i2 - this.h));
    }

    @Override // defpackage.aoob
    public final aoog l() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        aorj aorjVar = new aorj(this);
        while (aorjVar.hasNext()) {
            arrayList.add(aorjVar.mo416next().o());
        }
        int i = aoog.e;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new aood(arrayList, i2);
        }
        return aoog.M(new aopy(arrayList));
    }

    @Override // defpackage.aoob
    public final InputStream m() {
        return new aork(this);
    }

    @Override // defpackage.aoob
    protected final String n(Charset charset) {
        return new String(I(), charset);
    }

    @Override // defpackage.aoob
    public final ByteBuffer o() {
        throw null;
    }

    @Override // defpackage.aoob
    public final void p(aont aontVar) {
        this.e.p(aontVar);
        this.f.p(aontVar);
    }

    @Override // defpackage.aoob
    public final boolean q() {
        int j = this.e.j(0, 0, this.h);
        aoob aoobVar = this.f;
        return aoobVar.j(j, 0, aoobVar.d()) == 0;
    }

    @Override // defpackage.aoob
    public final aonx s() {
        return new aori(this);
    }

    Object writeReplace() {
        return aoob.B(I());
    }
}

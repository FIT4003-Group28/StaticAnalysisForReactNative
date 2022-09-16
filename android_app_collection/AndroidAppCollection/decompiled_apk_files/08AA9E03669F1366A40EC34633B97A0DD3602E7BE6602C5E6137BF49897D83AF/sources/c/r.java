package c;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentedByteString.java */
/* loaded from: classes.dex */
public final class r extends f {
    final transient byte[][] f;
    final transient int[] g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(c cVar, int i) {
        super(null);
        v.a(cVar.f1283b, 0L, i);
        int i2 = 0;
        p pVar = cVar.f1282a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (pVar.f1321c == pVar.f1320b) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += pVar.f1321c - pVar.f1320b;
            i4++;
            pVar = pVar.f;
        }
        this.f = new byte[i4];
        this.g = new int[i4 * 2];
        p pVar2 = cVar.f1282a;
        int i5 = 0;
        while (i2 < i) {
            this.f[i5] = pVar2.f1319a;
            i2 += pVar2.f1321c - pVar2.f1320b;
            if (i2 > i) {
                i2 = i;
            }
            this.g[i5] = i2;
            this.g[this.f.length + i5] = pVar2.f1320b;
            pVar2.f1322d = true;
            i5++;
            pVar2 = pVar2.f;
        }
    }

    @Override // c.f
    public String a() {
        return j().a();
    }

    @Override // c.f
    public String b() {
        return j().b();
    }

    @Override // c.f
    public String f() {
        return j().f();
    }

    @Override // c.f
    public f g() {
        return j().g();
    }

    @Override // c.f
    public f c() {
        return j().c();
    }

    @Override // c.f
    public f d() {
        return j().d();
    }

    @Override // c.f
    public f e() {
        return j().e();
    }

    @Override // c.f
    public f a(int i, int i2) {
        return j().a(i, i2);
    }

    @Override // c.f
    public byte a(int i) {
        v.a(this.g[this.f.length - 1], i, 1L);
        int b2 = b(i);
        return this.f[b2][(i - (b2 == 0 ? 0 : this.g[b2 - 1])) + this.g[this.f.length + b2]];
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // c.f
    public int h() {
        return this.g[this.f.length - 1];
    }

    @Override // c.f
    public byte[] i() {
        byte[] bArr = new byte[this.g[this.f.length - 1]];
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.g[length + i];
            int i4 = this.g[i];
            System.arraycopy(this.f[i], i3, bArr, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.f
    public void a(c cVar) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.g[length + i];
            int i4 = this.g[i];
            p pVar = new p(this.f[i], i3, (i3 + i4) - i2);
            if (cVar.f1282a == null) {
                pVar.g = pVar;
                pVar.f = pVar;
                cVar.f1282a = pVar;
            } else {
                cVar.f1282a.g.a(pVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f1283b += i2;
    }

    @Override // c.f
    public boolean a(int i, f fVar, int i2, int i3) {
        if (i < 0 || i > h() - i3) {
            return false;
        }
        int b2 = b(i);
        while (i3 > 0) {
            int i4 = b2 == 0 ? 0 : this.g[b2 - 1];
            int min = Math.min(i3, ((this.g[b2] - i4) + i4) - i);
            if (!fVar.a(i2, this.f[b2], (i - i4) + this.g[this.f.length + b2], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b2++;
        }
        return true;
    }

    @Override // c.f
    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > h() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b2 = b(i);
        while (i3 > 0) {
            int i4 = b2 == 0 ? 0 : this.g[b2 - 1];
            int min = Math.min(i3, ((this.g[b2] - i4) + i4) - i);
            if (!v.a(this.f[b2], (i - i4) + this.g[this.f.length + b2], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b2++;
        }
        return true;
    }

    private f j() {
        return new f(i());
    }

    @Override // c.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.h() == h() && a(0, fVar, 0, h())) {
                return true;
            }
        }
        return false;
    }

    @Override // c.f
    public int hashCode() {
        int i = this.f1288d;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int i5 = this.g[length + i2];
            int i6 = this.g[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f1288d = i4;
        return i4;
    }

    @Override // c.f
    public String toString() {
        return j().toString();
    }
}

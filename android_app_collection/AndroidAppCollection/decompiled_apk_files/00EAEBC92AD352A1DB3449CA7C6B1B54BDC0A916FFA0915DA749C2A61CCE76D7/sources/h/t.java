package h;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t extends f {

    /* renamed from: g  reason: collision with root package name */
    final transient byte[][] f10199g;

    /* renamed from: h  reason: collision with root package name */
    final transient int[] f10200h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(c cVar, int i) {
        super(null);
        x.a(cVar.f10134c, 0L, i);
        int i2 = 0;
        r rVar = cVar.f10133b;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = rVar.f10192c;
            int i6 = rVar.f10191b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            rVar = rVar.f10195f;
        }
        this.f10199g = new byte[i4];
        this.f10200h = new int[i4 * 2];
        r rVar2 = cVar.f10133b;
        int i7 = 0;
        while (i2 < i) {
            this.f10199g[i7] = rVar2.f10190a;
            i2 += rVar2.f10192c - rVar2.f10191b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f10200h;
            iArr[i7] = i2;
            iArr[this.f10199g.length + i7] = rVar2.f10191b;
            rVar2.f10193d = true;
            i7++;
            rVar2 = rVar2.f10195f;
        }
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.f10200h, 0, this.f10199g.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private f n() {
        return new f(i());
    }

    @Override // h.f
    public byte a(int i) {
        x.a(this.f10200h[this.f10199g.length - 1], i, 1L);
        int b2 = b(i);
        int i2 = b2 == 0 ? 0 : this.f10200h[b2 - 1];
        int[] iArr = this.f10200h;
        byte[][] bArr = this.f10199g;
        return bArr[b2][(i - i2) + iArr[bArr.length + b2]];
    }

    @Override // h.f
    public f a(int i, int i2) {
        return n().a(i, i2);
    }

    @Override // h.f
    public String a() {
        return n().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // h.f
    public void a(c cVar) {
        int length = this.f10199g.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f10200h;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            r rVar = new r(this.f10199g[i], i3, (i3 + i4) - i2, true, false);
            r rVar2 = cVar.f10133b;
            if (rVar2 == null) {
                rVar.f10196g = rVar;
                rVar.f10195f = rVar;
                cVar.f10133b = rVar;
            } else {
                rVar2.f10196g.a(rVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f10134c += i2;
    }

    @Override // h.f
    public boolean a(int i, f fVar, int i2, int i3) {
        if (i < 0 || i > g() - i3) {
            return false;
        }
        int b2 = b(i);
        while (i3 > 0) {
            int i4 = b2 == 0 ? 0 : this.f10200h[b2 - 1];
            int min = Math.min(i3, ((this.f10200h[b2] - i4) + i4) - i);
            int[] iArr = this.f10200h;
            byte[][] bArr = this.f10199g;
            if (!fVar.a(i2, bArr[b2], (i - i4) + iArr[bArr.length + b2], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b2++;
        }
        return true;
    }

    @Override // h.f
    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b2 = b(i);
        while (i3 > 0) {
            int i4 = b2 == 0 ? 0 : this.f10200h[b2 - 1];
            int min = Math.min(i3, ((this.f10200h[b2] - i4) + i4) - i);
            int[] iArr = this.f10200h;
            byte[][] bArr2 = this.f10199g;
            if (!x.a(bArr2[b2], (i - i4) + iArr[bArr2.length + b2], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b2++;
        }
        return true;
    }

    @Override // h.f
    public String b() {
        return n().b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // h.f
    public byte[] c() {
        return i();
    }

    @Override // h.f
    public f d() {
        return n().d();
    }

    @Override // h.f
    public f e() {
        return n().e();
    }

    @Override // h.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.g() == g() && a(0, fVar, 0, g())) {
                return true;
            }
        }
        return false;
    }

    @Override // h.f
    public f f() {
        return n().f();
    }

    @Override // h.f
    public int g() {
        return this.f10200h[this.f10199g.length - 1];
    }

    @Override // h.f
    public f h() {
        return n().h();
    }

    @Override // h.f
    public int hashCode() {
        int i = this.f10147c;
        if (i != 0) {
            return i;
        }
        int length = this.f10199g.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f10199g[i2];
            int[] iArr = this.f10200h;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f10147c = i3;
        return i3;
    }

    @Override // h.f
    public byte[] i() {
        int[] iArr = this.f10200h;
        byte[][] bArr = this.f10199g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f10200h;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f10199g[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // h.f
    public String m() {
        return n().m();
    }

    @Override // h.f
    public String toString() {
        return n().toString();
    }
}

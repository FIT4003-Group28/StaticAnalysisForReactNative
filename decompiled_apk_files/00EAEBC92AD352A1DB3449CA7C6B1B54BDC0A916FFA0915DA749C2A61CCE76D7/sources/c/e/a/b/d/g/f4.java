package c.e.a.b.d.g;

import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f4 extends c4 {

    /* renamed from: e  reason: collision with root package name */
    protected final byte[] f4149e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f4(byte[] bArr) {
        if (bArr != null) {
            this.f4149e = bArr;
            return;
        }
        throw new NullPointerException();
    }

    @Override // c.e.a.b.d.g.v3
    public byte a(int i) {
        return this.f4149e[i];
    }

    @Override // c.e.a.b.d.g.v3
    protected final int a(int i, int i2, int i3) {
        return e5.a(i, this.f4149e, g(), i3);
    }

    @Override // c.e.a.b.d.g.v3
    public final v3 a(int i, int i2) {
        int b2 = v3.b(0, i2, f());
        return b2 == 0 ? v3.f4474c : new y3(this.f4149e, g(), b2);
    }

    @Override // c.e.a.b.d.g.v3
    protected final String a(Charset charset) {
        return new String(this.f4149e, g(), f(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.e.a.b.d.g.v3
    public final void a(s3 s3Var) {
        s3Var.a(this.f4149e, g(), f());
    }

    @Override // c.e.a.b.d.g.v3
    public final boolean a() {
        int g2 = g();
        return c8.a(this.f4149e, g2, f() + g2);
    }

    final boolean a(v3 v3Var, int i, int i2) {
        if (i2 > v3Var.f()) {
            int f2 = f();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(f2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > v3Var.f()) {
            int f3 = v3Var.f();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(f3);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(v3Var instanceof f4)) {
            return v3Var.a(0, i2).equals(a(0, i2));
        } else {
            f4 f4Var = (f4) v3Var;
            byte[] bArr = this.f4149e;
            byte[] bArr2 = f4Var.f4149e;
            int g2 = g() + i2;
            int g3 = g();
            int g4 = f4Var.g();
            while (g3 < g2) {
                if (bArr[g3] != bArr2[g4]) {
                    return false;
                }
                g3++;
                g4++;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.e.a.b.d.g.v3
    public byte b(int i) {
        return this.f4149e[i];
    }

    @Override // c.e.a.b.d.g.v3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v3) || f() != ((v3) obj).f()) {
            return false;
        }
        if (f() == 0) {
            return true;
        }
        if (!(obj instanceof f4)) {
            return obj.equals(this);
        }
        f4 f4Var = (f4) obj;
        int k = k();
        int k2 = f4Var.k();
        if (k != 0 && k2 != 0 && k != k2) {
            return false;
        }
        return a(f4Var, 0, f());
    }

    @Override // c.e.a.b.d.g.v3
    public int f() {
        return this.f4149e.length;
    }

    protected int g() {
        return 0;
    }
}

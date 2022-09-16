package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dspa  reason: default package */
/* loaded from: classes.dex */
public class dspa extends dsoz {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public dspa(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.dspd
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.dspd
    public byte b(int i) {
        return this.a[i];
    }

    @Override // defpackage.dspd
    public int c() {
        return this.a.length;
    }

    protected int d() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dspd
    public void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.dspd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dspd) || c() != ((dspd) obj).c()) {
            return false;
        }
        if (c() == 0) {
            return true;
        }
        if (obj instanceof dspa) {
            dspa dspaVar = (dspa) obj;
            int i = this.c;
            int i2 = dspaVar.c;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            return h(dspaVar, 0, c());
        }
        return obj.equals(this);
    }

    @Override // defpackage.dsoz
    public final boolean h(dspd dspdVar, int i, int i2) {
        if (i2 > dspdVar.c()) {
            int c = c();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > dspdVar.c()) {
            int c2 = dspdVar.c();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(c2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (dspdVar instanceof dspa) {
            dspa dspaVar = (dspa) dspdVar;
            byte[] bArr = this.a;
            byte[] bArr2 = dspaVar.a;
            int d = d() + i2;
            int d2 = d();
            int d3 = dspaVar.d() + i;
            while (d2 < d) {
                if (bArr[d2] != bArr2[d3]) {
                    return false;
                }
                d2++;
                d3++;
            }
            return true;
        } else {
            return dspdVar.i(i, i3).equals(i(0, i2));
        }
    }

    @Override // defpackage.dspd
    public final dspd i(int i, int i2) {
        int O = O(i, i2, c());
        return O == 0 ? dspd.b : new dsov(this.a, d() + i, O);
    }

    @Override // defpackage.dspd
    public final void j(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a, d(), c());
    }

    @Override // defpackage.dspd
    public final ByteBuffer k() {
        return ByteBuffer.wrap(this.a, d(), c()).asReadOnlyBuffer();
    }

    @Override // defpackage.dspd
    public final void l(OutputStream outputStream) {
        outputStream.write(G());
    }

    @Override // defpackage.dspd
    public final void m(dsor dsorVar) {
        dsorVar.a(this.a, d(), c());
    }

    @Override // defpackage.dspd
    protected final String n(Charset charset) {
        return new String(this.a, d(), c(), charset);
    }

    @Override // defpackage.dspd
    public final boolean o() {
        int d = d();
        return dsuo.a(this.a, d, c() + d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dspd
    public final int p(int i, int i2, int i3) {
        int d = d() + i2;
        return dsuo.a.b(i, this.a, d, i3 + d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dspd
    public final int q(int i, int i2, int i3) {
        return dsrk.f(i, this.a, d() + i2, i3);
    }

    @Override // defpackage.dspd
    public final InputStream r() {
        return new ByteArrayInputStream(this.a, d(), c());
    }

    @Override // defpackage.dspd
    public final dspj s() {
        return dspj.P(this.a, d(), c());
    }
}

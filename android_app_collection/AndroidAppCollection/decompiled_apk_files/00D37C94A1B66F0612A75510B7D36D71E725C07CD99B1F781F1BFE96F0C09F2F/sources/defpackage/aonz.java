package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: aonz  reason: default package */
/* loaded from: classes.dex */
public class aonz extends aony {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public aonz(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.aoob
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.aoob
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.aoob
    public int d() {
        return this.a.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aoob
    public void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.aoob
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aoob) || d() != ((aoob) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (obj instanceof aonz) {
            aonz aonzVar = (aonz) obj;
            int i = this.c;
            int i2 = aonzVar.c;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            return g(aonzVar, 0, d());
        }
        return obj.equals(this);
    }

    @Override // defpackage.aony
    public final boolean g(aoob aoobVar, int i, int i2) {
        if (i2 > aoobVar.d()) {
            int d = d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > aoobVar.d()) {
            int d2 = aoobVar.d();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(d2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (aoobVar instanceof aonz) {
            aonz aonzVar = (aonz) aoobVar;
            byte[] bArr = this.a;
            byte[] bArr2 = aonzVar.a;
            int c = c() + i2;
            int c2 = c();
            int c3 = aonzVar.c() + i;
            while (c2 < c) {
                if (bArr[c2] != bArr2[c3]) {
                    return false;
                }
                c2++;
                c3++;
            }
            return true;
        } else {
            return aoobVar.k(i, i3).equals(k(0, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aoob
    public final int i(int i, int i2, int i3) {
        return aopv.d(i, this.a, c() + i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aoob
    public final int j(int i, int i2, int i3) {
        int c = c() + i2;
        byte[] bArr = this.a;
        aphq aphqVar = aosi.a;
        return aphq.p(i, bArr, c, i3 + c);
    }

    @Override // defpackage.aoob
    public final aoob k(int i, int i2) {
        int r = r(i, i2, d());
        return r == 0 ? aoob.b : new aonw(this.a, c() + i, r);
    }

    @Override // defpackage.aoob
    public final aoog l() {
        return aoog.Q(this.a, c(), d());
    }

    @Override // defpackage.aoob
    public final InputStream m() {
        return new ByteArrayInputStream(this.a, c(), d());
    }

    @Override // defpackage.aoob
    protected final String n(Charset charset) {
        return new String(this.a, c(), d(), charset);
    }

    @Override // defpackage.aoob
    public final ByteBuffer o() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // defpackage.aoob
    public final void p(aont aontVar) {
        aontVar.a(this.a, c(), d());
    }

    @Override // defpackage.aoob
    public final boolean q() {
        int c = c();
        return aosi.h(this.a, c, d() + c);
    }
}

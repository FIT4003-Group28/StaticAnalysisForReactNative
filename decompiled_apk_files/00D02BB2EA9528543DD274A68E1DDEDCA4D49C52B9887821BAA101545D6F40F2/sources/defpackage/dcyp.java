package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dcyp  reason: default package */
/* loaded from: classes.dex */
public abstract class dcyp implements dcza {
    @Override // defpackage.dcza
    public dcyz a(CharSequence charSequence, Charset charset) {
        return f().k(charSequence, charset).p();
    }

    @Override // defpackage.dcza
    public dcyz b(int i) {
        dczb d = d(4);
        d.h(i);
        return d.p();
    }

    @Override // defpackage.dcza
    public final dcyz c(byte[] bArr) {
        return e(bArr, bArr.length);
    }

    public dczb d(int i) {
        dbsk.e(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return f();
    }

    public dcyz e(byte[] bArr, int i) {
        dbsk.u(0, i, bArr.length);
        dczb d = d(i);
        d.g(bArr, i);
        return d.p();
    }
}

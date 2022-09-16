package defpackage;

import android.net.Uri;
import java.util.Map;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: ppq  reason: default package */
/* loaded from: classes4.dex */
final class ppq implements asv {
    private final asv a;
    private final int b;
    private final ppp c;
    private final byte[] d;
    private int e;

    public ppq(asv asvVar, int i, ppp pppVar) {
        ptx.c(i > 0);
        this.a = asvVar;
        this.b = i;
        this.c = pppVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.asv
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        ptx.a(atkVar);
        this.a.b(atkVar);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.a.g(this.d, 0, 1) != -1) {
                int i5 = (this.d[0] & PrivateKeyType.INVALID) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int g = this.a.g(bArr2, i4, i6);
                        if (g != -1) {
                            i4 += g;
                            i6 -= g;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        ppp pppVar = this.c;
                        pwu pwuVar = new pwu(bArr2, i5);
                        pqs pqsVar = (pqs) pppVar;
                        long max = !pqsVar.g ? pqsVar.c : Math.max(pqsVar.h.n(), pqsVar.c);
                        int a = pwuVar.a();
                        bab babVar = pqsVar.f;
                        ptx.a(babVar);
                        iy.e(babVar, pwuVar, a);
                        babVar.e(max, 1, a, 0, null);
                        pqsVar.g = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int g2 = this.a.g(bArr, i, Math.min(i3, i2));
        if (g2 != -1) {
            this.e -= g2;
        }
        return g2;
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.asv
    public final Uri i() {
        return this.a.i();
    }

    @Override // defpackage.asv
    public final void j() {
        throw new UnsupportedOperationException();
    }
}

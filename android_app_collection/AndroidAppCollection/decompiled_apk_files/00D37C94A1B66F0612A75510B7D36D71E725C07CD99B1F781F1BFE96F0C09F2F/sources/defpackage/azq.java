package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: azq  reason: default package */
/* loaded from: classes2.dex */
public final class azq {
    public final List a;
    public final int b;
    public final String c;

    private azq(List list, int i, String str) {
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public static azq a(pwu pwuVar) {
        try {
            pwuVar.H(21);
            int i = pwuVar.i() & 3;
            int i2 = pwuVar.i();
            int i3 = pwuVar.b;
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                pwuVar.H(1);
                int m = pwuVar.m();
                for (int i6 = 0; i6 < m; i6++) {
                    int m2 = pwuVar.m();
                    i4 += m2 + 4;
                    pwuVar.H(m2);
                }
            }
            pwuVar.G(i3);
            byte[] bArr = new byte[i4];
            String str = null;
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = pwuVar.i() & 127;
                int m3 = pwuVar.m();
                int i10 = 0;
                while (i10 < m3) {
                    int m4 = pwuVar.m();
                    System.arraycopy(pwo.a, 0, bArr, i7, 4);
                    int i11 = i7 + 4;
                    System.arraycopy(pwuVar.a, pwuVar.b, bArr, i11, m4);
                    if (i9 == 33 && i10 == 0) {
                        str = pvr.c(new pwv(bArr, i11, i11 + m4));
                        i10 = 0;
                    }
                    i7 = i11 + m4;
                    pwuVar.H(m4);
                    i10++;
                }
            }
            return new azq(i4 == 0 ? null : Collections.singletonList(bArr), i + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw pjq.a("Error parsing HEVC config", e);
        }
    }
}

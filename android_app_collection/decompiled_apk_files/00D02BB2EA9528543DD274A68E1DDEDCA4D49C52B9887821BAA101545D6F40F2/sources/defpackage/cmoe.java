package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmoe  reason: default package */
/* loaded from: classes5.dex */
public final class cmoe {
    public final List<byte[]> a;
    public final int b;

    private cmoe(List<byte[]> list, int i) {
        this.a = list;
        this.b = i;
    }

    public static cmoe a(cmnk cmnkVar) {
        try {
            cmnkVar.h(21);
            int l = cmnkVar.l() & 3;
            int l2 = cmnkVar.l();
            int i = cmnkVar.b;
            int i2 = 0;
            for (int i3 = 0; i3 < l2; i3++) {
                cmnkVar.h(1);
                int m = cmnkVar.m();
                for (int i4 = 0; i4 < m; i4++) {
                    int m2 = cmnkVar.m();
                    i2 += m2 + 4;
                    cmnkVar.h(m2);
                }
            }
            cmnkVar.f(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < l2; i6++) {
                cmnkVar.h(1);
                int m3 = cmnkVar.m();
                for (int i7 = 0; i7 < m3; i7++) {
                    int m4 = cmnkVar.m();
                    System.arraycopy(cmni.a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(cmnkVar.a, cmnkVar.b, bArr, i8, m4);
                    i5 = i8 + m4;
                    cmnkVar.h(m4);
                }
            }
            return new cmoe(i2 == 0 ? null : Collections.singletonList(bArr), l + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new clob("Error parsing HEVC config", e);
        }
    }
}

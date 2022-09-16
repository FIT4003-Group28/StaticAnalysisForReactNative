package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayq  reason: default package */
/* loaded from: classes2.dex */
public final class ayq {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    private ayq(List list, int i, int i2, int i3, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static ayq a(pwu pwuVar) {
        String str;
        int i;
        int i2;
        float f;
        try {
            pwuVar.H(4);
            int i3 = (pwuVar.i() & 3) + 1;
            if (i3 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int i4 = pwuVar.i() & 31;
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(b(pwuVar));
            }
            int i6 = pwuVar.i();
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList.add(b(pwuVar));
            }
            if (i4 > 0) {
                pwn c = pwo.c((byte[]) arrayList.get(0), i3, ((byte[]) arrayList.get(0)).length);
                int i8 = c.e;
                int i9 = c.f;
                float f2 = c.g;
                str = pvr.b(c.a, c.b, c.c);
                i = i8;
                i2 = i9;
                f = f2;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new ayq(arrayList, i3, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw pjq.a("Error parsing AVC config", e);
        }
    }

    private static byte[] b(pwu pwuVar) {
        int m = pwuVar.m();
        int i = pwuVar.b;
        pwuVar.H(m);
        byte[] bArr = pwuVar.a;
        byte[] bArr2 = pvr.a;
        byte[] bArr3 = new byte[m + 4];
        System.arraycopy(pvr.a, 0, bArr3, 0, 4);
        System.arraycopy(bArr, i, bArr3, 4, m);
        return bArr3;
    }
}

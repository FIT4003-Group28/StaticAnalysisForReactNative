package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmoa  reason: default package */
/* loaded from: classes5.dex */
public final class cmoa {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    private cmoa(List<byte[]> list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public static cmoa a(cmnk cmnkVar) {
        int i;
        int i2;
        float f;
        try {
            cmnkVar.h(4);
            int l = (cmnkVar.l() & 3) + 1;
            if (l == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int l2 = cmnkVar.l() & 31;
            for (int i3 = 0; i3 < l2; i3++) {
                arrayList.add(b(cmnkVar));
            }
            int l3 = cmnkVar.l();
            for (int i4 = 0; i4 < l3; i4++) {
                arrayList.add(b(cmnkVar));
            }
            if (l2 > 0) {
                cmnh b = cmni.b((byte[]) arrayList.get(0), l, ((byte[]) arrayList.get(0)).length);
                int i5 = b.e;
                int i6 = b.f;
                f = b.g;
                i = i5;
                i2 = i6;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new cmoa(arrayList, l, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new clob("Error parsing AVC config", e);
        }
    }

    private static byte[] b(cmnk cmnkVar) {
        int m = cmnkVar.m();
        int i = cmnkVar.b;
        cmnkVar.h(m);
        byte[] bArr = cmnkVar.a;
        byte[] bArr2 = cmmr.a;
        byte[] bArr3 = new byte[m + 4];
        System.arraycopy(cmmr.a, 0, bArr3, 0, 4);
        System.arraycopy(bArr, i, bArr3, 4, m);
        return bArr3;
    }
}

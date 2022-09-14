package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bnro  reason: default package */
/* loaded from: classes.dex */
public final class bnro {
    public int b;
    public int d;
    public final int[] a = new int[64];
    public final int[] c = new int[64];
    public boolean e = false;
    public boolean f = false;
    public float g = 0.0f;
    public float h = 0.0f;

    public final void a(List<bnrp> list) {
        this.b = Math.min(list.size(), 16);
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            bnrp bnrpVar = list.get(i2);
            int i3 = bnrpVar.a;
            int[] iArr = this.a;
            int i4 = i + 1;
            iArr[i] = (i3 >>> 16) + (true != bnrpVar.c ? 0 : 131072);
            int i5 = i4 + 1;
            iArr[i4] = (char) i3;
            int i6 = bnrpVar.b;
            int i7 = i5 + 1;
            iArr[i5] = i6 >>> 16;
            i = i7 + 1;
            iArr[i7] = (char) i6;
        }
    }
}

package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: pbi  reason: default package */
/* loaded from: classes4.dex */
public final class pbi implements pbl {
    private final byte[] a;
    private int b;
    private int c;

    public pbi(byte[] bArr) {
        pce.a(bArr);
        pce.b(bArr.length > 0);
        this.a = bArr;
    }

    @Override // defpackage.pbl
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.a, this.b, bArr, i, min);
        this.b += min;
        this.c -= min;
        return min;
    }

    @Override // defpackage.pbl
    public final long b(pbn pbnVar) {
        long j = pbnVar.d;
        int i = (int) j;
        this.b = i;
        long j2 = pbnVar.e;
        int length = (int) (j2 == -1 ? this.a.length - j : j2);
        this.c = length;
        if (length <= 0 || i + length > this.a.length) {
            int length2 = this.a.length;
            StringBuilder sb = new StringBuilder(77);
            sb.append("Unsatisfiable range: [");
            sb.append(i);
            sb.append(", ");
            sb.append(j2);
            sb.append("], length: ");
            sb.append(length2);
            throw new IOException(sb.toString());
        }
        return length;
    }

    @Override // defpackage.pbl
    public final void c() {
    }
}

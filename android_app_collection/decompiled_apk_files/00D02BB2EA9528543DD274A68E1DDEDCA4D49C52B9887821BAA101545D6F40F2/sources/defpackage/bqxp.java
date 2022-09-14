package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bqxp  reason: default package */
/* loaded from: classes4.dex */
public final class bqxp implements Iterator<dfnx> {
    private final dzkd a;
    private int b = 0;
    private int c = 0;

    public bqxp(dzkd dzkdVar) {
        this.a = dzkdVar;
    }

    private static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public final void a(dfnx dfnxVar) {
        long j;
        this.b += b(this.a.a());
        long b = this.c + b(this.a.a());
        if (b > -18000000) {
            if (b > 18000000) {
                j = -36000000;
            }
            int i = (int) b;
            this.c = i;
            dfnxVar.a = this.b;
            dfnxVar.b = i;
        }
        j = 36000000;
        b += j;
        int i2 = (int) b;
        this.c = i2;
        dfnxVar.a = this.b;
        dfnxVar.b = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ dfnx next() {
        dfnx dfnxVar = new dfnx();
        a(dfnxVar);
        return dfnxVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

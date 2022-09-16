package defpackage;
/* compiled from: PG */
/* renamed from: afgo  reason: default package */
/* loaded from: classes.dex */
public final class afgo implements afgq {
    public final int a;
    final aepf b;
    final long c;
    final long d;

    public afgo(int i, int i2, int i3, aepf aepfVar) {
        this.a = i3;
        this.b = aepfVar;
        long j = 11000000;
        if (i == -1) {
            if (i2 == -1) {
                this.c = 11000000L;
                this.d = 10000000L;
                return;
            }
            i = -1;
        }
        if (i == -1) {
            this.c = Long.MAX_VALUE;
        } else {
            this.c = i >= 0 ? i * 1000 : j;
        }
        if (i2 == -1) {
            this.d = Long.MAX_VALUE;
        } else if (i2 < 0) {
            this.d = 10000000L;
        } else {
            this.d = i2 * 1000;
        }
    }

    @Override // defpackage.afgq
    public final int a(int i, ayy ayyVar) {
        if (i < 0 || ayyVar == null) {
            return this.a;
        }
        long max = Math.max(this.b.e(), 1L);
        long j = 0;
        int i2 = i;
        long j2 = 0;
        while (i2 < ayyVar.a) {
            long j3 = (ayyVar.b[i2] * 8000000) / max;
            j += ayyVar.d[i2];
            if (j > this.c) {
                break;
            }
            j2 += j3;
            if (j2 > this.d) {
                break;
            }
            i2++;
        }
        return Math.max(i2 - i, 1);
    }
}

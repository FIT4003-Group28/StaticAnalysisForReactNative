package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vuw  reason: default package */
/* loaded from: classes4.dex */
public final class vuw implements Iterable, Comparable {
    public final int a;
    public final int b;
    final /* synthetic */ vux c;
    private final int d;

    public vuw(vux vuxVar, int i, int i2, int i3) {
        this.c = vuxVar;
        viu.g(i, vuxVar.b.length);
        this.a = i;
        boolean z = false;
        if (i2 > 0 && i + i2 <= vuxVar.b.length) {
            z = true;
        }
        viu.b(z);
        this.b = i2;
        this.d = i3;
    }

    public final long a() {
        vux vuxVar = this.c;
        long l = vuxVar.a.l(vuxVar.b[this.a]);
        vux vuxVar2 = this.c;
        long l2 = vuxVar2.a.l(vuxVar2.b[(this.a + this.b) - 1]);
        vux vuxVar3 = this.c;
        long j = vuxVar3.e;
        if (j > l) {
            long j2 = vuxVar3.d;
            if (j2 < l2) {
                long l3 = vuxVar3.a.l(vuxVar3.b[this.a]);
                vux vuxVar4 = this.c;
                return Math.abs((j2 + ((j - j2) / 2)) - (l3 + ((vuxVar4.a.l(vuxVar4.b[(this.a + this.b) - 1]) - l3) / 2))) - Long.MIN_VALUE;
            }
        }
        return this.d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        vuw vuwVar = (vuw) obj;
        long a = a();
        long a2 = vuwVar.a();
        if (a != a2) {
            return a >= a2 ? -1 : 1;
        }
        int i = this.a;
        int i2 = vuwVar.a;
        if (i < i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new vqd(this.c.b, this.a, this.b);
    }
}

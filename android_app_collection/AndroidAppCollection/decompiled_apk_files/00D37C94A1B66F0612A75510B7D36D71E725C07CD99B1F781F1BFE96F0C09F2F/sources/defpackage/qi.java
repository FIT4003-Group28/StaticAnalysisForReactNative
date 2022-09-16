package defpackage;

import android.util.SparseBooleanArray;
/* compiled from: PG */
/* renamed from: qi  reason: default package */
/* loaded from: classes4.dex */
final class qi implements qz {
    public rb a;
    final SparseBooleanArray b = new SparseBooleanArray();
    public int c;
    public int d;
    public int e;
    public int f;
    final /* synthetic */ ql g;

    public qi(ql qlVar) {
        this.g = qlVar;
    }

    public final int a(int i) {
        return i - (i % this.g.b);
    }

    @Override // defpackage.qz
    public final void b(rb rbVar) {
        throw null;
    }

    public final void c(int i) {
        this.b.delete(i);
        ((qu) this.g.f).a(qy.a(3, this.c, i));
    }

    public final void d(int i, int i2, int i3, boolean z) {
        int i4 = i;
        while (i4 <= i2) {
            ((qw) this.g.g).a(qy.a(3, z ? (i2 + i) - i4 : i4, i3));
            i4 += this.g.b;
        }
    }
}

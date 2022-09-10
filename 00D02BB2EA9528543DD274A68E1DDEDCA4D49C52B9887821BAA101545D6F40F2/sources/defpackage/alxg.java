package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alxg  reason: default package */
/* loaded from: classes2.dex */
public final class alxg implements Iterator<Integer> {
    final /* synthetic */ alxh a;
    private final alxf b;
    private final int c;
    private final int d;
    private int e;
    private int f;

    public alxg(alxh alxhVar, akrp akrpVar, int i, int i2) {
        this.a = alxhVar;
        dbsk.a(i <= i2);
        this.b = new alxf(alxhVar, akrpVar, alxhVar.j(i));
        this.c = i;
        this.d = i2;
        this.e = -1;
        this.f = -1;
        b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e >= 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final void b() {
        int i = this.e;
        int i2 = this.d;
        if (i < i2 && i < this.f) {
            this.e = i + 1;
        } else if (i >= i2 || !this.b.hasNext()) {
            this.e = -1;
            this.f = -1;
        } else {
            int i3 = this.a.i(this.b.next().intValue());
            this.e = Math.max(i3, this.c);
            this.f = Math.min(i3 + 8, this.a.c.l() - 1);
        }
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final Integer next() {
        if (hasNext()) {
            int i = this.e;
            b();
            return Integer.valueOf(i);
        }
        throw new IndexOutOfBoundsException();
    }
}

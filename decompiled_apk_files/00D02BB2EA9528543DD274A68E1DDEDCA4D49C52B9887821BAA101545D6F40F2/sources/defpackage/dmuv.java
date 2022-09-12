package defpackage;
/* compiled from: PG */
/* renamed from: dmuv  reason: default package */
/* loaded from: classes.dex */
final class dmuv extends dmvv<dmvh> {
    int a = 0;
    final /* synthetic */ dmuw b;

    public dmuv(dmuw dmuwVar) {
        this.b = dmuwVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmuw dmuwVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmuwVar.e(i);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dmuj  reason: default package */
/* loaded from: classes6.dex */
final class dmuj extends dmvv<dmul> {
    int a = 0;
    final /* synthetic */ dmuk b;

    public dmuj(dmuk dmukVar) {
        this.b = dmukVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.c.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmuk dmukVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmukVar.f(i);
    }
}

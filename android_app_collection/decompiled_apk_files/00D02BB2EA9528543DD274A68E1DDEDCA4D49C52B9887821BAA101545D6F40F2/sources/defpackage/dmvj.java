package defpackage;
/* compiled from: PG */
/* renamed from: dmvj  reason: default package */
/* loaded from: classes.dex */
final class dmvj extends dmvv<dmum> {
    int a = 0;
    final /* synthetic */ dmvl b;

    public dmvj(dmvl dmvlVar) {
        this.b = dmvlVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmvl dmvlVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmvlVar.x(i);
    }
}

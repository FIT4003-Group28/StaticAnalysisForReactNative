package defpackage;
/* compiled from: PG */
/* renamed from: dmub  reason: default package */
/* loaded from: classes.dex */
final class dmub extends dmvv<dmut> {
    int a = 0;
    final /* synthetic */ dmue b;

    public dmub(dmue dmueVar) {
        this.b = dmueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.c.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmue dmueVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmueVar.g(i);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dmts  reason: default package */
/* loaded from: classes.dex */
final class dmts extends dmvv<dmvf> {
    int a = 0;
    final /* synthetic */ dmue b;

    public dmts(dmue dmueVar) {
        this.b = dmueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.g.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmue dmueVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmueVar.m(i);
    }
}

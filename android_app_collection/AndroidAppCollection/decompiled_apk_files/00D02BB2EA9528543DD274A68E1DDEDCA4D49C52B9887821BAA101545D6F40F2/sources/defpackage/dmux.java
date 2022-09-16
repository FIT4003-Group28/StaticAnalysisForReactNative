package defpackage;
/* compiled from: PG */
/* renamed from: dmux  reason: default package */
/* loaded from: classes6.dex */
final class dmux extends dmvv<dmun> {
    int a = 0;
    final /* synthetic */ dmuy b;

    public dmux(dmuy dmuyVar) {
        this.b = dmuyVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmuy dmuyVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmuyVar.g(i);
    }
}

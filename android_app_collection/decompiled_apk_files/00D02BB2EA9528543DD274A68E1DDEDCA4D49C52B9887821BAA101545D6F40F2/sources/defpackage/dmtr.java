package defpackage;
/* compiled from: PG */
/* renamed from: dmtr  reason: default package */
/* loaded from: classes.dex */
final class dmtr extends dmvv<dmvx> {
    int a = 0;
    final /* synthetic */ dmue b;

    public dmtr(dmue dmueVar) {
        this.b = dmueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.f.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmue dmueVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmueVar.l(i);
    }
}

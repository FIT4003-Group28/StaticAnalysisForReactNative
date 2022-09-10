package defpackage;
/* compiled from: PG */
/* renamed from: dmua  reason: default package */
/* loaded from: classes.dex */
final class dmua extends dmvv<dmtn> {
    int a = 0;
    final /* synthetic */ dmue b;

    public dmua(dmue dmueVar) {
        this.b = dmueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.b.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmue dmueVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmueVar.f(i);
    }
}

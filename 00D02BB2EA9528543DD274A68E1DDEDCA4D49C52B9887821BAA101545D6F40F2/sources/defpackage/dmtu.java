package defpackage;
/* compiled from: PG */
/* renamed from: dmtu  reason: default package */
/* loaded from: classes.dex */
final class dmtu extends dmvv<dmvh> {
    int a = 0;
    final /* synthetic */ dmue b;

    public dmtu(dmue dmueVar) {
        this.b = dmueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.i.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmue dmueVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmueVar.o(i);
    }
}
